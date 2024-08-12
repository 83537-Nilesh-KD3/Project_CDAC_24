package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.dto.StudentDto;
import com.app.dto.StudentRequestDto;
import com.app.entities.Student;
import com.app.exceptions.StudentNotFoundException;

@Transactional
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public String addStudent(StudentRequestDto studentRequestDto) {
		Student student = mapper.map(studentRequestDto,Student.class);
		studentDao.save(student);
		return "Student Added Successfully!!";
	}


	@Override
	public List<Student> getStudent() {
		return studentDao.findAll();
	}


	@Override
	public Student getStudentById(Long id) throws StudentNotFoundException {
		Student student = studentDao.findById(id).orElse(null);
		if(student == null)
			throw new StudentNotFoundException("Student Not Found");
		return student;
	}


	@Override
	public String updateStudent(Long id, StudentRequestDto studentRequestDto) throws StudentNotFoundException {
		Student student = studentDao.findById(id).orElse(null);
		if(student == null)
			throw new StudentNotFoundException("Student Not Found");
		studentDao.save(mapper.map(studentRequestDto,Student.class));
		return "Student Updated Successfully !!";
	}


	@Override
	public void deleteStudent(Long id) {
		studentDao.deleteById(id);
	}
}
