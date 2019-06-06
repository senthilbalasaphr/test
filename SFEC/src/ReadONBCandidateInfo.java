import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.olingo.odata2.api.edm.Edm;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.ep.feed.ODataFeed;
import org.apache.olingo.odata2.api.exception.ODataException;

public class ReadONBCandidateInfo {

	public static final String APPLICATION_JSON = "application/json";
	
	public static void main(String[] args) throws IOException, ODataException {
		// TODO Auto-generated method stub

		String serviceUrl = "https://api8preview.sapsf.com/odata/v2/OnboardingCandidateInfo";

		String usedFormat = APPLICATION_JSON;

		OlingoV2Main app = new OlingoV2Main();
		Edm edm = app.readEdmSf( serviceUrl, "SFEC_EE_OASS@freemantest", "SFEC_EE_OASS01");


		ODataFeed Fed = app.readFeedSf(edm, serviceUrl, usedFormat, "OnboardingCandidateInfo","SFEC_EE_OASS@freemantest", "SFEC_EE_OASS01");

	
		String pernr=null;
		String key;
		String value;
		String userId=null;
		String cust_W4OnToEC=null;
		String cust_W4OnToECState=null;
		String managerId=null;
		String applicantId=null;
		ArrayList<ONBCandidateInfo> ONBCandidateInfoLst = new ArrayList();
		
		 for (ODataEntry entry : Fed.getEntries()) {
			 Map<String, Object> properties = entry.getProperties();
			 Set<Entry<String, Object>> entries = properties.entrySet();
			 userId=null;
			 cust_W4OnToEC=null;
			 cust_W4OnToECState=null;
			 for (Entry<String, Object> entry1 : entries) {
				 key = entry1.getKey();

				 if (key!=null) {
					 if (key.equalsIgnoreCase("userId") && entry1.getValue()!= null) {
						 userId = entry1.getValue().toString();
				//		 System.out.println(userId);
					 }
					 if (key.equalsIgnoreCase("cust_W4OnToEC") && entry1.getValue()!= null) {
						 cust_W4OnToEC = entry1.getValue().toString();
				//		 System.out.println(cust_W4OnToEC);
					 }
					 if (key.equalsIgnoreCase("cust_W4OnToECState") && entry1.getValue()!= null) 
						 cust_W4OnToECState = entry1.getValue().toString();
					 if (key.equalsIgnoreCase("applicantId") && entry1.getValue()!= null) 
						 applicantId = entry1.getValue().toString();
					 if (key.equalsIgnoreCase("managerId") && entry1.getValue()!= null) 
						 managerId = entry1.getValue().toString();
						 
				 }
					 
			 }
				 
			 
//				 if (entry1.getKey().equalsIgnoreCase("cust_W4OnToECState") && entry1.getValue().toString().equalsIgnoreCase("Pending"))
//				 {
//				 System.out.print (pernr + entry1.getKey()+":");
//				
//				 
//				 if (entry1.getValue() instanceof Calendar ) {
//				 Calendar cal = (Calendar) entry1.getValue();
//				 Object value = SimpleDateFormat.getInstance().format(cal.getTime());
//				 System.out.print(value);
//				 
//			 }else {
//				 System.out.print(entry1.getValue()+",   ");
//			 }
//			
//		    }
			 
			 
			 ONBCandidateInfoLst.add(new ONBCandidateInfo(userId,cust_W4OnToEC,cust_W4OnToECState,applicantId,managerId));
			 
			// System.out.println("-----------");
		 }
		 
		
			
			
		 for (ONBCandidateInfo onb: ONBCandidateInfoLst) {
			 if (onb.getCust_W4OnToECState()!= null && onb.getCust_W4OnToECState().equalsIgnoreCase("Pending")) {
			 System.out.println(onb.getApplicantId()+","+onb.getManagerId()+","+onb.getUserId()+","+onb.getCust_W4OnToEC()+","+onb.getCust_W4OnToECState());

			 String Status=null;
				Map<String, Object> data = new HashMap<String, Object>();
				
			 data.put("applicantId", onb.getApplicantId());
		//	 data.put("managerId", onb.getManagerId());
			 data.put("cust_W4OnToECState", "");
			 
			 ODataEntry createdEntry=null;
			    try {
			    	Status = app.createEntrySf(edm, serviceUrl, usedFormat, "OnboardingCandidateInfo", data,"SFEC_EE_OASS@freemantest", "SFEC_EE_OASS01");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
			    System.out.println(Status);
			    
			 }
			 
		 }
		

					 }	
	 
		
		 }
	
	


