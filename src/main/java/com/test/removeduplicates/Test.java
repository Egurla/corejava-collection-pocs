package com.test.removeduplicates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Student> studentData = new HashSet<Student>();
		studentData.add(new Student(100, "kumar", "kumar@gmail.com"));
		studentData.add(new Student(100, "kumar", "kumar@gmail.com"));
		studentData.add(new Student(200, "saketh", "saketh@gmail.com"));
		studentData.add(new Student(200, "saketh", "saketh@gmail.com"));
		studentData.add(new Student(400, "raju", "raju@gmail.com"));
		studentData.add(new Student(500, "sai", "sai@gmail.com"));
		
		//to get the student data using java 7 
		Iterator<Student> itr=studentData.iterator();
		while(itr.hasNext()) {
			Student student=itr.next();
			System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentEmail());
			}

		//To get the student data using java8
		studentData.forEach(s->System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getStudentEmail()));
	}
}
