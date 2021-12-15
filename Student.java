package com.interview.pgms;

public class Student {
	int studentAge;
	String studentName;
	int studentRoll;
	
public Student() {
	System.out.println("In a aprent class");
	
}
public Student(int studentAge, String studentName, int studentRoll) {
	super();
	this.studentAge = studentAge;
	this.studentName = studentName;
	this.studentRoll = studentRoll;
}
public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentRoll() {
	return studentRoll;
}
public void setStudentRoll(int studentRoll) {
	this.studentRoll = studentRoll;
}

}
