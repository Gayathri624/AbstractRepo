 package com.cg.abs;

public class Student extends Person {
	
	private String branch;
	private int stuId;
	
	
	public Student(String name, int age, String branch, int stuId) {
		super(name, age);
		this.branch = branch;
		this.stuId = stuId;
	}

    public void display() {
		 
		System.out.println(this.age+this.name+this.branch+this.stuId);
	}

}
