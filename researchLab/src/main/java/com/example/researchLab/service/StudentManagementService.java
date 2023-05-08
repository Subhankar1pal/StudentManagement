package com.example.researchLab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.researchLab.entity.CourseDetails;
import com.example.researchLab.entity.StudentCourseModel;
import com.example.researchLab.entity.StudentDetails;
import com.example.researchLab.repository.StudentManagementRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class StudentManagementService {

	@Autowired
	StudentManagementRepository studentManagementRepository;
	
	@Autowired
	StudentCourseModel studentCourseModel;
	
	RestTemplate restTemplate = new RestTemplate();
	
	Logger log = LoggerFactory.getLogger(StudentManagementService.class);
	
	public void saveStudentDetails(StudentDetails studentDetails) {
		log.info("Inside saveStudentDetails");
		studentManagementRepository.save(studentDetails);
	}
	
	public StudentDetails getStudentDetailsById(Long id) {
		log.info("Inside getStudentDetailsById");
		return studentManagementRepository.findById(id).get();
	}
	
	public List<StudentDetails> getAllStudentDetails(){
		return studentManagementRepository.findAll();
	}
	
	public StudentCourseModel getStudentCourseDetails(Long id) {
		
		StudentCourseModel studentCourseModel = new StudentCourseModel();
		CourseDetails courseDetailsResponse = new CourseDetails();
		StudentDetails studentDetails = studentManagementRepository.findById(id).get();
		
		String courseDetailsUrl = "http://localhost:8082/get/courseDetailsById/"+studentDetails.getCourse();
		ResponseEntity<CourseDetails> response = restTemplate.getForEntity(courseDetailsUrl, CourseDetails.class);
		
		if(null == response.getBody()) {
			log.info(" CourseDetails is empty, no associated course available ");
			return studentCourseModel;
		}else {
			courseDetailsResponse = response.getBody();
		}
		
		studentCourseModel.setStudentName(studentDetails.getStudentName());
		studentCourseModel.setGrade(studentDetails.getGrade());
		studentCourseModel.setCourseDescription(courseDetailsResponse.getCourseDescription());
		studentCourseModel.setFirstMajorSubject(courseDetailsResponse.getFirstMajorSubject());
		studentCourseModel.setSecondMajorSubject(courseDetailsResponse.getSecondMajorSubject());
		
		return studentCourseModel;
	}
	
}
