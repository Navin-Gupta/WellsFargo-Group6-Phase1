package com.wf.training.spring.factory.service;

public class EmailService implements MessagingService{

	// dependency on Fortune Service
	private FortuneService fortuneService;
	
	@Override
	public String sendMessage(String message, String to) {
		return "Email sent : " + message + "[ To : " + to + "]";
	}

}
