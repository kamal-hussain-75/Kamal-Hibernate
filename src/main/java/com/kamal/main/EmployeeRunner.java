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
import com.kamal.entity.Employeee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employeee emp=new Employeee("sumit", "male", 6000);
		
//		
		Session session=empConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
//		
		String hql="UPDATE emp_table SET salary =:s WHERE id=:id";
		Query query=session.createQuery(hql);
		query.setParameter("s", 55555);
		query.setParameter("id", 1);
		int rows=query.executeUpdate();
		
//		session.persist(emp);
		tx.commit();
		
		System.out.println("Rows updated "+rows);
		
		
		
	}

}


 