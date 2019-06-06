package com.LGC.jpa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sen.jpa.Pick3JPA;

public class updateJpaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		JpaTest p3 = new JpaTest();
//	
//p3.setEname("Senthil Bala");
//p3.setVorna("vor");
//p3.setVorna1("");
//p3.setPernr("123456789");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
		Calendar calendar = new GregorianCalendar(2013,0,31);
		
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
		em.getTransaction().begin();
//		em.persist(p3);
//		em.persist(p4);
		em.getTransaction().commit();
		
		
		pick3Obj  p8 = em.find(pick3Obj.class, "8");
		
		 System.out.println(p8.getNum1());
		 em.close();
		
	}

}
