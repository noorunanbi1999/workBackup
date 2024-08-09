package com.sonata.Student;

import java.util.List;

public class Student {
private String schoolName;
private List<String> studentData;
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public List<String> getStudentData() {
	return studentData;
}
public void setStudentData(List<String> studentData) {
	this.studentData = studentData;
}
public void display() {
	System.out.println("The school Name is"+schoolName);
	System.out.println("The Student Data is"+studentData);
for(String std:studentData) {
	System.out.println(std);
}
}
}

