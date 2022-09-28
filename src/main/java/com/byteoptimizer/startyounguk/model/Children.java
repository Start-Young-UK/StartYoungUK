package com.byteoptimizer.startyounguk.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Children {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer childrenid;
	
	@Column
	private String name;
	
	@Column
	private String interests;
	
	@Column
	private Date dob;

	@OneToOne
	private User user;
	
	@ManyToOne
	@JoinColumn(name="schoolid", nullable = false)
	private School school;
	
	@ManyToOne
	@JoinColumn(name="guardianid", nullable = false)
	private Guardian guardian;

	public Children() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Children(Integer childrenid, String name, String interests, Date dob, User user, School school,
			Guardian guardian) {
		super();
		this.childrenid = childrenid;
		this.name = name;
		this.interests = interests;
		this.dob = dob;
		this.user = user;
		this.school = school;
		this.guardian = guardian;
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

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
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

	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	
}
