package com.mphasis.FRS.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FRS_TBL_Flight")
public class FlightBean {

	@Id
	@Column(name="FlightId")
	private String flightID;
	@Column(name="FlightName")
	private String flightName;
	@Column(name="Seatingcapacity")
	private int seatingCapacity;
	@Column(name="Reservationcapacity")
	private int reservationCapacity;
	
	@OneToMany(mappedBy="flightID")
	List<ScheduleBean> al=new ArrayList<ScheduleBean>();
	

	public FlightBean() {
		super();
	}


	public FlightBean(String flightID, String flightName, int seatingCapacity, int reservationCapacity) {
		super();
		this.flightID = flightID;
		this.flightName = flightName;
		this.seatingCapacity = seatingCapacity;
		this.reservationCapacity = reservationCapacity;
	}


	public String getFlightID() {
		return flightID;
	}


	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public int getSeatingCapacity() {
		return seatingCapacity;
	}


	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}


	public int getReservationCapacity() {
		return reservationCapacity;
	}


	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}


	@Override
	public String toString() {
		return "FlightBean [flightID=" + flightID + ", flightName=" + flightName + ", seatingCapacity="
				+ seatingCapacity + ", reservationCapacity=" + reservationCapacity + "]";
	}

	
	
	
	
}
