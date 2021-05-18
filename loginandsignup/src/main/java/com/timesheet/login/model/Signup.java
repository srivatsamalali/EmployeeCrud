package com.timesheet.login.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Signup {
	
	@Id
	int empid;
	String firstname;
	String lastname;
	String mail_id;
	String password;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
		return "Signup [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", mail_id=" + mail_id
				+ ", password=" + password + "]";
	}
	
	public Signup(int empid, String firstname, String lastname, String mail_id, String password) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mail_id = mail_id;
		this.password = password;
	}
	
	public Signup() {
	}
	
	
	

}
