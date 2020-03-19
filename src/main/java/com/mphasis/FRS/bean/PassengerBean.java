package com.mphasis.FRS.bean;

import java.util.ArrayList;
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
@Table(name="FRS_TBL_Passenger")
public class PassengerBean {
	
	@Id
	@Column(name="Passengerid")
	private String passengerID;
		
//	@Column(name="Reservationid")
//	private String reservationID;
	@Column(name="Name")
	private String name;
	@Column(name="Gender")
	private String gender;
	@Column(name="Age")
	private String age;
	@Column(name="Seatno")
	private String seatNo;
	
	@ManyToOne
	@JoinColumn(name="Reservationid")
	ReservationBean reservationID;

	public PassengerBean() {
		super();
	}

	public PassengerBean(String passengerID, String name, String gender, String age, String seatNo,
			ReservationBean reservationID) {
		super();
		this.passengerID = passengerID;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.seatNo = seatNo;
		this.reservationID = reservationID;
	}

	public String getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public ReservationBean getReservationID() {
		return reservationID;
	}

	public void setReservationID(ReservationBean reservationID) {
		this.reservationID = reservationID;
	}

	@Override
	public String toString() {
		return "PassengerBean [passengerID=" + passengerID + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", seatNo=" + seatNo + ", reservationID=" + reservationID + "]";
	}

	
	
	

	
	
}
