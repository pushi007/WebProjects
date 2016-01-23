package com.crossover.ota.services;

import com.crossover.ota.dao.TestExamDAO;
import org.springframework.transaction.annotation.Transactional;

public class TestExamServiceImpl implements TestExamService {
	private TestExamDAO testExamDAO;

	public void setTestExamDAO(TestExamDAO testExamDAO) {
		this.testExamDAO = testExamDAO;
	}

	@Override
	@Transactional
	public String getTestDesc() {
		System.out.println("Entered into test exam service");
		return this.testExamDAO.getTestDesc();
	}

}
