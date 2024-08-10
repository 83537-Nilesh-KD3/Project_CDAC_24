package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Applications;

public interface ApplicationsDao extends JpaRepository<Applications, Long> {

}
