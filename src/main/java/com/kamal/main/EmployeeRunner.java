package com.kamal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.kamal.cfg.empConfiguration;
import com.kamal.entity.Address;
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee();
	     emp.setName("Hussain");
	     emp.setGender("male");
	     emp.setSalary(150560);
	     
	     Address add=new Address();
	     add.setCity("NOIDA");
	     add.setState("UP");
	     
	     emp.setAddress(add);
	     add.setEmployeee(emp);
	     
		
	
		
//		
		Session session=empConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
	     session.persist(emp);
	     session.persist(add);
		 tx.commit();
		 
		 Employeee ep=session.find(Employeee.class, 1);
		 System.out.println(ep);
		 System.out.println(ep.getAddress());
		
		
		 Address ad=session.find(Address.class,1);
		 System.out.println(ad);
		 System.out.println(ad.getEmployeee());
		 
		
		  
	}

}


 