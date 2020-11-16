package com.wf.training.spring.factory.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wf.training.spring.factory.service.EmailService;
import com.wf.training.spring.factory.service.MessagingService;

public class MyApp {

	public static void main(String[] args) {
		
		// Create a container (Bean Factory) based on XML configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// demand-retrieve the beans from factory/container
		// MessagingService service = context.getBean(MessagingService.class);
		MessagingService service = context.getBean("smsservice",MessagingService.class);
		// MessagingService service = context.getBean(EmailService.class);
		String ack = service.sendMessage("Hello All", "someone");
		System.out.println(ack);
		
	}

}
