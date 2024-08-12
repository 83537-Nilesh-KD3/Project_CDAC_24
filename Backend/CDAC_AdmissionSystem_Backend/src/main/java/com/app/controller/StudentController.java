package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.StudentRequestDto;
import com.app.exceptions.StudentNotFoundException;
import com.app.services.StudentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String saveStudent(@RequestBody StudentRequestDto studentRequestDto)
	{
		return studentService.addStudent(studentRequestDto);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getStudent()
	{
		return ResponseEntity.ok(studentService.getStudent());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getStudentById(@RequestParam Long id) throws StudentNotFoundException
	{
		return ResponseEntity.ok(studentService.getStudentById(id));
	}
	
	
	@PutMapping("/update/{id}")
	public String updateStudent(@RequestParam Long id, @RequestBody StudentRequestDto studentRequestDto) throws StudentNotFoundException
	{
		return studentService.updateStudent(id, studentRequestDto);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@RequestParam Long id)
	{
		studentService.deleteStudent(id);
	}
}
