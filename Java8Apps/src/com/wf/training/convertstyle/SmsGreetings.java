package com.wf.training.convertstyle;

public class SmsGreetings implements Greetings{
	@Override
	public void sendGreetings(String message) {
		System.out.println("Message Sent over SMS  : " + message);
		
	}
}
