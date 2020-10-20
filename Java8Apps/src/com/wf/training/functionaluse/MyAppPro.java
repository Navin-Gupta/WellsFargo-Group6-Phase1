package com.wf.training.functionaluse;

import java.util.function.Consumer;
import java.util.function.Predicate;

import com.wf.training.repository.Student;
import com.wf.training.repository.StudentRepository;

public class MyAppPro {

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
	
	// display names of all students
	public static void displayNames() {
		StudentRepository.getStudents().forEach(nameDisplay);
	}
	
	// display activities of all students
	public static void displayActivities() {
		StudentRepository.getStudents().forEach(activityDisplay);
	}
	
	// display name & activities of all students
	public static void displayNamesAndActivities() {
		/*StudentRepository.getStudents().forEach(nameDisplay);
		StudentRepository.getStudents().forEach(activityDisplay);*/
		// chaining of functional interface
		// what 
		StudentRepository.getStudents().forEach(nameDisplay.andThen(activityDisplay));
	}
	
	// display name & activities of those students who are in grade greater than 2
	public static void displayNamesAndActivitiesConditional() {
		StudentRepository.getStudents().forEach(student ->{
								// if(student.getGrade() > 2) {
								if(gradePredicate.and(gpaPredicate).test(student)) {
									// nameDisplay.accept(student);
									// activityDisplay.accept(student);
									nameDisplay.andThen(activityDisplay).accept(student);
								}
								
							});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// displayNames();
		// displayActivities();
		// displayNamesAndActivities();
		displayNamesAndActivitiesConditional();
		
	}

}
