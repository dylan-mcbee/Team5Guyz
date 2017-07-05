package com.cinema.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CINEMA_USER")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
	@SequenceGenerator(allocationSize = 1, name = "userSeq", sequenceName = "USER_SEQ")
	@Column(name = "USER_ID")
	private int id;
	
	@Column(name = "EMAIL" , unique = true)
	private String email;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "REWARD_STATUS")
	@Enumerated(EnumType.ORDINAL)
	private RewardStatus rewardStatus;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "POINTS")
	private int points;
	
	@Column(name = "ADMIN")
	private boolean isAdmin;
	
	//@OneToMany(mappedBy = "receipt", fetch = FetchType.EAGER)
//	private List<Receipt> receipts;
	
	public User(){
		this.isAdmin = false;
	}



	public User(int id) {
		super();
		this.id = id;
		this.isAdmin = false;
	}


	public User(String email) {
		super();
		this.email = email;
		this.isAdmin = false;
	}



	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.isAdmin = false;
	}



	public User(String email, int id, String firstName, String lastName, String password, RewardStatus rewardStatus,
			String phoneNumber, int points, boolean isAdmin) {
		super();
		this.email = email;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.rewardStatus = rewardStatus;
		this.phoneNumber = phoneNumber;
		this.points = points;
		this.isAdmin = isAdmin;
//		this.receipts = receipts;
	}

	public User(String email, String firstName, String lastName, String password, RewardStatus rewardStatus,
			String phoneNumber, int points, boolean isAdmin) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.rewardStatus = rewardStatus;
		this.phoneNumber = phoneNumber;
		this.points = points;
		this.isAdmin = isAdmin;
//		this.receipts = receipts;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RewardStatus getRewardStatus() {
		return rewardStatus;
	}

	public void setRewardStatus(RewardStatus rewardStatus) {
		this.rewardStatus = rewardStatus;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", rewardStatus=" + rewardStatus + ", phoneNumber=" + phoneNumber
				+ ", points=" + points + ", isAdmin=" + isAdmin + "]";
	}
}