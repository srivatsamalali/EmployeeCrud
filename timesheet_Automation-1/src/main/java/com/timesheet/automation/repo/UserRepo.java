package com.timesheet.automation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.automation.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
