package com.timesheet.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.login.model.Signup;
import com.timesheet.login.repo.SignupRepo;

@Service
public class SignupService {
	
	@Autowired
	SignupRepo repo;
	
	public void insertuser(Signup signup) {
		repo.save(signup);
	}
	

	public List<Signup> login() {
		List<Signup> login2=repo.findAll();
		System.out.println("working");
		return login2;
		
	}

}
