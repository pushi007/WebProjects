package com.crossover.ota.model;

import java.util.ArrayList;

public class TestQuestions {
	private int questionId;
	private String questionStatement;
	ArrayList<String> options;
	private String answer;

	public TestQuestions() {

	}

	public TestQuestions(int questionId, String questionStatement, ArrayList<String> options, String answer) {

		this.questionId = questionId;
		this.questionStatement = questionStatement;
		this.answer = answer;
		this.options = options;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionStatement() {
		return questionStatement;
	}

	public void setQuestionStatement(String questionStatement) {
		this.questionStatement = questionStatement;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ArrayList<String> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}
}
