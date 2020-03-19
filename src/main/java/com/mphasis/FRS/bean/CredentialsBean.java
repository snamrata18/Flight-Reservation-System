package com.mphasis.FRS.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="FRS_TBL_User_Credentials")

public class CredentialsBean {
	@Id
	@Column(name="Userid")
	private String userID;
	@Column(name="passWord")
	private String passWord;
	@Column(name="Usertype")
	private String userType;
	@Column(name="Loginstatus")
	private int loginStatus;
	
	@OneToOne(mappedBy="Userid")
	ProfileBean Userid;
	
	@OneToMany(mappedBy="userID")
	List<ReservationBean> al=new ArrayList<ReservationBean>();
	
//	@OneToMany(mappedBy="userId")
//	List<CreditCardBean> creditcardBean=new ArrayList<CreditCardBean>();
	
	
	
	public CredentialsBean() {
		super();
	}

	public CredentialsBean(String userID, String passWord, String userType, int loginStatus) {
		super();
		this.userID = userID;
		this.passWord = passWord;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getpassWord() {
		return passWord;
	}

	public void setpassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "CredentialsBean [userID=" + userID + ", passWord=" + passWord + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + "]";
	}
	
	
	

	
	
	
	
	

}
