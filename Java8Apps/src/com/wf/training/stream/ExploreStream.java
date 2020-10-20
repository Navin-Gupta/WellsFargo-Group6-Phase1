package com.wf.training.stream;

import java.util.function.Consumer;
import java.util.function.Predicate;

import com.wf.training.repository.Student;
import com.wf.training.repository.StudentRepository;

public class ExploreStream {

	// Consumer : consumes a student record and displays name of student
		static Consumer<Student> nameDisplay =
					student -> System.out.println(student.getName());
					
		// Consumer : consumes a student record and displays activities of student
		static Consumer<Student> activityDisplay =
					student -> System.out.println(student.getActivites());	
					
		// Predicate : to check the grade if greater than 2
		static Predicate<Student> gradePredicate =
								student -> student.getGrade() > 2; // return is default
								
		// Predicate : to check the gpa if greater than equal to 3.5
		static Predicate<Student> gpaPredicate =
								student -> student.getGpa() >= 3.5; // return is default							
		
	public static void main(String args[]) {
		// display name and activities of student with condition (stream)
		// fetch the stream
		StudentRepository.getStudents()
						 .stream()
						 //.filter(gradePredicate)
						 //.filter(gpaPredicate)
						 .filter(gradePredicate.and(gpaPredicate))
						 .forEach(nameDisplay.andThen(activityDisplay));
		
	}
}










