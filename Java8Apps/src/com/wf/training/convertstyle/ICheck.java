package com.wf.training.convertstyle;

public interface ICheck {
	public void fun();
	default public void test() {
		System.out.println("Default method of interface");
	}
	static void sfun() {
		System.out.println("Static fun of interface");
	}
}
