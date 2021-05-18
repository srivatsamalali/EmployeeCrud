package com.timesheet.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.login.model.Signup;

public interface SignupRepo extends JpaRepository<Signup, Integer> {

}
