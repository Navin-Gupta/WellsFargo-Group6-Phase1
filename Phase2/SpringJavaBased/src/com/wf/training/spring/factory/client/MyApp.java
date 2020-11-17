package com.wf.training.spring.factory.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wf.training.spring.factory.config.MyConfig;
import com.wf.training.spring.factory.service.EmailService;
import com.wf.training.spring.factory.service.MessagingService;

public class MyApp {

	public static void main(String[] args) {
		
		// Create a container (Bean Factory) based on Java class
		// All Singleton instances get created here
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);
		
		// demand-retrieve the beans from factory/container
		// MessagingService service = context.getBean(MessagingService.class);
		MessagingService service = context.getBean("email", MessagingService.class);
		String ack = service.sendMessage("Hello all", "someone");
		System.out.println(ack);
		
		// stop/terminate the container
		context.close();
		
	}

}
