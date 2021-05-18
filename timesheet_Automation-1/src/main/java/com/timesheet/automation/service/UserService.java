package com.timesheet.automation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.automation.model.User;
import com.timesheet.automation.repo.UserRepo;


@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public List<User> listusers(){
		List<User> uList=repo.findAll();
		return uList;
	}
	
	public void insertUser(User user) {
		repo.save(user);
	}
	
	public Optional<User> getBook(int empid){
    	Optional<User> userOptional = repo.findById(empid);
    	return userOptional;
    }
	
	public String update(User user,int empid) {
		
		String msgString="";
		Optional<User> userOptional=repo.findById(empid);
		if(userOptional.isPresent()) {
			repo.save(user);
			msgString="data updated";
		}else {
			msgString="user not found";
		}
		return msgString;
	}
	
	public int delete(int empid) {
		repo.deleteById(empid);
		return 1;
	}
	
	public Optional<User> getbyId(int empid) {
		Optional<User> userOptional=repo.findById(empid);
		return userOptional;
		
	}
	
}
