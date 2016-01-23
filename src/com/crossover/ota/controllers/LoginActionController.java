package com.crossover.ota.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crossover.ota.services.CandidateService;

@Controller
@RequestMapping(value = "/login", method = RequestMethod.GET)
public class LoginActionController {
	private CandidateService candidateService;

	public void setCandidateService(CandidateService candidateService) {
		this.candidateService = candidateService;
	}

	@RequestMapping(value = "/testStart{username}{password}")
	public String getCandidate(@PathVariable("username") String username, @PathVariable("password") String password,
			Model model) {
		System.out.println("Entered in start test servlet");
		model.addAttribute("candidate", this.candidateService.getCandidate(username, password));
		System.out.println(model.getClass());
		return "candidate";

	}
}
