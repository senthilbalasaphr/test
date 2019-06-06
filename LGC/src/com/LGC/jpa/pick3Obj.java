package com.LGC.jpa;


	import javax.persistence.Id;
	import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
	@Entity
	@Table (name = "pick3Results") 
	public class pick3Obj implements java.io.Serializable{
		@Id
		String dn;
		public String getDn() {
			return dn;
		}
		public void setDn(String dn) {
			this.dn = dn;
		}
@Temporal(TemporalType.TIMESTAMP)

		Calendar drawdate;
		public Calendar getDrawdate() {
			return drawdate;
		}
		public void setDrawdate(Calendar drawdate) {
			this.drawdate = drawdate;
		}

@Column (name = "drawtype", nullable = false, length = 1)
		String drawtype;
@Column (name = "num1", nullable = false, length = 2)
		int num1;
@Column (name = "num2", nullable = false, length = 2)
		int num2;
@Column (name = "num3", nullable = false, length = 2)
		int num3;
@Column (name = "FireBall", nullable = false, length = 2)
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


