package com.crossover.ota.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.crossover.ota.model.TestExam;

public class TestExamDAOImpl implements TestExamDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public String getTestDesc() {
		System.out.println("Entered into DAO Impl");
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(session.createQuery("FROM TestExam").list().get(0));
		@SuppressWarnings("unchecked")
		ArrayList<TestExam> testExamList = (ArrayList<TestExam>) session.createQuery("FROM TestExam").list();
		String testDesc = testExamList.get(0).getTestDescription();
		System.out.println("Data from Database : " + testDesc);
		return testDesc;
	}

}
