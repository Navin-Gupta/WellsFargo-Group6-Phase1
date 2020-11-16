package com.wf.training.spring.factory.client;

import com.wf.training.spring.factory.service.EmailService;
import com.wf.training.spring.factory.service.MessagingService;

public class MyApp {

	public static void main(String[] args) {
		
		// Traditional way
		MessagingService service = new EmailService();// tightly coupled
		String ack = service.sendMessage("Hello All", "client@mail.com");
		System.out.println(ack);
	}

}
