package com.wf.training.convertstyle;

// restricts addition of any additional abstract method
@FunctionalInterface
public interface Greetings {
	public void sendGreetings(String message);
	
	// public void fun();
}
