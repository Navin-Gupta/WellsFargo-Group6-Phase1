package com.wf.training.convertstyle;

public class EmailGreetings implements Greetings{

	@Override
	public void sendGreetings(String message) {
		System.out.println("Message Sent over email  : " + message);
		
	}

}
