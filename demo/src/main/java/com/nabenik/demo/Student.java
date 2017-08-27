package com.nabenik.demo;

public class Student extends Person{
	
	public Student(String name, String address){
		this.setName(name);
		this.setAddress(address);
	}
	
	public Student(int numCourses, String[] courses, int[] grades) {
		super();
		this.numCourses = numCourses;
		this.courses = courses;
		this.grades = grades;
	}
	private int numCourses;
	private String[] courses;
	private int[] grades;
	public int getNumCourses() {
		return numCourses;
	}
	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	
}
