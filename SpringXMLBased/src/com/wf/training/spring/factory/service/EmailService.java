package com.wf.training.spring.factory.service;

public class EmailService implements MessagingService{

	// dependency on Fortune Service
	private FortuneService fortuneService;
	private String sender;
	
	// constructor based DI
	// Bean factory will pass(inject) the param
	/*public EmailService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public EmailService() {
		System.out.println("Email instance created...");
	}
	
	// create a setter for the field whose dependency needs to be injected
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}

	// can have any access modifier
	// return type is recommended as void , though can have any return type
	// can have any name
	// must not have any param
	public void myInit() {
		System.out.println("Bean initiation done...");
	}

	@Override
	public String sendMessage(String message, String to) {
		// this.sender = "";
		return "Email sent : " + message + "[ To : " + to + "]" +
				"\nSend By :" + this.sender +
			   "\n" + this.fortuneService.dailyFortune();	
	}
	
	private void myCleanUp() {
		System.out.println("Bean clean-up done...");
	}


	
}
