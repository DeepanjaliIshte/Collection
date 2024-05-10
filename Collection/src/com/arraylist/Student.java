package com.arraylist;

public class Student {
	private int RollNo;
	private String name;
	private int Age;
	public Student(int rollNo, String name, int age) {
		super();
		RollNo = rollNo;
		this.name = name;
		Age = age;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", Age=" + Age + "]";
	}
	
}
