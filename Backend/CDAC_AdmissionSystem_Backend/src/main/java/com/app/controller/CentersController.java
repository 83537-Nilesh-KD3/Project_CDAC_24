package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Centers;
import com.app.services.CentersService;

@RestController
@RequestMapping("/centers")
public class CentersController {
 
	@Autowired
	private CentresService CentresService;
	 public CentresController() {
		 System.out.println("in ctor " + getClass());
	 }
	 @GetMapping
	 public List<Centers> listAllCenters(){
		 System.out.println("in list");
	     return CentersService.getAllCenters();
	 }
}
