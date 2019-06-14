import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.LGC.jpa.AllorNothing;

import com.LGC.jpa.pick3Obj;

public class UpdateMassAllorNothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
// Read files form local or FTP
		
		
		List<AllorNothing> AllorNothingLst = new ArrayList();
		
		File file = new File("/Users/baps/Documents/LGC/ARN/Arn.txt");
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

				AllorNothing AllorNothing = AllorNothing(attributes);
				AllorNothingLst.add(AllorNothing);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("LGC");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
for (AllorNothing AllorNot: AllorNothingLst) {
	
	em.persist(AllorNot);
	
}
		
em.getTransaction().commit();	
em.close();		
		
		
		
		
	}
	
	
private static AllorNothing AllorNothing(String[] metadata) {
		
	String id;
	String type;
	Calendar drawdate=null;
	int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");	
	 Calendar calendar = new GregorianCalendar(Integer.parseInt(metadata[3]),(Integer.parseInt(metadata[1])-1),Integer.parseInt(metadata[2])); 
//	Calendar calendar = new GregorianCalendar(2013,01,31);
	calendar.setTimeZone(TimeZone.getTimeZone("GMT-5:00"));
	sdf.setTimeZone(TimeZone.getTimeZone("GMT-5:00"));
	
	
	id = metadata[0]+"-"+metadata[3]+"-"+metadata[1]+"-"+metadata[2];
	type  = metadata[0];
	drawdate = calendar;
	drawdate.setTimeZone(TimeZone.getTimeZone("GMT-5:00"));
	n1=Integer.parseInt(metadata[4]);
	n2=Integer.parseInt(metadata[5]);
	n3=Integer.parseInt(metadata[6]);
	n4=Integer.parseInt(metadata[7]);
	n5=Integer.parseInt(metadata[8]);
	n6=Integer.parseInt(metadata[9]);
	n7=Integer.parseInt(metadata[10]);
	n8=Integer.parseInt(metadata[11]);
	n9=Integer.parseInt(metadata[12]);
	n10=Integer.parseInt(metadata[13]);
	n11=Integer.parseInt(metadata[14]);
	n12=Integer.parseInt(metadata[15]);
	


		System.out.println(
		id +","+
		type+","+
		sdf.format(drawdate.getTime())+","+
		n1+","+
		n2+","+
		n3+","+
		n4+","+
		n5+","+
		n6+","+
		n7+","+
		n8+","+
		n9+","+
		n10+","+
		n11+","+
		n12	);
		
		return new AllorNothing(id, type,drawdate,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12);
	}
	



}
