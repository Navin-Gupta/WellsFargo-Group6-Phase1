package com.wf.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a collection
		List<String> names = new ArrayList<String>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		
		// directly using collection
		names.forEach(System.out :: println);
		names.forEach(System.out :: println);

		System.out.println("\n--------------------\n");
		// stream
		// fetch the stream
		Stream<String> nameStream =  names.stream();
		// thread-safe, efficient, immutable
		nameStream.forEach(System.out::println);
		// stream are not reusable
		nameStream.forEach(System.out::println);
	}

}
