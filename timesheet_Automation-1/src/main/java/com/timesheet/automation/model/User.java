package com.timesheet.automation.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {
	
	@Id
	private int empid;
	private String emp_firstname;
	private String emp_lastname;
	private String gender;
	private String mail_id;
	private Date DOJ;
	private String department_name;
	
	
	//getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmp_firstname() {
		return emp_firstname;
	}
	public void setEmp_firstname(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}
	public String getEmp_lastname() {
		return emp_lastname;
	}
	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	//toString
	@Override
	public String toString() {
		return "User [empid=" + empid + ", emp_firstname=" + emp_firstname + ", emp_lastname=" + emp_lastname
				+ ", gender=" + gender + ", mail_id=" + mail_id + ", DOJ=" + DOJ + ", department_name="
				+ department_name + "]";
	}
	
	//parameterised constructor
	public User(int empid, String emp_firstname, String emp_lastname, String gender, String mail_id, Date dOJ, String department_name) {
		super();
		this.empid = empid;
		this.emp_firstname = emp_firstname;
		this.emp_lastname = emp_lastname;
		this.gender = gender;
		this.mail_id = mail_id;
		DOJ = dOJ;
		this.department_name=department_name;
	}
	
	
	//default constructor
	public User() {
	}
	
	
	
	

}
