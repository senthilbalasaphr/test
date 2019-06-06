import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pick3Exec {

	public int numx[][] = new int[5][20000];
	String sDate1 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read file
		List<Pick3> Pick3lstMaster = readBooksPick3CSV("/Users/baps/Documents/LGC/Pick 3/pick3Master.txt");
//		List<Pick3> Pick3lstMorning = readBooksPick3CSV("/Users/baps/Documents/LGC/Pick 3/pick3Res-Morning.txt");
		List<Pick3> Pick3lstMorning = readBooksPick3CSV("/Users/baps/Documents/LGC/Pick 3/pick3Res-All052319.txt");
		
		

		List<Pick3> Pick3LstNew = new ArrayList();
		List<Pick3> Pick3LstRep = new ArrayList();
		List<Pick3> Pick3LstOnce = new ArrayList();

		String pick3master = null;
		String pick3morning = null;
		int i = 0;
		int multiple = 0;
		int found = 0;

		for (Pick3 master : Pick3lstMaster) {
			// System.out.println(master.getNum1()+","+master.getNum2()+","+master.getNum3());
			pick3master = master.getNum1() + "," + master.getNum2() + "," + master.getNum3();
			multiple = 0;
			found = 0;
			for (Pick3 Morning : Pick3lstMorning) {

				pick3morning = Morning.getNum1() + "," + Morning.getNum2() + "," + Morning.getNum3();

				if (pick3master.equalsIgnoreCase(pick3morning)) {

					i = i + 1;
					multiple = multiple + 1;
					System.out.println(i + "------->" + pick3master);
					found = 1;

				}

			}

			if (multiple > 1) {
				System.out.print(pick3master + "******" + multiple);
				System.out.println("");

				Pick3LstRep.add(new Pick3(master.num1, master.num2, master.num3, multiple));

			}
			if (multiple == 1) {

				Pick3LstOnce.add(new Pick3(master.num1, master.num2, master.num3, multiple));
			}

			if (found == 0) {
				Pick3LstNew.add(new Pick3(master.num1, master.num2, master.num3));
			}

		}

		System.out.println("New Numbers");
		i = 0;
		for (Pick3 n : Pick3LstNew) {

			i = i + 1;
			System.out.println(i + "------->" + n.getNum1() + "," + n.getNum2() + "," + n.getNum3());

		}
		
		System.out.println("Rep Numbers");
		i = 0;
		for (Pick3 n : Pick3LstRep) {

			i = i + 1;
			System.out.println(i + "------->" + n.getNum1() + "," + n.getNum2() + "," + n.getNum3()+","+n.count);

		}
		
		System.out.println("Once Numbers");
		i = 0;
		for (Pick3 n : Pick3LstOnce) {

			i = i + 1;
			System.out.println(i + "------->" + n.getNum1() + "," + n.getNum2() + "," + n.getNum3());

		}
		
		

	}

	private static List<Pick3> readBooksPick3CSV(String fileName) {

		List<Pick3> Pick3Lst = new ArrayList();

		File file = new File(fileName);
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

				Pick3 Pick3 = createPick3(attributes);
				Pick3Lst.add(Pick3);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Pick3Lst;
	}

	private static Pick3 createPick3(String[] metadata) {
		int num1 = Integer.parseInt(metadata[0]);
		int num2 = Integer.parseInt(metadata[1]);
		int num3 = Integer.parseInt(metadata[2]);
		// create and return book of this metadata
		return new Pick3(num1, num2, num3);
	}

}
