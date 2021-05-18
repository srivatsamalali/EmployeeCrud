package com.timesheet.automation.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.automation.model.User;
import com.timesheet.automation.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("emp")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user")
	public List<User> getallUsers(){
		List<User> users=service.listusers();
		return users;
	}
	
	@GetMapping("/user/{empid}")
	public Optional<User> getbyId(@PathVariable("empid") int empid){
		Optional<User> userOptional=service.getbyId(empid);
		return userOptional;
	}
	
	@PostMapping("/insertUser")
	public int insertUser(@RequestBody User user) {
		service.insertUser(user);
		return 1;
	}
	
	@PutMapping("/updateUser/{empid}")
	public String updateUser(@RequestBody User user,@PathVariable int empid) {
		String msgString=service.update(user, empid);
		return msgString;
	}
	
	@DeleteMapping("/delete/{empid}")
	public int deleteUser(@PathVariable int empid) {
		int msg=service.delete(empid);
		return msg;
	}
}
