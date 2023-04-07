package com.hcl.gl.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loginId", referencedColumnName = "email")

	@OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
	@JoinColumn(name="orderId",referencedColumnName="userid")

	private int userid;
	private String fullname;
	private String emailId;
	private String Password;

	public int getUserId() {
		return userid;
	}
	public void setUserId(int userid) {
		this.userid = userid;
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
		Password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + userid + ", fullname=" + fullname + ", emailId=" + emailId + ", Password=" + Password + "]";
	}
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setOrders(List<Orders> l) {
		// TODO Auto-generated method stub
		
	}
}