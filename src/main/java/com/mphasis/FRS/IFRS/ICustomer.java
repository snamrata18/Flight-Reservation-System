package com.mphasis.FRS.IFRS;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ReservationBean;
import com.mphasis.FRS.bean.ScheduleBean;

public interface ICustomer {
	
	
	ArrayList<ScheduleBean> viewScheduleByRoute(String source, String destination, Date date); 
	public String reserveTicket(ReservationBean reservationBean, ArrayList<PassengerBean> passengers);
	public String cancelTicket(String reservationId);
	Map<ReservationBean,PassengerBean> viewTicket(String reservationId);
	Map<ReservationBean,PassengerBean> printTicket(String reservationId);
}
