package com.example.researchLab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.researchLab.entity.StudentCourseModel;
import com.example.researchLab.entity.StudentDetails;
import com.example.researchLab.service.StudentManagementService;

@RestController
public class StudentManagementController {

	@Autowired
	StudentManagementService studentManagementService;
	
	@GetMapping(value = "/student/details/{id}")
	public StudentDetails getStudentDetailsById(@PathVariable Long id) {
			
		return studentManagementService.getStudentDetailsById(id);
	}
	
	@PostMapping(value = "/register/student")
	public void saveStudentDetails(@RequestBody StudentDetails studentDetails) {
		
		studentManagementService.saveStudentDetails(studentDetails);
	}
	
	@GetMapping(value = "/studentCourse/details/{id}")
	public StudentCourseModel getStudentCourseDetails(@PathVariable Long id) {
			
		return studentManagementService.getStudentCourseDetails(id);
	}
	
	@GetMapping(value = "/getAll/StudentDetails")
	public List<StudentDetails> getAllStudentDetails() {
			
		return studentManagementService.getAllStudentDetails();
	}
	
	
	
	/*
	 * @Bean public RestTemplate restTemplate() { return new RestTemplate(); }
	 */
	
}
