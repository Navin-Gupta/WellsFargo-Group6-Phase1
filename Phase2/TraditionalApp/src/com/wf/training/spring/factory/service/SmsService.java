package com.wf.training.spring.factory.service;

public class SmsService implements MessagingService{

	@Override
	public String sendMessage(String message, String to) {
		return "SMS sent : " + message + "[ To : " + to + "]";
	}

}
