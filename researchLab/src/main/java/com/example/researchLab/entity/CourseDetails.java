package com.example.researchLab.entity;

import org.springframework.stereotype.Component;
import lombok.ToString;

@Component
@ToString
public class CourseDetails {

	long  courseId;
	String firstMajorSubject;
	String secondMajorSubject;
	String courseDescription;
	String optionalsubject;
	
	
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
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
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getOptionalsubject() {
		return optionalsubject;
	}
	public void setOptionalsubject(String optionalsubject) {
		this.optionalsubject = optionalsubject;
	}
	
	
}
