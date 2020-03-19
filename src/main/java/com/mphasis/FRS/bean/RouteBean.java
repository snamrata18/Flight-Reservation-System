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
@Table(name="FRS_TBL_Route")
public class RouteBean {
	
	@Id
	@Column(name="Routeid")
	private String routeID;
	@Column(name="Source")
	private String source;
	@Column(name="Destination")
	private String destination;
	@Column(name="Distance")
	private int distance;
	@Column(name="Fare")
	private double fare;
	
	@OneToMany(mappedBy="routeID")
	List<ScheduleBean> al=new ArrayList<ScheduleBean>();

	public RouteBean() {
		super();
	}

	public RouteBean(String routeID, String source, String destination, int distance, double fare) {
		super();
		this.routeID = routeID;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "RouteBean [routeID=" + routeID + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", fare=" + fare + "]";
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	
	

}
