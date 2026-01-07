package com.kamal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee(2,"rohil", "male", 35000);
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		
		
		
	}

}


 