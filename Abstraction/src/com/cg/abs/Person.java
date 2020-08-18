package com.cg.abs;

 public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		
		System.out.println("************");
		System.out.println("************");
		System.out.println(this.name+this.age);
		
		
	}



	
	
}
