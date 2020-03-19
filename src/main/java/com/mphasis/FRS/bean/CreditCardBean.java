package com.mphasis.FRS.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FRS_TBL_CreditCard")
public class CreditCardBean {

	@Id
	 @Column(name="CreditCardNumber")
	 private String creditCardNumber;
	 @Column(name="ValidFrom")
	 private String validFrom;
	 @Column(name="ValidTo")
	 private String validTo;
	 @Column(name="CreditBalance")
	 private int creditBalance;
	 
//	 
//	 @ManyToOne
//	 @JoinColumn(name="Userid")
//	 CredentialsBean userId;
	 @Column(name="Userid")
	 String userId;
//
//	public CreditCardBean(String creditCardNumber, String validFrom, String validTo, int creditBalance,
//			CredentialsBean userId) {
//		super();
//		this.creditCardNumber = creditCardNumber;
//		this.validFrom = validFrom;
//		this.validTo = validTo;
//		this.creditBalance = creditBalance;
//		this.userId = userId;
//	}
//
//
	public CreditCardBean() {
		super();
	}
//
//
//	public String getCreditCardNumber() {
//		return creditCardNumber;
//	}
//
//
//	public void setCreditCardNumber(String creditCardNumber) {
//		this.creditCardNumber = creditCardNumber;
//	}
//
//
//	public String getValidFrom() {
//		return validFrom;
//	}
//
//
//	public void setValidFrom(String validFrom) {
//		this.validFrom = validFrom;
//	}
//
//
//	public String getValidTo() {
//		return validTo;
//	}
//
//
//	public void setValidTo(String validTo) {
//		this.validTo = validTo;
//	}
//
//
//	public int getCreditBalance() {
//		return creditBalance;
//	}
//
//
//	public void setCreditBalance(int creditBalance) {
//		this.creditBalance = creditBalance;
//	}
//
//
//	public CredentialsBean getUserId() {
//		return userId;
//	}
//
//
//	public void setUserId(CredentialsBean userId) {
//		this.userId = userId;
//	}
//
//
//	@Override
//	public String toString() {
//		return "CreditCardBean [creditCardNumber=" + creditCardNumber + ", validFrom=" + validFrom + ", validTo="
//				+ validTo + ", creditBalance=" + creditBalance + ", userId=" + userId + "]";
//	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public int getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "CreditCardBean [creditCardNumber=" + creditCardNumber + ", validFrom=" + validFrom + ", validTo="
				+ validTo + ", creditBalance=" + creditBalance + ", userId=" + userId + "]";
	}

	public CreditCardBean(String creditCardNumber, String validFrom, String validTo, int creditBalance, String userId) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userId = userId;
	}
	 
	 
	
}
