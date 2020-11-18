package com.wf.training.spring.factory.service;

import org.springframework.stereotype.Component;

// @Component
public class ProfessionalFortune implements FortuneService{

	@Override
	public String dailyFortune() {
		return "Your boss is going to be impressed by you!";
	}
	
}
