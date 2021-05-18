package com.timesheet.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.login.model.Login;

public interface LoginRepo extends JpaRepository<Login, Integer> {


}
