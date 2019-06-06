import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

public class Pick3 {

	Date date1=null;
	int num1=0;
	int num2=0;
	int num3=0;
	int count=0;

	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public Pick3(int num1,int num2,int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
	
	public Pick3(int num1,int num2,int num3,int count) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.count = count;
    }
	
	
	
	public Date getDate1() {
		return date1;
	}
	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}

	
	
	
	
	


}

