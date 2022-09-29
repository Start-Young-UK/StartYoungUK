package com.byteoptimizer.startyounguk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer schoolid;
	
	@Column
	private Integer maxStudents;
	
	@Column
	private Integer scholarshipOffering;
	
	@Column
	private String accreditation;
	
	@OneToOne
	private User user;
	
//	@OneToMany(mappedBy="school", fetch = FetchType.LAZY)
//	private List<Children> childrens;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(Integer maxStudents, Integer scholarshipOffering, String accreditation, User user) {
		super();
		this.maxStudents = maxStudents;
		this.scholarshipOffering = scholarshipOffering;
		this.accreditation = accreditation;
		this.user = user;
	}



	public Integer getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(Integer schoolid) {
		this.schoolid = schoolid;
	}

	public Integer getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(Integer maxStudents) {
		this.maxStudents = maxStudents;
	}

	public Integer getScholarshipOffering() {
		return scholarshipOffering;
	}

	public void setScholarshipOffering(Integer scholarshipOffering) {
		this.scholarshipOffering = scholarshipOffering;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public List<Children> getChildrens() {
//		return childrens;
//	}
//
//	public void setChildrens(List<Children> childrens) {
//		this.childrens = childrens;
//	}

	
	
}
