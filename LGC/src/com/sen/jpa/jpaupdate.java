package com.sen.jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class jpaupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pick3JPA p3 = new Pick3JPA();
		p3.setDn("1231");
		p3.setDrawdate("01/03/2019");
		p3.setDrawtype("M");
		p3.setFireBall(5);
		p3.setNum1(7);
		p3.setNum2(5);
		p3.setNum3(9);
		
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("LGC");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p3);
		em.getTransaction().commit();
		em.close();

	}

}
