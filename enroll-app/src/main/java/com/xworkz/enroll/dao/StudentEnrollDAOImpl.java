package com.xworkz.enroll.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.enroll.entity.StudentEnrollEntity;

@Component
public class StudentEnrollDAOImpl implements StudentEnrollDAO {
	@Autowired
	private SessionFactory factory;

	public boolean saveStudentDetails(StudentEnrollEntity entity) {
		System.out.println("invoked saveStudentDetails");
		Session session = null;

		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("data saved to database");
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("data is not saved to database");
			return false;
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

}
