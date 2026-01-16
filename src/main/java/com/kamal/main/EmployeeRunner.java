package com.kamal.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.kamal.cfg.empConfiguration;
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee("sumit", "male", 6000);
		Employeee emp1=new Employeee("amit", "male", 63000);
		Employeee emp2=new Employeee("suraj", "male", 53000);
		Employeee emp3=new Employeee("surya", "male", 45000);
		Employeee emp4=new Employeee("sun", "male", 7000);
		
		
	
		Session session=empConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		
//		MutationQuery query1= session.createMutationQuery("delete from empTable where id=3 ");
//		query1.executeUpdate();
		
		MutationQuery query2=session.createMutationQuery("update empTable set name=:n where id=:i");
		query2.setParameter("n", "Kamal");
		query2.setParameter("i", 1);
		query2.executeUpdate();
		
		
		
		Query query1=session.createQuery("from empTable" , Employeee.class);
		
		List list=query1.list();
		System.out.println(list);
		

		
		tx.commit();
		
//		System.out.println("Rows updated "+rows);
		
		
		
	}

}


 