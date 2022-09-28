package com.byteoptimizer.startyounguk.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
	@Column
	private String password;
	
	@Column
	private String username;
	
	@Column
	private String email;
	
	@Column
	private Long mobile;
	
	@Column
	private String gender;
	
	@Column
	private String city;
	
	@OneToOne
	private UserRoles userRoles;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public User(String password, String username, String email, Long mobile, String gender, String city,
			UserRoles userRoles) {
		super();
		this.password = password;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.city = city;
		this.userRoles = userRoles;
	}




	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserRoles getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(UserRoles userRoles) {
		this.userRoles = userRoles;
	}
	
	
}
