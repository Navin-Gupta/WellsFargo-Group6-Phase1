package com.wf.training.stream;

import java.util.stream.IntStream;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		// sequential stream
		/*IntStream.rangeClosed(1, 1000) // stream 
			.forEach(value -> calculator.performSum(value));
		System.out.println("Sequential Sum :" + calculator.getResult());*/
		
		// parallel stream
		IntStream.rangeClosed(1, 1000).parallel() // stream 
			.forEach(value -> calculator.performSum(value));
		System.out.println("Parallel Sum :" + calculator.getResult());
	}

}
