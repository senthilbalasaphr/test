package com.LGC.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Msg
 *
 */
@Entity
@Table(name = "Msg")   
public class Msg implements Serializable {

	
	@Id 
	String Pernr;
		
	@Column (name = "ename", nullable = false, length = 40)
	String ename;
	
	@Column (name = "vorna", nullable = false, length = 40)
	String vorna;
	
	@Column (name = "vorna1", nullable = false, length = 40)
	String vorna1;
	
	private static final long serialVersionUID = 1L;

	public Msg() {
		super();
	}
   
}
