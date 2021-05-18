package com.timesheet.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.login.model.Signup;
import com.timesheet.login.service.SignupService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class SignupController {
	
	@Autowired
	SignupService service;
	
	@PostMapping("/insert")
	public int insert(@RequestBody Signup signup) {
		service.insertuser(signup);
		return 1;
	}

	@GetMapping("login")
	public List<Signup> listallusers(){
		List<Signup> usersList=service.login();
		return usersList;
	}
	
}
