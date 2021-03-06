package com.wf.training.repository;

import java.util.List;

public class Student {

	private String name;
	private int grade;
	private double gpa;
	private String gender;
	private List<String> activites;
	
	
	
	
	public Student(String name, int grade, double gpa, String gender, List<String> activites) {
		super();
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		this.gender = gender;
		this.activites = activites;
	}
	

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", grade=" + grade + ", gpa=" + gpa + ", gender=" + gender + ", activites="
				+ activites + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getActivites() {
		return activites;
	}
	public void setActivites(List<String> activites) {
		this.activites = activites;
	}
	
	
	
	
	
}
