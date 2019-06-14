package com.sf.Olingo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.olingo.odata2.api.edm.Edm;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.exception.ODataException;

public class Updatecust_W4IntegrationONBMapping {
	
	public static final String APPLICATION_JSON = "application/json";
	public static String serviceUrl =null;
	public static String usedFormat=null;
	public static Edm edm=null;
	public static OlingoV2Main app;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 serviceUrl = "https://api8preview.sapsf.com/odata/v2/cust_W4IntegrationONBMapping";
		 usedFormat = APPLICATION_JSON;
		

		 app = new OlingoV2Main();
		
		try {
			edm = app.readEdmSf(serviceUrl, "SFEC_EE_OASS@freemantest", "SFEC_EE_OASS01");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ODataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// Read files form local or FTP
		
		
		List<W4IntegrationONBMapping> W4MappingLst = new ArrayList();
		
		File file = new File("/Users/baps/Documents/FREEMAN/Workspace/w4 state forms/Mapping.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while ((line = br.readLine()) != null) {
				// process the line

				String[] attributes = line.split("\t");

				W4IntegrationONBMapping W4Mapping = createW4IntegrationONBMapping(attributes);
				W4MappingLst.add(W4Mapping);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


//Read record and update
		
		for (W4IntegrationONBMapping ONBMapping : W4MappingLst) {
			update(ONBMapping);
			
		}
	
	

	}

private static W4IntegrationONBMapping createW4IntegrationONBMapping(String[] metadata) {
	

	
	String externalCode;
	String externalName;
	String State;
	String ONBField;
	String ECField;
	String valueMapCode=null;
	
	externalCode = metadata[0];
	externalName = metadata[1];
	State = metadata[2];
	ONBField = metadata[3];
	ECField = metadata[4];
	if ( metadata.length > 5)
	valueMapCode = metadata[5];


	
	return new W4IntegrationONBMapping (externalCode, externalName, State,ONBField,ECField,valueMapCode);
}


public static void update(W4IntegrationONBMapping ONBMapping )
{

	String Status=null;
	Map<String, Object> data = new HashMap<String, Object>();
//	data.put("__metadata", "{uri:cust_W4IntegrationONBMapping}");
    data.put("externalCode", ONBMapping.getExternalCode());
    data.put("externalName", ONBMapping.getExternalName());
    data.put("cust_State", ONBMapping.getState());
    data.put("cust_ONBField", ONBMapping.getONBField());
    data.put("cust_ECField", ONBMapping.getECField());
    data.put("cust_valueMapCode", ONBMapping.getValueMapCode());
 		    
    ODataEntry createdEntry=null;
    try {
    	Status = app.createEntrySf(edm, serviceUrl, usedFormat, "cust_W4IntegrationONBMapping", data,"SFEC_EE_OASS@freemantest", "SFEC_EE_OASS01");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

    System.out.println(Status);


}




}
