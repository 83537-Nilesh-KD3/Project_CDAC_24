package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.app.entities.Centers;
import com.app.entities.Courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {

	private int id;
	private  String firstName;
	private String lastName;
	private String email;
	private int ccatRank;
	private String password;
	private String mobileNo;
	private String courseName;
	private List<Centers> centerList = new ArrayList<>();
}
