package com.example.researchLab.entity;

import org.springframework.stereotype.Component;
import lombok.ToString;

@Component
@ToString
public class StudentCourseModel {

	String StudentName;
	String grade;
	String courseDescription;
	String firstMajorSubject;
	String secondMajorSubject;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getFirstMajorSubject() {
		return firstMajorSubject;
	}
	public void setFirstMajorSubject(String firstMajorSubject) {
		this.firstMajorSubject = firstMajorSubject;
	}
	public String getSecondMajorSubject() {
		return secondMajorSubject;
	}
	public void setSecondMajorSubject(String secondMajorSubject) {
		this.secondMajorSubject = secondMajorSubject;
	}
	
	
	
}
