package com.wf.training.spring.factory.service;

public class EmailService implements MessagingService{

	@Override
	public String sendMessage(String message, String to) {
		return "Email sent : " + message + "[ To : " + to + "]";
	}

}
