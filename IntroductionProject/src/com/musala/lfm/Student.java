package com.musala.lfm;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private double score;
	
	public Student() {
		firstName = "";
		lastName = "";
	}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public boolean isUnderAge() {
		return age < 18;
	}
	
	public void setAge(int age) {
		
		if (age > 0) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
}
