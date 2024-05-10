package com.arraylist;

import java.util.*;  

public class StudentInformationDemo {

	public static void main(String[] args) {
		List<Student> student=new ArrayList<Student>();
		student.add(new Student(11, "Atul", 18));
		student.add(new Student(12, "Arvind", 21));
		student.add(new Student(15, "Vishal",22));
		student.add(new Student(19, "Sanket", 36));
		
		System.out.println(student);
		
		Iterator it=student.listIterator();
		while(it.hasNext()) {
			Student ob= (Student)it.next();
			System.out.println(ob.getRollNo()+"\t"+ob.getName()+"\t"+ob.getAge());
		}
		
  	}

}
