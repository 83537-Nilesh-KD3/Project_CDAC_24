package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Centers;

public interface CenterDao extends JpaRepository<Centers,Long> {
	
}
