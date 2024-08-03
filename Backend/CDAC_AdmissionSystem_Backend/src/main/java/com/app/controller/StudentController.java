package com.app.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Student;
import com.app.services.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentList")
	public List<Student> getStudentList()
	{
		return studentService.getStudents();
	}
}
