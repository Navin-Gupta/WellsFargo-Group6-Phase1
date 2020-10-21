package com.wf.training.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.wf.training.repository.Student;
import com.wf.training.repository.StudentRepository;

public class ParallelStream {

	// Predicate : to check the grade if greater than 2
	static Predicate<Student> gradePredicate =
							student -> student.getGrade() > 2; // return is default
							
	// Predicate : to check the gpa if greater than equal to 3.5
	static Predicate<Student> gpaPredicate =
							student -> student.getGpa() >= 3.5; // return is default
							
	public static  List<Student> sequentialStream() {
	
		long start = System.currentTimeMillis();
	// Map<String, List<String>> studentMap =  
			List<Student> students = StudentRepository.getStudents()
					 .stream().peek(student->System.out.println("Initiated : " + student))
					 .filter(gradePredicate).peek(student->System.out.println("Ist Filter : " + student))
					 .filter(gpaPredicate).peek(student->System.out.println("IInd Filter : " + student))
					 .collect(Collectors.toList());
			
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Sequential Time : " + diff);
		return students;		
	}
	
	public static  List<Student> parallelStream() {
		
		long start = System.currentTimeMillis();
		// Map<String, List<String>> studentMap =  
				List<Student> students = StudentRepository.getStudents()
						 .parallelStream().peek(student->System.out.println("Initiated : " + student))
						 .filter(gradePredicate).peek(student->System.out.println("Ist Filter : " + student))
						 .filter(gpaPredicate).peek(student->System.out.println("IInd Filter : " + student))
						 .collect(Collectors.toList());
				long end = System.currentTimeMillis();
				long diff = end - start;
				System.out.println("Parallel Time : " + diff);	
			return students;		
		}
							
	public static void main(String args[]) {
		System.out.println("Sequential Stream : " + sequentialStream());
		
		System.out.println("\n------------------------\n");
		
		
		System.out.println("Parallel Stream : " + parallelStream());
	}
}












