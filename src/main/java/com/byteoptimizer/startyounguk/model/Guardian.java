package com.byteoptimizer.startyounguk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Guardian {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer guardianid;
	
	@Column
	private Integer annualIncome;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy="guardian")
	private List<Children> childrens;

	public Guardian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guardian(Integer annualIncome, User user, List<Children> childrens) {
		super();
		this.annualIncome = annualIncome;
		this.user = user;
		this.childrens = childrens;
	}

	public Integer getGuardianid() {
		return guardianid;
	}

	public void setGuardianid(Integer guardianid) {
		this.guardianid = guardianid;
	}

	public Integer getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Integer annualIncome) {
		this.annualIncome = annualIncome;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Children> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Children> childrens) {
		this.childrens = childrens;
	}
	
}
