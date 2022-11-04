package com.sporty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_pass")
public class userpassmodel {
	@Id
	@GeneratedValue
	@Column(name="userid")
	private int userid;
	@Column(name="password")
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public userpassmodel(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	@Override
	public String toString() {
		return "userpassmodel [userid=" + userid + ", password=" + password + "]";
	}

}
