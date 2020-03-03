package com.niit.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory ;
static{
	try {
		Configuration config =  new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
	}
	catch (HibernateException ex)
	{
		System.err.println("Initial SessionFactory creation failed!!!"+ex);
		throw new ExceptionInInitializerError(ex);
	}
}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
