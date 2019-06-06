import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Daily4Exec {

	public int numx[][] = new int [5][20000];
	 String sDate1=null;  
	   		
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		

		
// read file
		
		String fileName = "/Users/baps/Documents/LGC/Pick 3/pick3Master.txt";
		File file = new File(fileName);
		FileReader fr=null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null){
			    //process the line
			    System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	//ArrayList pick3
		
		
		
		
		
		
	}
		
		

	}

