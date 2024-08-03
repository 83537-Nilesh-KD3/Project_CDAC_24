package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Student;
import com.app.dto.StudentDetails;

public interface StudentDao extends JpaRepository<Student,Long> {
    
	//Optional<Student>findByEmailAndPassword(String email,String pass);
	
	//@Query("select new com.app.entities.Student(firstName,lastName) from Student")
	//List<StudentDetails> fetchStudentByEmail(String email);
}
