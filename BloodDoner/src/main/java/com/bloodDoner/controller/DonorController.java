package com.bloodDoner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bloodDoner.entity.bloodDoner;
import com.bloodDoner.services.IDonorService;



@Controller
@RequestMapping("user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DonorController {
    @Autowired
	private IDonorService idonorservice;
	@GetMapping("article")
	public ResponseEntity<bloodDoner> getbloodDonerById(@RequestParam("id") String id) {
		bloodDoner bd = idonorservice.getbloodDonerById(Integer.parseInt(id));
		return new ResponseEntity<bloodDoner>(bd, HttpStatus.OK);
	}
}
