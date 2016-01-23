package com.crossover.ota.model;

public class Candidate {
	private String username;
	private String password;
	private String name;
	private int grade;
	private int attemptedQuestions;
	private int correctQuestions;
	private TestExam testExam;

	public Candidate() {

	}

	public Candidate(String username, String password, String name) {

		this.username = username;
		this.password = password;
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAttemptedQuestions() {
		return attemptedQuestions;
	}

	public void setAttemptedQuestions(int attemptedQuestions) {
		this.attemptedQuestions = attemptedQuestions;
	}

	public int getCorrectQuestions() {
		return correctQuestions;
	}

	public void setCorrectQuestions(int correctQuestions) {
		this.correctQuestions = correctQuestions;
	}

	public TestExam getTestExam() {
		return testExam;
	}

	public void setTestExam(TestExam testExam) {
		this.testExam = testExam;
	}

}
