package com.hcl.gl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "admintable")
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loginId", referencedColumnName = "email")
	
	private int adminid;
	private String fullname;
	private String emailId;
	private String Password;
	public int getAdminId() {
		return adminid;
	}
	public void setAdminId(int adminid) {
		this.adminid = adminid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
}
