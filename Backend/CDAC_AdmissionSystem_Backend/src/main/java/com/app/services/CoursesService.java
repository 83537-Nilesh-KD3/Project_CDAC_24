package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.CoursesDto;
import com.app.entities.Courses;




public interface CoursesService {
   List<Courses> getAllCourses();
   Courses addNewCourse(Courses course);
   CoursesDto getCourseDetails(Long Id);
  ApiResponse updteCurseDetails(Long Id,Courses existingCourse);
  ApiResponse deleteCourseDetails(Long Id);
  
}
