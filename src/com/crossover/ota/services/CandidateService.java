package com.crossover.ota.services;

import com.crossover.ota.model.Candidate;

public interface CandidateService {
	public Candidate getCandidate(String username, String password);
}