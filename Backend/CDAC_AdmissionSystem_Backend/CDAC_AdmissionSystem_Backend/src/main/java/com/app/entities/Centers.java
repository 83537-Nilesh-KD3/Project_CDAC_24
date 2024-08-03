package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "Centers")
public class Centers extends BaseEntity {
     @Column(name = "center_name", length = 125)
     private String center_name;
}
