package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Centers;
import com.app.services.CenterService;

@RestController
@RequestMapping("/centers")
public class CenterController {
	
	@Autowired
	private CenterService centerService;
	
	@GetMapping("/get")
	public List<Centers> getCenters()
	{
		return centerService.getList();
	}
}
