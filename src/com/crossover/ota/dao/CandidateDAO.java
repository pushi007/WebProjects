package com.crossover.ota.dao;

import com.crossover.ota.model.Candidate;

public interface CandidateDAO {
	public Candidate getCandidate(String username, String password);
}
