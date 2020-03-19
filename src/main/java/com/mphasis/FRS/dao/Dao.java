package com.mphasis.FRS.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mphasis.FRS.bean.CredentialsBean;
import com.mphasis.FRS.bean.CreditCardBean;
import com.mphasis.FRS.bean.FlightBean;
import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ProfileBean;
import com.mphasis.FRS.bean.ReservationBean;
import com.mphasis.FRS.bean.RouteBean;
import com.mphasis.FRS.bean.ScheduleBean;


@Repository
public class Dao {
	
	
	@Autowired
	SessionFactory sf;
	
	// *************************FLIGHT METHODS*************************************************
	
public List<FlightBean> flightList(){
		
		Session sn= sf.openSession();
		Query q=sn.createQuery("from FlightBean");
		List<FlightBean> flightList =q.list();
		sn.close();
		return flightList;		
	}
public FlightBean addFlight(FlightBean newFlight)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newFlight);
	trx.commit();
	sn.close();
	return newFlight;
}
public FlightBean delFlight(String flightId) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	FlightBean delflight=(FlightBean)sn.get(FlightBean.class, flightId);
	sn.delete(delflight);
	trx.commit();
	sn.close();
	return delflight;
}

//@ExceptionHandler(Fligj)
//{
//	
//}

public FlightBean updateFlight(FlightBean UpdatedFlight)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update(UpdatedFlight);
	trx.commit();
	sn.close();
	return UpdatedFlight;
	
}

//*************************ROUTE METHODS******************************************************

public List<RouteBean> routeList()
{
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from RouteBean");
	List<RouteBean> routeList=q2.list();
	sn.close();
	return routeList;
}
public RouteBean addRoute(RouteBean newRoute)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newRoute);
	trx.commit();
	sn.close();
	return newRoute;
}
public RouteBean delRoute(String delRouteID) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	RouteBean delRoute = new RouteBean(delRouteID, null, null, 0, 0);
	delRoute=(RouteBean)sn.get(RouteBean.class, delRoute.getRouteID());
	sn.delete(delRoute);
	trx.commit();
	sn.close();
	return delRoute;
}
public RouteBean updateRoute(RouteBean UpdatedRoute)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update(UpdatedRoute);
	trx.commit();
	sn.close();
	return UpdatedRoute;
	
}

//**************************************************SCHEDULE METHODS **************************************

public List<ScheduleBean> scheduleList()
{
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from ScheduleBean");
	List<ScheduleBean> scheduleList=q2.list();
	sn.close();
	return scheduleList;
}
public ScheduleBean addSchedule(ScheduleBean newSchedule)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newSchedule);
	trx.commit();
	sn.close();
	return newSchedule;
}
public ScheduleBean delSchedule(String delscheduleID) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	ScheduleBean delScheduleBean=new ScheduleBean(delscheduleID, 0, null, null, null, null);
	delScheduleBean=(ScheduleBean)sn.get(ScheduleBean.class, delScheduleBean.getScheduleID());
	sn.delete(delScheduleBean);
	trx.commit();
	sn.close();
	return delScheduleBean;
}
public ScheduleBean updateSchedule(ScheduleBean UpdatedSchedule)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update( UpdatedSchedule);
	trx.commit();
	sn.close();
	return  UpdatedSchedule;
	
}

//***************************************CREDENTIAL METHODS***************************************

public List<CredentialsBean> credentialList()
{
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from CredentialsBean");
	List<CredentialsBean> credList=q2.list();
	sn.close();
	return credList;
}
public CredentialsBean addCredential( CredentialsBean newCredentials)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newCredentials);
	trx.commit();
	sn.close();
	return newCredentials;
}
public CredentialsBean delCredential(CredentialsBean delCredential) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	delCredential=(CredentialsBean)sn.get(CredentialsBean.class, delCredential.getUserID());
	sn.delete(delCredential);
	trx.commit();
	sn.close();
	return delCredential;
}

public CredentialsBean updateCredential(CredentialsBean UpdateCredential)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update(UpdateCredential);
	trx.commit();
	sn.close();
	return UpdateCredential;
}


//**********************************PASSENGER METHODS*************************************************

public List<PassengerBean> passengerList(String reservationId)
{
	Session sn=sf.openSession();
	Query q=sn.createQuery("from PassengerBean where reservationID=?");
	q.setString(0, reservationId);
	List<PassengerBean> passengerList=q.list();
	sn.close();
	return passengerList;
}
public PassengerBean addPassenger(PassengerBean newPassenger)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newPassenger);
	trx.commit();
	sn.close();
	return newPassenger;
}

//***********************************RESERVATION METHODS********************************************

//public List<ReservationBean> reservationList()
//{
//	Session sn=sf.openSession();
//	Query q2=sn.createQuery("from ReservationBean");
//	List<ReservationBean> reservationList=q2.list();
//	sn.close();
//	return reservationList;
//}
//public ReservationBean addReservation(ReservationBean newReservation)
//{
//	Session sn=sf.openSession();
//	Transaction trx= sn.beginTransaction();
//	sn.save(newReservation);
//	trx.commit();
//	return newReservation;
//}
//public ReservationBean delReservation(ReservationBean delReservation) {
//	Session sn=sf.openSession();
//	Transaction trx= sn.beginTransaction();
//	delReservation = (ReservationBean)sn.get(ReservationBean.class, delReservation.getReservationID());
//	sn.delete(delReservation);
//	trx.commit();
//	return delReservation;
//}
//
//
//public ReservationBean updateReservation(ReservationBean UpdatedRs)
//{
//	Session sn=sf.openSession();
//	Transaction trx= sn.beginTransaction();
//	sn.update(UpdatedRs);
//	trx.commit();
//	return UpdatedRs;
//}

//************************************LOGIN METHODS***************************************************** 	
public CredentialsBean login(CredentialsBean loginCredential)
{
	Session sn=sf.openSession();
	
    Query q=sn.createQuery("from CredentialsBean where userID=? and passWord=?");
    q.setString(0, loginCredential.getUserID());
    q.setString(1, loginCredential.getpassWord());
    List<CredentialsBean> loggedIn = q.list();
    System.out.println(loggedIn);
    loginCredential = loggedIn.get(0);  
    loginCredential.setLoginStatus(1);
    System.out.println(loginCredential);
    
//    Transaction trx = sn.beginTransaction();
//    sn.save(loginCredential);
//    trx.commit();
    sn.close();
    return loginCredential;

}

public CredentialsBean logout (CredentialsBean logoutCredential) {
//	Session sn = sf.openSession();
//	Transaction trx = sn.beginTransaction();
	logoutCredential.setLoginStatus(0);
//	sn.save(logoutCredential);
//	trx.commit();
//	sn.close();
	return logoutCredential;
}

//************************************CreditCards METHODS*****************************************************************

public List<CreditCardBean> creditList()
{
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from CreditCardBean");
	List<CreditCardBean> creditList=q2.list();
	sn.close();
	return creditList;
}
public CreditCardBean addCreditCard(CreditCardBean creditBean)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(creditBean);
	trx.commit();
	sn.close();
	return creditBean;
}
public CreditCardBean delCreditcard(CreditCardBean creditCard) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	creditCard =(CreditCardBean) sn.get(CreditCardBean.class, creditCard.getCreditCardNumber());
	sn.delete(creditCard);
	trx.commit();
	sn.close();
	return creditCard;
}


public CreditCardBean updateCreditCard(CreditCardBean creditcardnumber)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update(creditcardnumber);
	trx.commit();
	sn.close();
	return creditcardnumber;
}

//-----------------------------------------------CHANGE PASSWORD----------------------------------
public CredentialsBean changePassword(String userId,String oldPassword,String newPassword) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	CredentialsBean credentialsBean=(CredentialsBean) sn.get(CredentialsBean.class,userId);
	System.out.println(credentialsBean.getpassWord()+"  "+newPassword);
	if(credentialsBean.getpassWord().trim().equalsIgnoreCase(oldPassword.trim()))
	{
		
	System.out.println("password match");
	credentialsBean.setpassWord(newPassword);
	
	sn.update(credentialsBean);
	trx.commit();
	sn.close();
	return credentialsBean;
	}
	return null;
}
//-----------------------------------------------------------BOOK TICKET--------------------------------------------
public ReservationBean bookTicket(ReservationBean reservationBean)
{
	Session sn=sf.openSession();
	Transaction trx=sn.beginTransaction();
	System.out.println(reservationBean.getScheduleID());
	sn.save(reservationBean);
	FlightBean flightBean=reservationBean.getScheduleID().getFlightID();
	System.out.println(flightBean.getFlightID());
	UpdateNoOfSeats(flightBean,reservationBean);
	System.out.println(reservationBean.getNoOfSeats());
	sn.update(flightBean);
	trx.commit();
	sn.close();
	return reservationBean;
	
}

public FlightBean UpdateNoOfSeats(FlightBean flightBean,ReservationBean reservationBean)
{
	
	System.out.println(flightBean.getFlightID());
	int noOfSeats= flightBean.getReservationCapacity();
	System.out.println(noOfSeats + "FLIGHT BEAN RESERVATION CAPCITY");
	int reservationBean1=reservationBean.getNoOfSeats();
	int updateseats=noOfSeats-reservationBean1;
	flightBean.setReservationCapacity(updateseats);
	System.out.println(reservationBean1 +" NO OF SEATS OF PASSENGER");
	return flightBean;
}

public ReservationBean cancelTicket(ReservationBean delreservationBean )
{
	Session sn=sf.openSession();
	Transaction trx=sn.beginTransaction();
	delreservationBean=(ReservationBean)sn.get(ReservationBean.class, delreservationBean.getReservationID());
	delreservationBean.setBookingStatus(0);
	sn.update(delreservationBean);
	FlightBean flightBean=delreservationBean.getScheduleID().getFlightID();
	System.out.println(flightBean.getFlightID());
	UpdateNoOfSeatsCancel(flightBean,delreservationBean);
	System.out.println(delreservationBean.getNoOfSeats());
	sn.update(flightBean);
	trx.commit();
	sn.close();
	return delreservationBean;
	
}
public FlightBean UpdateNoOfSeatsCancel(FlightBean flightBean,ReservationBean reservationBean)
{
	
	System.out.println(flightBean.getFlightID());
	int noOfSeats= flightBean.getReservationCapacity();
	System.out.println(noOfSeats + "FLIGHT BEAN RESERVATION CAPCITY");
	int reservationBean1=reservationBean.getNoOfSeats();
	int updateseats=noOfSeats+reservationBean1;
	flightBean.setReservationCapacity(updateseats);
	System.out.println(reservationBean1 +" NO OF SEATS OF PASSENGER");
	return flightBean;
}

//-------------------------------------------------ListReservationById-------------------------------------------------------

public List<ReservationBean> listReservationById(String userID){
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from ReservationBean where userID=?");
	q2.setString(0, userID);
	List<ReservationBean> reservationList=q2.list();
	System.out.println(reservationList);
	
	sn.close();
	return reservationList;
	
}
//-------------------------------------------------------------Profile Methods--------------------------------------------
public List<ProfileBean> profileList()
{
	Session sn=sf.openSession();
	Query q2=sn.createQuery("from ProfileBean");
	List<ProfileBean> profileList=q2.list();
	sn.close();
	return profileList;
}
public ProfileBean addProfile(ProfileBean newProfile)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.save(newProfile);
	trx.commit();
	sn.close();
	return newProfile;
}
public ProfileBean delProfile(String delProfileID) {
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	ProfileBean delProfileBean=new ProfileBean(delProfileID, null, null, null, null, null, null, null, null, null, null, null, null, null);
	delProfileBean=(ProfileBean)sn.get(ProfileBean.class, delProfileID);
	sn.delete(delProfileID);
	trx.commit();
	sn.close();
	return delProfileBean;
}

public ProfileBean updateProfile(ProfileBean UpdateProfile)
{
	Session sn=sf.openSession();
	Transaction trx= sn.beginTransaction();
	sn.update(UpdateProfile);
	trx.commit();
	sn.close();
	return UpdateProfile;
}

}
