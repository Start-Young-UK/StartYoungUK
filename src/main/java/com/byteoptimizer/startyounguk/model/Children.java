package com.byteoptimizer.startyounguk.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Children {

	@Id
	private Integer childrenid;
	
	@Column
	private String name;
	
	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> interests;
	
	@Column
	private Date dob;

	@OneToOne
	private User user;
	
	@ManyToOne
	@JoinColumn()
	private School school;

	public Children() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Children(String name, List<String> interests, Date dob, User user, School school) {
		super();
		this.name = name;
		this.interests = interests;
		this.dob = dob;
		this.user = user;
		this.school = school;
	}

	public Integer getChildrenid() {
		return childrenid;
	}

	public void setChildrenid(Integer childrenid) {
		this.childrenid = childrenid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
	
}
