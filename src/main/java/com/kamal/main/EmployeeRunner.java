package com.kamal.main;

import java.util.ArrayList;
import java.util.List;

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
	     emp.setName("Kamal Hussain");
	     emp.setGender("male");
	     emp.setSalary(150560);
	     
	     Employeee emp1=new Employeee();
	     emp1.setName("Kamal Hussain");
	     emp1.setGender("male");
	     emp1.setSalary(150560);
	     
	     Address add1=new Address();
	     add1.setCity("NOIDA");
	     add1.setState("UP");
	   
	     
	     Address add2=new Address();
	     add2.setCity("GZB");
	     add2.setState("UP");
	    	     
	     Address add3=new Address();
	     add3.setCity("Lucknow");
	     add3.setState("UP");
	   
	     
	   
	     
	     List<Address> listOfAddress=new ArrayList<>();
	     
	     listOfAddress.add(add1);
	     listOfAddress.add(add2);
	     listOfAddress.add(add3);
		
	     List<Employeee> listOfEmployeee=new ArrayList<>();
	     listOfEmployeee.add(emp);
	     listOfEmployeee.add(emp1);
	
	     emp.setAddresses(listOfAddress);
	     emp1.setAddresses(listOfAddress);
	      
	     
	     add1.setEmployeee(listOfEmployeee);
	     add2.setEmployeee(listOfEmployeee);
	     add3.setEmployeee(listOfEmployeee);
	 
		
//		
		Session session=empConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
//		
	     session.persist(emp);
	     session.persist(emp1);
	     session.persist(add1); 
	     session.persist(add2);
	     session.persist(add3);
	     session.persist(listOfEmployeee);
	     session.persist(listOfAddress);
     	 tx.commit();
		  
		Employeee ep=session.find(Employeee.class, 1);
		System.out.println(ep);
		System.out.println(ep.getAddresses());
     	 
     	
		 
		
		
		   
	}

}


 