package com.crossover.ota.services;

import com.crossover.ota.dao.CandidateDAO;
import com.crossover.ota.model.Candidate;

public class CandidateServiceImpl implements CandidateService {
	private CandidateDAO candidateDAO;

	public void setCandidateDAO(CandidateDAO candidateDAO) {
		this.candidateDAO = candidateDAO;
	}

	@Override
	public Candidate getCandidate(String username, String password) {
		return this.candidateDAO.getCandidate(username, password);
	}

}
