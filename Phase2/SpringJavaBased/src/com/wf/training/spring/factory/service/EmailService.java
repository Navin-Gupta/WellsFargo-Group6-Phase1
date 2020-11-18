package com.wf.training.spring.factory.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("email")
@Scope("singleton")
public class EmailService implements MessagingService{
	
	// dependency
	// @Autowired
	// @Qualifier("personalFortune")
	private FortuneService fortuneService;
	
	@Value("${msg.email.sender}")
	private String sender;
	
	
	// Constructor based DI
	// Constructors are by default auto-wired
	@Autowired
	// public EmailService(@Qualifier("personalFortune") FortuneService fortuneService) {
	public EmailService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	// Setter/method based DI
	/*@Autowired
	 * @Qualifier("personalFortune")
	// public void setFortuneService(FortuneService fortuneService) {
	public void xyz(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	// n method with @Autowired: all of them called 
	
	@PostConstruct
	private void myInit() {
		System.out.println("Bean logical initiation");
	}
	
	@Override
	public String sendMessage(String message, String to) {
		// this.sender = "";
		return "Email sent : " + message + "[ To : " + to + "]" +
				"\nSend By : " + this.sender + 
			   "\n" + this.fortuneService.dailyFortune();	
	}

	@PreDestroy
	private void myCleanUp() {
		System.out.println("Bean logical clean-up");
	}
	
	
}
