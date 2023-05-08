package com.example.researchLab.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.researchLab.entity.StudentDetails;

@Repository
public interface StudentManagementRepository extends JpaRepository<StudentDetails, Long>{

}
