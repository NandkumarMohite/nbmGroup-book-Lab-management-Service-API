package com.nbmgroups.nbmlabrary.main.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userinformationsignup")
public class UserSignUpInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UserId;
	@Column(name = "firstName")
	private String FirstName;
	private String LastName;
	
	private String MobileNumber;
	private String EmailId;
	private String State;
	private String District;
	private String Nationality;
	private String Taluka;
	private String Gender;
	private String Password;
	private String DateOfBirth;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		this.UserId = userId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		this.EmailId = emailId;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		this.District = district;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		this.Nationality = nationality;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		this.Taluka = taluka;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	public UserSignUpInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSignUpInformation(String firstName, String lastName, String mobileNumber, String emailId,
			String state, String district, String nationality, String taluka, String gender, String password,
			String dateOfBirth) {
		super();
//		this.UserId = userId;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.MobileNumber = mobileNumber;
		this.EmailId = emailId;
		this.State = state;
		this.District = district;
		this.Nationality = nationality;
		this.Taluka = taluka;
		this.Gender = gender;
		this.Password = password;
		this.DateOfBirth = dateOfBirth;
	}
	

}
