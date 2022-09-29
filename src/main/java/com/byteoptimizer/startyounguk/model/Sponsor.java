package com.byteoptimizer.startyounguk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sponsor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sponsorid;
	
	@Column
	private Integer amount;
	
	@Column
	private String category;
	
	@OneToOne
	private User user;
	
	

	public Sponsor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sponsor(Integer amount, String category, User user) {
		super();
		this.amount = amount;
		this.category = category;
		this.user = user;
	}

	public Integer getSponsorid() {
		return sponsorid;
	}

	public void setSponsorid(Integer sponsorid) {
		this.sponsorid = sponsorid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
