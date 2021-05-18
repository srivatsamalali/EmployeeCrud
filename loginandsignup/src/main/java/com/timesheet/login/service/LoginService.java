package com.timesheet.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.login.model.Login;
import com.timesheet.login.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo repo;
	
	public List<Login> login() {
		List<Login> login2=repo.findAll();
		System.out.println("working");
		return login2;
		
	}
	

}
