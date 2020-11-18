package com.wf.training.spring.factory.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.wf.training.spring.factory.service.FortuneService;
import com.wf.training.spring.factory.service.PersonalFortune;
import com.wf.training.spring.factory.service.ProfessionalFortune;

// treat this class as config class
@Configuration
// packages to scan
@ComponentScan("com.wf.training.spring.factory")
// loading the property file
@PropertySource("classpath:repository.properties")
public class MyConfig {

	// logic to expose the ben of a particular fortune-service
	// method to contain that logic
	// object returned by this method will be used/exposed as a bean
	@Bean
	public FortuneService exposeFortuneService() {
		if(LocalTime.now().getHour() < 10 || LocalTime.now().getHour() > 17) {
			return new PersonalFortune();
		}
		return new ProfessionalFortune();
	}
}
