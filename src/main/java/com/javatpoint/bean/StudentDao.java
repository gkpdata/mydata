package com.javatpoint.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
	private Configuration conf;
	private SessionFactory factory;
	private Session session;
	private Transaction t;
	public void setValue()
	{
		conf=new Configuration().configure("hibernate.cfg.xml");
		factory=conf.buildSessionFactory();
		session=factory.openSession();
		t=session.beginTransaction();
	}
	public void save(Student s)
	{
		setValue();
		session.save(s);
		t.commit();
		System.out.println("Done");
	}

}
