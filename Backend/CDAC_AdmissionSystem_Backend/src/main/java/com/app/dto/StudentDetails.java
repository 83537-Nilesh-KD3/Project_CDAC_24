package com.app.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDetails {
   private String first_name;
   private String last_name;
   private LocalDate dob;
   private int C_CAT_Rank;
   private String email;
   private String mobile_number;
   private String address;
   private String password;
}
