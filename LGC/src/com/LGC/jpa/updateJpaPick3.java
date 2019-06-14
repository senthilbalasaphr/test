package com.LGC.jpa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sen.jpa.Pick3JPA;

public class updateJpaPick3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2013,01,31);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		
		
		pick3Obj  p3 = new pick3Obj();
		p3.setDrawdate(calendar);
		p3.setDn("2");
		p3.setDrawtype("M");
		p3.setFireBall(1);
		p3.setNum1(3);
		p3.setNum2(3);
		p3.setNum3(4);
		
		
		pick3Obj  p4 = new pick3Obj();
		p4.setDrawdate(calendar);
		p4.setDn("8");
		p4.setDrawtype("M");
		p4.setFireBall(4);
		p4.setNum1(5);
		p4.setNum2(6);
		p4.setNum3(7);
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("LGC");
		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
////		em.persist(p3);
////		em.persist(p4);
//		em.getTransaction().commit();
//		
//		
//		pick3Obj  p8 = em.find(pick3Obj.class, "8");
//		
//		 System.out.println(p8.getNum1());
		
		
		
		
		List<pick3Obj> pick3ResLst = em.createNamedQuery("getAllPick3").getResultList();
		
		for (pick3Obj pick3Res: pick3ResLst) {
			System.out.println(pick3Res.getDn()+","+
					sdf1.format(pick3Res.getDrawdate().getTime())+","+
							   pick3Res.getDrawtype()+","+
							   pick3Res.getFireBall()+","+
							   pick3Res.getNum1()+","+
							   pick3Res.getNum2()+","+
							   pick3Res.getNum3()
							   
					);
			
		}
		
		
		
		 em.close();
		
	}
	


}
