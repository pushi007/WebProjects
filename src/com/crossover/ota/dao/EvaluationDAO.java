package com.crossover.ota.dao;

import java.util.ArrayList;

import com.crossover.ota.model.Candidate;

public interface EvaluationDAO {
	public ArrayList<Candidate> evaluateCandidates();
}
