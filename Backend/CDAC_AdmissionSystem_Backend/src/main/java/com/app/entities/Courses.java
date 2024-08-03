package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Courses")
public class Courses extends BaseEntity {
    @Column(name = "course_name", length = 25)
    private String course_name;
}
