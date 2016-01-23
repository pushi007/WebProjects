package com.crossover.ota.dao;

import com.crossover.ota.model.Candidate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CandidateDAOImpl implements CandidateDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Candidate getCandidate(String username, String password) {
		Session session = sessionFactory.getCurrentSession();
		Candidate candidate = (Candidate) session.createQuery(
				"FROM candidate where candidate.username=" + username + " and candidate.password=" + password);
		System.out.println(candidate + ": " + candidate.getName());
		return candidate;
	}

}
