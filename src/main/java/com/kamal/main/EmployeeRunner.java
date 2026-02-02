package com.kamal.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee("sumit", "male", 6000);
		
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory=cfg.buildSessionFactory();
//		Session session=sessionFactory.openSession()
		Employeee emp=new Employeee();
	     emp.setName("Kamal Hussain");
	     emp.setGender("male");
	     emp.setSalary(150560);
	     
	 	Employeee emp1=new Employeee();
	     emp1.setName("Kaif Hussain");
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
	     
	     ArrayList <Employeee> ep=new ArrayList<>();
	     ep.add(emp);
	     ep.add(emp1);
	     
	     ArrayList <Address> ad=new ArrayList<>();
	     ad.add(add1);
	     ad.add(add2);
	     ad.add(add3);
	  
	     emp.setAddresses(ad); 
	     emp1.setAddresses(ad);
	     
	     add1.setEmployeee(ep);
	     add2.setEmployeee(ep);
	     add3.setEmployeee(ep);
		
	

		
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metadata= new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory=metadata.buildSessionFactory();
		
		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build()).getMetadataBuilder().build()
				.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
		
	     session.persist(emp);
	     session.persist(emp1);
	     session.persist(add1);
	     session.persist(add2);
	     session.persist(add3);
     	 tx.commit();
		  
//		Employeee epl=session.find(Employeee.class, 1);
//		System.out.println(epl);
//		System.out.println(epl.getAddresses());
     	 
     	 Address address=session.find(Address.class, 3);
     	 System.out.println(address);
     	 System.out.println(address.getEmployeee());
		 	   
>>>>>>> Stashed changes
	}

}


 