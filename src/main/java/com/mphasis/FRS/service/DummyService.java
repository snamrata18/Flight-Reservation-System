package com.mphasis.FRS.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ReservationBean;
import com.mphasis.FRS.bean.ScheduleBean;
import com.mphasis.FRS.dao.Dao;



public class DummyService {
	
	@Autowired
	Dao dao;

//	public ArrayList<ScheduleBean> viewScheduleByRoute(String source, String destination, Date date)
//	{
//		List<ScheduleBean>scheduleList= dao.scheduleList();
//		return (ArrayList<ScheduleBean>) scheduleList ;
//	}
//	
//	
//	
//	public List<PassengerBean> Ticket(ReservationBean reservationBean, ArrayList<PassengerBean> passengers)
//	{
//		List<PassengerBean>passList=dao.passList();
//		return passList;
//	
//	
//	}
//	
//	public boolean CancelTicket(ReservationBean String ReservationID)
//	{
//		boolean flag=dao.updateReservation(UpdatedRs);
//		return true;
//	}


}

