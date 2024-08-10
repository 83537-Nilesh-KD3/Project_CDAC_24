package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CoursesController {
	
	@Autowired
	private CoursesService CoursesService;
    
	public CoursesController() {
		System.out.println("in ctor " + getClass());
	}
}
