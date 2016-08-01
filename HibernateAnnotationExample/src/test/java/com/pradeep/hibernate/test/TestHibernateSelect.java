package com.pradeep.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.pradeep.hibernate.model.Student;

public class TestHibernateSelect {

	public static void main(String[] args) {

		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();


		// creating transaction object
		Object o = session.load(Student.class, new Integer(18));
		Student student = (Student) o;
		System.out.println("Loaded object product name is___"
				+ student.toString());
		session.close();

	}

}
