package com.LGC.jpa;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AllorNothing") 
public class AllorNothing implements Serializable{
	@Id
	@Column(name = "id", length=40)
	String id;
	
	public AllorNothing(String id, String type, Calendar drawdate, int n1, int n2, int n3, int n4, int n5, int n6,
			int n7, int n8, int n9, int n10, int n11, int n12) {
		super();
		this.id = id;
		this.type = type;
		this.drawdate = drawdate;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
		this.n7 = n7;
		this.n8 = n8;
		this.n9 = n9;
		this.n10 = n10;
		this.n11 = n11;
		this.n12 = n12;
	}

	public AllorNothing() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Calendar getDrawdate() {
		return drawdate;
	}

	public void setDrawdate(Calendar drawdate) {
		this.drawdate = drawdate;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}

	public int getN5() {
		return n5;
	}

	public void setN5(int n5) {
		this.n5 = n5;
	}

	public int getN6() {
		return n6;
	}

	public void setN6(int n6) {
		this.n6 = n6;
	}

	public int getN7() {
		return n7;
	}

	public void setN7(int n7) {
		this.n7 = n7;
	}

	public int getN8() {
		return n8;
	}

	public void setN8(int n8) {
		this.n8 = n8;
	}

	public int getN9() {
		return n9;
	}

	public void setN9(int n9) {
		this.n9 = n9;
	}

	public int getN10() {
		return n10;
	}

	public void setN10(int n10) {
		this.n10 = n10;
	}

	public int getN11() {
		return n11;
	}

	public void setN11(int n11) {
		this.n11 = n11;
	}

	public int getN12() {
		return n12;
	}

	public void setN12(int n12) {
		this.n12 = n12;
	}

	@Column(name = "type", length=50)
	String type;
	
	@Temporal(TemporalType.TIMESTAMP)
	Calendar drawdate;
	
	@Column(name = "n1")
	int n1;
	
	@Column(name = "n2")
	int n2;
	
	
	@Column(name = "n3")
	int n3;
	
	@Column(name = "n4")
	int n4;
	
	@Column(name = "n5")
	int n5;
	
	@Column(name = "n6")
	int n6;
	
	@Column(name = "n7")
	int n7;
	
	@Column(name = "n8")
	int n8;
	
	@Column(name = "n9")
	int n9;
	
	@Column(name = "n10")
	int n10;
	
	@Column(name = "n11")
	int n11;
	
	@Column(name = "n12")
	int n12;
	

	
	
	
	
	
	
	
	
	
	

}
