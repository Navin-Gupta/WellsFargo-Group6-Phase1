package com.wf.training.stream;

public class Calculator {

	private int result;
	
	// addition
	public void performSum(int value) {
		result += value;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
}
