/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import model.Student_Info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author adam
 */
public class test {
    public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student_Info student_Info = new Student_Info();
		student_Info.setFirstName("Tom");
		student_Info.setLastName("Smith");
		student_Info.setEmail("tom.smith@gmail.com");
		student_Info.setPhone("777-555-3333");

		Transaction tx = session.beginTransaction();
		session.save(student_Info);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}
}

