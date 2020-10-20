package com.wf.training.functionaluse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

// OOPs
class UpperCaseConsumer implements Consumer<String>{

	@Override
	public void accept(String str) {
		// TODO Auto-generated method stub
		System.out.println(str.toUpperCase());
	}
}

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a consumer that can consume a string and display
		// Functional 
		Consumer<String> strConsumer = str -> System.out.println(str);
		
		// List of names (str)
		// Consume those names using consumer
		
		// Create a collection
		List<String> names = new ArrayList<String>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		
		// iterate through this collection and display names
		
		// counter based
		/*for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}*/
		
		// enhanced for loop
		/*for(String name : names) {
			System.out.println(name);
		}*/
		
		// iterator: Iterable
		// editable iterator since 1.5
		/*Iterator<String> iterator =  names.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}*/
		
		// walkthrough method : forEach : Collection API
		
		// names.forEach(<Consumer>);
		// OOPs
		/*
		UpperCaseConsumer upConsumer = new UpperCaseConsumer();
		names.forEach(upConsumer);// call accept method repeatedly
		*/
		
		// Functional 
		// names.forEach(strConsumer);
		// names.forEach(name->System.out.println(name));
		
		// method reference
		names.forEach(System.out::println);
		
	}

}
