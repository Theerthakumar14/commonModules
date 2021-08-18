package com.xworkz.vaccination.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vaccination.entity.VaccinationEntity;
@Component
public class VaccinationDAOImpl implements VaccinationDAO {
	@Autowired
	private SessionFactory factory;

	public VaccinationDAOImpl() {
		System.out.println("VaccinationDAOImpl object is created");
	}

	public boolean saveTheRegisterDetails(VaccinationEntity entity) {
		System.out.println("invoked saveTheRegisterDetails");
		Session session = null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("data saved to database");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
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
