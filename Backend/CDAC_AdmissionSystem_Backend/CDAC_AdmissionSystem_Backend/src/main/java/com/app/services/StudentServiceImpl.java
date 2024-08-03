package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDao;
import com.app.dto.StudentDetails;
import com.app.entities.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}
	
	
}
