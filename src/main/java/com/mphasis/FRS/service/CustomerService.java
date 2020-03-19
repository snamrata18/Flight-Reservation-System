package com.mphasis.FRS.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.FRS.bean.CredentialsBean;
import com.mphasis.FRS.bean.CreditCardBean;
import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ProfileBean;
import com.mphasis.FRS.bean.ReservationBean;
import com.mphasis.FRS.bean.ScheduleBean;
import com.mphasis.FRS.dao.Dao;

@Service
public class CustomerService {
	
	@Autowired
	Dao customerDao;
	
	public ArrayList<ScheduleBean> viewScheduleByRoute(String source, String destination, Date date)
	{
		List<ScheduleBean>scheduleList= customerDao.scheduleList();
		return (ArrayList<ScheduleBean>) scheduleList ;
		
	}
	
	//--------------------------------------ListReservationById-------------------------------------------------------
	
	public List<ReservationBean> listResrvationById(String userID){
		
		List<ReservationBean> listreservationById=customerDao.listReservationById(userID);
		return listreservationById;
	}
	
	
//	public List<ReservationBean> viewReservation() //Convert to cancel booking
//	{
//		//List<ReservationBean> reservationList=customerDao.reservationList();
//		//return reservationList ;
//		
//	}	
	
//	public List<PassengerBean> Ticket(ReservationBean reservationBean, PassengerBean passengers)
//	{
//		List<PassengerBean>passList=customerDao.passengerList();
//		return passList;
//	}
//	
//	public ReservationBean CancelTicket(ReservationBean delReservation)
//	{
//		ReservationBean delreservation=customerDao.delReservation(delReservation);
//		return delreservation;				
//	}
	
	
//	Map<ReservationBean,PassengerBean> viewTicket(String reservationId) 
//	{
//		
//		//need to see deeply
//	}
//	
	
	
//	Map<ReservationBean,PassengerBean> printTicket(String reservationId)
//	{
//		//need to see deeply
//	}
//	

	
	//------------------------------------------------------LOGIN ----------------------------------------------------------
	
	public CredentialsBean login(CredentialsBean loginCredential)
	{
		CredentialsBean credentialsBean=customerDao.login(loginCredential);
		return loginCredential;
	}
	
	//------------------------------------------------------CHANGE PASSWORD----------------------------------------------------------
//	public CredentialsBean updateCredential(CredentialsBean UpdateCredential)
//	{
//		CredentialsBean credentialbean=customerDao.updateCredential(UpdateCredential);
//		return credentialbean;
//	}
	
	public CredentialsBean changePassword(String userId,String oldPassword,String newPassword)
	{
		CredentialsBean credentialBean=customerDao.changePassword(userId, oldPassword, newPassword);
		return  credentialBean;
	}
	
	//	*************************LOGOUT**********************************************************************************************
	public CredentialsBean logout (CredentialsBean logoutCredential)
	{
		CredentialsBean credentialsBean=customerDao.logout(logoutCredential);
		return credentialsBean;
		
	
	}
	
	//---------------------------------CREDITCARD METHODS-------------------------------
	
	public List<CreditCardBean> viewCreditList()
	{
		List<CreditCardBean> creditList= customerDao.creditList();
		return creditList;
		
	}
	
	//--------------------------------------ADD PASSENGER-----------------------------------------------------------------
	
		public PassengerBean addpassenger(PassengerBean passengerbean) {
			
			PassengerBean addPassenger=customerDao.addPassenger(passengerbean);
		return addPassenger;	
		}
		
		//--------------------------------------PROFILE SERVICE----------------------------------------------------
		
		public ProfileBean addProfile(ProfileBean newProfile) {
			
			ProfileBean profileBean=customerDao.addProfile(newProfile);
			return profileBean;
		}
		
		public ProfileBean delProfile(String delUserID)
		{
			ProfileBean profileBean=customerDao.delProfile(delUserID);
			return profileBean;
		}
		
		public ProfileBean updateProfile(ProfileBean profileBean)
		{
			ProfileBean profilebean=customerDao.updateProfile(profileBean);
			return profilebean;
		}
	

	
}
