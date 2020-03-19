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
import javax.persistence.Table;

@Entity
@Table(name="FRS_TBL_Schedule")
public class ScheduleBean {

	@Id
	@Column(name="Scheduleid")
	private String scheduleID;
//	@Column(name="Flightid")
//	private String flightID;
//	@Column(name="Routeid")
//	private String routeID;
	@Column(name="TravelDuration")
	private int travelDuration;
	@Column(name="AvailableDays")
	private String availableDays;
	@Column(name="DepartureTime")
	private String departureTime;
	
	@ManyToOne
	@JoinColumn(name="Routeid")
	RouteBean routeID;
	
	@ManyToOne
	@JoinColumn(name="Flightid")
	FlightBean flightID;
	
	@OneToMany(mappedBy="scheduleID")
	List<ReservationBean> al=new ArrayList<ReservationBean>();

	public ScheduleBean() {
		super();
	}

	public ScheduleBean(String scheduleID, int travelDuration, String availableDays, String departureTime,
			RouteBean routeID, FlightBean flightID) {
		super();
		this.scheduleID = scheduleID;
		this.travelDuration = travelDuration;
		this.availableDays = availableDays;
		this.departureTime = departureTime;
		this.routeID = routeID;
		this.flightID = flightID;
	}

	@Override
	public String toString() {
		return "ScheduleBean [scheduleID=" + scheduleID + ", travelDuration=" + travelDuration + ", availableDays="
				+ availableDays + ", departureTime=" + departureTime + ", routeID=" + routeID.getRouteID() + ", flightID=" + flightID.getFlightID()
				+ "]";
	}

	public String getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}

	public int getTravelDuration() {
		return travelDuration;
	}

	public void setTravelDuration(int travelDuration) {
		this.travelDuration = travelDuration;
	}

	public String getAvailableDays() {
		return availableDays;
	}

	public void setAvailableDays(String availableDays) {
		this.availableDays = availableDays;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public RouteBean getRouteID() {
		return routeID;
	}

	public void setRouteID(RouteBean routeID) {
		this.routeID = routeID;
	}

	public FlightBean getFlightID() {
		return flightID;
	}

	public void setFlightID(FlightBean flightID) {
		this.flightID = flightID;
	}
	
	
	
	

	
	
	
	
	


	
	
	

	
	
	
	
}
