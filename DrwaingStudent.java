package com.interview.pgms;

public class DrwaingStudent extends Student {
	String typeofDrawingname;
public	DrwaingStudent(int age,String sName,int rollno,String typeofDrwing) {
	super(age,sName,rollno);
	
	typeofDrawingname = typeofDrwing;
	
	showStudetails(age,sName,rollno,typeofDrwing);
	
}
public void showStudetails(int age,String SName,int rollno,String typeofDrwing) {
	System.out.println("Student details::");
	System.out.println("Name:"+SName+",Age:"+age+",rollno:"+rollno);
	System.out.println("Type of drwaing :;"+typeofDrwing);
}
}
