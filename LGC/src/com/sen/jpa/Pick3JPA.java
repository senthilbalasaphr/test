package com.sen.jpa;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
@Entity
@Table (name = "pick3pastRes2") 
public class Pick3JPA implements java.io.Serializable{
	@Id
	String dn;
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}

	String drawdate;
	public String getDrawdate() {
		return drawdate;
	}
	public void setDrawdate(String drawdate) {
		this.drawdate = drawdate;
	}

	String drawtype;
	int num1;
	int num2;
	int num3;
	int FireBall;
	
	public String getDrawtype() {
		return drawtype;
	}
	public void setDrawtype(String drawtype) {
		this.drawtype = drawtype;
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
	public int getFireBall() {
		return FireBall;
	}
	public void setFireBall(int fireBall) {
		FireBall = fireBall;
	}

	
}
