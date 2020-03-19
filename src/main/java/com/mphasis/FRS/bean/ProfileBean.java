package com.mphasis.FRS.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name=" FRS_TBL_User_Profile")
public class ProfileBean {

	@Id
	@Column(name="Userid")
	private String userID;
	@Column(name="Firstname")
	private String firstName;
	@Column(name="Lastname")
	private String lastName;	
//	@Temporal(TemporalType.DATE)
	@Column(name="DateOfBirth")
	private Date dateOfBirth;
	@Column(name="Gender")
	private String gender;
	@Column(name="Street")
	private String street;
	@Column(name="Location")
	private String location;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="Pincode")
	private String pincode;
	@Column(name="MobileNo")
	private String mobileNo;
	@Column(name="EmailId")
	private String emailID;
	
	@Column(name="Password")
	private String passWord;
	
	@OneToOne
	@JoinColumn(name="Userid")
	CredentialsBean Userid;

	public ProfileBean() {
		super();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public CredentialsBean getUserid() {
		return Userid;
	}

	public void setUserid(CredentialsBean userid) {
		Userid = userid;
	}

	@Override
	public String toString() {
		return "ProfileBean [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", street=" + street + ", location="
				+ location + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", emailID=" + emailID + ", passWord=" + passWord + ", Userid=" + Userid + "]";
	}

	public ProfileBean(String userID, String firstName, String lastName, Date dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailID,
			String passWord, CredentialsBean userid2) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
		this.passWord = passWord;
		Userid = userid2;
	}

	

	
	
	
}
