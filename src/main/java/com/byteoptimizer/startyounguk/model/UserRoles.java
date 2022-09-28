package com.byteoptimizer.startyounguk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleid;
	
	@Column
	private String rolename;

	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoles(String rolename) {
		super();
		this.rolename = rolename;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
