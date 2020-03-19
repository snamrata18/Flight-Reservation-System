package com.mphasis.FRS.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="FRS_TBL_Reservation")
public class ReservationBean {
	@Id
	@Column(name="Reservationid")
	private String reservationID;
	
//	@Column(name="Userid")
//	private String userID;
	
//	@Column(name="Scheduleid")
//	private String scheduleID;
	
	@Column(name="Reservationtype")
	private String reservationType;
	
	@Column(name="Bookingdate")
	private Date bookingDate;
	
	@Column(name="Journeydate")
	private Date journeyDate;
	
	@Column(name="Noofseats")
	private int noOfSeats;
	
	@Column(name="Totalfare")
	private double totalFare;
	
	@Column(name="Bookingstatus")
	private int bookingStatus;
	
     @ManyToOne
     @JoinColumn(name="Scheduleid")
     ScheduleBean scheduleID;
     
     @ManyToOne
     @JoinColumn(name="Userid")
     CredentialsBean userID;

	public ReservationBean() {
		super();
	}

	public ReservationBean(String reservationID, String reservationType, Date bookingDate, Date journeyDate,
			int noOfSeats, double totalFare, int bookingStatus, ScheduleBean scheduleID, CredentialsBean userID) {
		super();
		this.reservationID = reservationID;
		this.reservationType = reservationType;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.noOfSeats = noOfSeats;
		this.totalFare = totalFare;
		this.bookingStatus = bookingStatus;
		this.scheduleID = scheduleID;
		this.userID = userID;
	}

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getReservationType() {
		return reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public int getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(int bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public ScheduleBean getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(ScheduleBean scheduleID) {
		this.scheduleID = scheduleID;
	}

	public CredentialsBean getUserID() {
		return userID;
	}

	public void setUserID(CredentialsBean userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "ReservationBean [reservationID=" + reservationID + ", reservationType=" + reservationType
				+ ", bookingDate=" + bookingDate + ", journeyDate=" + journeyDate + ", noOfSeats=" + noOfSeats
				+ ", totalFare=" + totalFare + ", bookingStatus=" + bookingStatus + ", scheduleID=" + scheduleID
				+ ", userID=" + userID + "]";
	}
     
     

	
	
	
	
	
	
}
