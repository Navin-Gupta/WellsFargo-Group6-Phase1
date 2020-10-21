package com.wf.training.optional;

import java.util.Optional;

import com.wf.training.repository.Student;

public class OptionalEx {

	// method to initiate a student object
	public static Student getStudentData() {
		// some logic to initiate student object
		Student student = null;
		return student;
	}
	
	// method to initiate a student object
	public static Optional<Student> getStudentDataOptional() {
		// some logic to initiate student object
		Student student = null;
		//create an optional instance
		Optional<Student> studentOptional = Optional.ofNullable(student);
		return studentOptional;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = getStudentData();
		if(student!=null) {
			System.out.println("NAME :" + student.getName());
		}
		
		Optional<Student> studOptional = getStudentDataOptional();
		
 		// Optional<String> name = studOptional.map(stud->stud.getName());
		
		// String name = studOptional.map(stud->stud.getName()).orElse("Default");
		
		/*String name = studOptional.map(stud->stud.getName()).orElseGet(()->{
				// any logic goes here
				return "Default";
		});*/
		
		String name = studOptional.map(stud->stud.getName()).orElseThrow(()->{
					// any logic goes here
					return new RuntimeException("No data found!!");
					
		});
		
		
		if(studOptional.isPresent()) {
			// fetch the object
			Student studentPro = studOptional.get();
			System.out.println("NAME :" + studentPro.getName());
			
		}
	}

}








