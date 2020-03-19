package com.mphasis.FRS.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.FRS.bean.CredentialsBean;
import com.mphasis.FRS.bean.FlightBean;
import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ProfileBean;
import com.mphasis.FRS.bean.RouteBean;
import com.mphasis.FRS.bean.ScheduleBean;
import com.mphasis.FRS.dao.Dao;

@Service
public class AdminService {
	
	@Autowired
	Dao AdminDao;
	
	
	
//	*************************LOGIN**********************************************************************************************
	public CredentialsBean login(CredentialsBean loginCredential)
	{
		CredentialsBean credentialsBean=AdminDao.login(loginCredential);
		return credentialsBean;
	}
	
	
//	*****************FLIGHT DEATILS OPERATIONS**********************************************************************************
	
	
//	***********ADD Flight by Admin**********************************************************************************************
	
	public FlightBean addFlight(FlightBean newFlight) {
		FlightBean flightbean = AdminDao.addFlight(newFlight);
		return flightbean;
	}
//	***********Delete Flight by Admin*******************************************************************************************
	
	public FlightBean delFlight(String flightId ) {
		FlightBean flightbean=AdminDao.delFlight(flightId);
		return flightbean;
}
	
	//*********************View by ADMIN****************************************************************************************
	public List<FlightBean> flightList(){
		List<FlightBean> flightbean=AdminDao.flightList();
		return flightbean;
		
	}
	//*********************Modify by ADMIN**************************************************************************************
	public FlightBean updateFlight(FlightBean UpdatedFlight)
	{
		FlightBean flightBean=AdminDao.updateFlight(UpdatedFlight);
		return flightBean;
		
	}
	
//************************************SCHEDULE OPERATION ***********************************************************************
	
	
	
	
	//*********************ADD SCHEDULE Details by ADMIN************************************************************************
	
	public ScheduleBean addschedule(ScheduleBean newschedule)
	{
		ScheduleBean scheduleBean =AdminDao.addSchedule(newschedule);
		return newschedule;
	}
	
	
	
	//*********************Delete SCHEDULE Details by ADMIN*********************************************************************
	public ScheduleBean deleteSchedule(String delScheduleID)
	{
		ScheduleBean scheduleBean=AdminDao.delSchedule(delScheduleID);
		return scheduleBean;
	}
	
	//*********************View SCHEDULE Details by ADMIN***********************************************************************
	
	public List<ScheduleBean> scheduleList()
	{
		List <ScheduleBean> scheduleBean=AdminDao.scheduleList();
		return (List<ScheduleBean>) scheduleBean;
	}
	
	//*********************Modify SCHEDULE Details by ADMIN*********************************************************************

	public ScheduleBean updateSchedule(ScheduleBean UpdatedSchedule)
	{
		ScheduleBean scheduleBean=AdminDao.updateSchedule(UpdatedSchedule);
		return scheduleBean;
		
	}
	
	
	
	
//	**************************ROUTE DETAILS*************************************************************************************
	
//	**************************ADD ROUTES****************************************************************************************
	
	
	public RouteBean addRoute(RouteBean newRoute)
	{
		RouteBean routeBean=AdminDao.addRoute(newRoute);
		return routeBean;
	}
	
//	**************************DELETE ROUTES*************************************************************************************
	public RouteBean delRoute(String delRouteID)
	{
		RouteBean routeBean=AdminDao.delRoute(delRouteID);
		return routeBean;
	}
	
//	**************************View ROUTES***************************************************************************************
	
	public List<RouteBean> routeList()
	{
		List<RouteBean> routeBeans=AdminDao.routeList();
		return routeBeans;
	}
	
	
	
//	//	**************************View ROUTES***********************************************************************************
	
	public RouteBean updateRoute(RouteBean UpdatedRoute)
	{
		RouteBean routeBean=AdminDao.updateRoute(UpdatedRoute);
		return routeBean;
	}
	
	
	
//	**************************ADD PASSENGER DETAILS*****************************************************************************
	
	public PassengerBean addPassenger(PassengerBean newPassenger)
	{
		PassengerBean passengerBean=AdminDao.addPassenger(newPassenger);
		return passengerBean;
	}
	
//	***********************VIEW/List PASSENGER/UserProfile DETAILS*******************************************************************************
	
	public List<PassengerBean> passengerList(String reservationId)
	{
		List<PassengerBean> passengerList=AdminDao.passengerList(reservationId);
		return passengerList;
	}
	
	
	
//	**************************CHANGE PASSWORD***********************************************************************************


//	public CredentialsBean updateCredential(CredentialsBean UpdateCredential)
//	{
//		CredentialsBean credentialbean=AdminDao.updateCredential(UpdateCredential);
//		return credentialbean;
//	}
	
	public CredentialsBean changePassword(String userId,String oldPassword,String newPassword) {
		CredentialsBean credentialBean=AdminDao.changePassword(userId, oldPassword, newPassword);
		return credentialBean;
	}
	
	
	
	
	
	
	
	
//	*************************LOGOUT**********************************************************************************************
	public CredentialsBean logout (CredentialsBean logoutCredential)
	{
		CredentialsBean credentialsBean=AdminDao.logout(logoutCredential);
		return credentialsBean;
		
	
	}
	
	
	
	
	
	//---------------------------------------------------------------------
	public List<ProfileBean> profileList()
	{
		List<ProfileBean> profileList=AdminDao.profileList();
		return profileList ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
