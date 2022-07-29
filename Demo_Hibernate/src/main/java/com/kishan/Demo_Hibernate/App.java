package com.kishan.Demo_Hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world! 39.36
 *
 */
public class App {
	public static void main(String[] args) {
		AlienName name = new AlienName();
		name.setFname("kishan");
		name.setMname("santosh");
		name.setLname("Gupta");
	
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setName(name);
		a1.setColor("green");

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);// mention
																												// here
																												// a
																												// configuration
																												// file
																												// hibernate.cfg.xml
																												// file
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(a1); //to save the trancation

		a1 = (Alien) session.get(Alien.class, 1); // get the data from database with id
		System.out.println(":::::"+a1);
		
		Query q = session.createQuery("from Alien where aid=1");
		List <Alien>aliens = q.list();
		for(Alien a:aliens)
		{
			System.out.println(a);
		}
		tx.commit();
	}
}
