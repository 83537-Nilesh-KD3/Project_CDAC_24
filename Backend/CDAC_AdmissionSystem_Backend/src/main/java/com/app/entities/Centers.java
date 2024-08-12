package com.app.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "centers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Centers{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
     @Column(name = "center_name",unique = true)
     @NotBlank
     private String center_name;
     
//     @ManyToOne(cascade = CascadeType.ALL)
//     @JoinColumn(name = "student_id")
//     private Student student;
}
