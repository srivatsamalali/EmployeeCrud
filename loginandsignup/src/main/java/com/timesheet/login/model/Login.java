package com.timesheet.login.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private int empid;
	private String mail_id;
	private String password;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [empid=" + empid + ", mail_id=" + mail_id + ", password=" + password + "]";
	}
	
	public Login(int empid, String mail_id, String password) {
		super();
		this.empid = empid;
		this.mail_id = mail_id;
		this.password = password;
	}
	
	
	public Login() {
	}
	
	
	

}
