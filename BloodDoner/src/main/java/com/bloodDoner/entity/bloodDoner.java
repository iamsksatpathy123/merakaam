package com.bloodDoner.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bloodDoner")
public class bloodDoner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="donorId")
	private int donorId;
	@Column(name="userName")
	private String userName;
	@Column(name="bloodGroup")
	private String bloodGroup;
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	
	
}