package com.timesheet.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.login.model.Login;
import com.timesheet.login.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
	@Autowired
	LoginService service;
	
	@GetMapping("login")
	public List<Login> listallusers(){
		List<Login> usersList=service.login();
		return usersList;
	}
	
}
