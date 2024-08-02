package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name ="students")
public class Student extends BaseEntity {
	@Column(name = "first_name", length = 25)
	private String first_name;
	@Column(name = "last_name", length = 25)
	private String last_name;
	@Column(length = 125, nullable = false)
	private int C_CAT_Rank;
	@Column (length = 25, nullable = false)
	private LocalDate dob;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 25)
	private String mobile_number;
	@Column(length = 256)
	private String address;
	@Column(length = 25, nullable =false)
	private String password;
	
}
