package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name:Rajalakshmi");
	}
	public void studentDept() {
		System.out.println("Student Dept:IT");
	}
	public void studentId() {
		System.out.println("Student ID: 06BIT63");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		// from grand parent - multilevel inheritance
		student1.collegeCode();
		student1.collegeName();
		student1.collegeRank();
		//from parent
		student1.deptName();
		//from child
		student1.studentDept();
		student1.studentId();
		student1.studentName();
		

	}

}
