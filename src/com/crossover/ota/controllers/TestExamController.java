package com.crossover.ota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crossover.ota.services.TestExamService;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class TestExamController {
	private TestExamService testExamService;

	@Autowired(required = true)
	@Qualifier(value = "testExamService")
	public void setTestExamService(TestExamService testExamService) {
		this.testExamService = testExamService;
	}

	@RequestMapping(value = "/test")
	public String listTestExams(Model model) {
		System.out.println("Entered into controller inside listTestExams");
		model.addAttribute("testExam", this.testExamService.getTestDesc());
		// model.addAttribute("listTestExams",
		// this.testExamService.getTestDesc());
		return "testExam";
	}

}
