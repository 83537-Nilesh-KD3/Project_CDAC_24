package com.app.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.StudentDto;
import com.app.dto.StudentRequestDto;
import com.app.entities.Student;
import com.app.exceptions.StudentNotFoundException;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public interface StudentService {
	String addStudent(@RequestBody StudentRequestDto studentRequestDto);
	
	List<Student> getStudent();
	
	Student getStudentById(@RequestParam Long id) throws StudentNotFoundException;
	
	String updateStudent(@RequestParam Long id,@RequestBody StudentRequestDto studentRequestDto) throws StudentNotFoundException;
	
	void deleteStudent(@RequestParam Long id);
}
