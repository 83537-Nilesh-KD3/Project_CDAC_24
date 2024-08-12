package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CenterDao;
import com.app.entities.Centers;

@Service
@Transactional
public class CenterServiceImpl implements CenterService{

	@Autowired
	private CenterDao centerDao;
	@Override
	public List<Centers> getList() {
		return centerDao.findAll();
	}
	
	
}
