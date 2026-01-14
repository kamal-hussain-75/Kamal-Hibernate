package com.kamal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.kamal.cfg.empConfiguration;
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee("sumit", "male", 6000);
		
//		
		Session session=empConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		
		
		
	}

}


 