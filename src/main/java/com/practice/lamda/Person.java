package com.practice.lamda;

public class Person {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}

}
