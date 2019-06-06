package com.LGC.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JpaTest
 *
 */
@Entity   
@Table (name = "JpaTest")   
public class JpaTest implements Serializable {

	@Id 
	String Pernr;
		
	public String getPernr() {
		return Pernr;
	}

	public void setPernr(String pernr) {
		Pernr = pernr;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getVorna() {
		return vorna;
	}

	public void setVorna(String vorna) {
		this.vorna = vorna;
	}

	public String getVorna1() {
		return vorna1;
	}

	public void setVorna1(String vorna1) {
		this.vorna1 = vorna1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column (name = "ename", nullable = false, length = 40)
	String ename;
	
	@Column (name = "vorna", nullable = false, length = 40)
	String vorna;
	
	@Column (name = "vorna1", nullable = false, length = 40)
	String vorna1;
	
	private static final long serialVersionUID = 1L;

	public JpaTest() {
		super();
	}

	
	
	
}
