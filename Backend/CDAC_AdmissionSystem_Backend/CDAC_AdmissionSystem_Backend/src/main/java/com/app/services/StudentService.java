package com.app.services;

import java.util.List;
import java.util.Optional;

import com.app.dto.StudentDetails;
import com.app.entities.Student;

public interface StudentService {
	List<Student> getStudents();
}
