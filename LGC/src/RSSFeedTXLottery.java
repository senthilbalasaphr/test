import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class RSSFeedTXLottery {

	public static void main(String[] args) throws IOException, IllegalArgumentException, FeedException {
		// TODO Auto-generated method stub

		URL url = new URL("https://www.txlottery.org/export/sites/lottery/rss/tlc_latest.xml");
		XmlReader xmlReader = null;

		try {

			xmlReader = new XmlReader(url);
			SyndFeed feeder = new SyndFeedInput().build(xmlReader);
			System.out.println("Title Value " + feeder.getAuthor());

			List<String> result = new ArrayList();

			for (Iterator iterator = feeder.getEntries().iterator(); iterator.hasNext();) {
				SyndEntry syndEntry = (SyndEntry) iterator.next();

				
//************All or nothing Morning
				String id; String type; Calendar drawdate; int n1; int n2; int n3; int n4; int n5; int n6;
				int n7;int n8; int n9; int n10; int n11; int n12;
				
				if (syndEntry.getTitle().startsWith("All or Nothing Morning")) {

			
					String d[] = 	syndEntry.getTitle().split("All or Nothing Morning Winning Numbers for");
					String dt[] = d[1].trim().split("/");
					System.out.println(d[1].trim());
					
					id=syndEntry.getTitle();
					type = "All or Nothing Morning";
					drawdate = new GregorianCalendar((Integer.parseInt(dt[2])-1),Integer.parseInt(dt[1]),Integer.parseInt(dt[0])); 
					String value = syndEntry.getDescription().getValue();
					System.out.println(drawdate.getTime());
					String res[] = value.split("-");

					result = Arrays.asList(res);

					for (String res1 : result) {
						System.out.println(res1.trim());  // Update to DB here

					}

				}
				
//************All or nothing day				
				
				if (syndEntry.getTitle().startsWith("All or Nothing Day")) {

					
					String d[] = 	syndEntry.getTitle().split("All or Nothing Day Winning Numbers for");
					String dt[] = d[1].trim().split("/");
					System.out.println(d[1].trim());
					
					id=syndEntry.getTitle();
					type = "All or Nothing Day";
					drawdate = new GregorianCalendar((Integer.parseInt(dt[2])-1),Integer.parseInt(dt[1]),Integer.parseInt(dt[0])); 
					String value = syndEntry.getDescription().getValue();
					System.out.println(drawdate.getTime());
					String res[] = value.split("-");

					result = Arrays.asList(res);

					for (String res1 : result) {
						System.out.println(res1.trim());  // Update to DB here

					}

				}
				
//************All or nothing Evening				
				
				if (syndEntry.getTitle().startsWith("All or Nothing Evening")) {

					
					String d[] = 	syndEntry.getTitle().split("All or Nothing Evening Winning Numbers for");
					String dt[] = d[1].trim().split("/");
					System.out.println(d[1].trim());
					
					id=syndEntry.getTitle();
					type = "All or Nothing Evening";
					drawdate = new GregorianCalendar((Integer.parseInt(dt[2])-1),Integer.parseInt(dt[1]),Integer.parseInt(dt[0])); 
					String value = syndEntry.getDescription().getValue();
					System.out.println(drawdate.getTime());
					String res[] = value.split("-");

					result = Arrays.asList(res);

					for (String res1 : result) {
						System.out.println(res1.trim());  // Update to DB here

					}

				}
				
				
//************All or nothing Night				
				
				if (syndEntry.getTitle().startsWith("All or Nothing Night")) {

					
					String d[] = 	syndEntry.getTitle().split("All or Nothing Night Winning Numbers for");
					String dt[] = d[1].trim().split("/");
					System.out.println(d[1].trim());
					
					id=syndEntry.getTitle();
					type = "All or Nothing Night";
					drawdate = new GregorianCalendar((Integer.parseInt(dt[2])-1),Integer.parseInt(dt[1]),Integer.parseInt(dt[0])); 
					String value = syndEntry.getDescription().getValue();
					System.out.println(drawdate.getTime());
					String res[] = value.split("-");

					result = Arrays.asList(res);

					for (String res1 : result) {
						System.out.println(res1.trim());  // Update to DB here

					}

				}
				
				
				
			}
		} finally {
			if (xmlReader != null)
				xmlReader.close();
		}
	}

}
