package com.mphasis.FRS.control;

import java.util.Date;
import java.util.List;

import org.apache.catalina.filters.CsrfPreventionFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.FRS.bean.CredentialsBean;
import com.mphasis.FRS.bean.CreditCardBean;
import com.mphasis.FRS.bean.FlightBean;
import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.ProfileBean;
import com.mphasis.FRS.bean.ReservationBean;
import com.mphasis.FRS.bean.RouteBean;
import com.mphasis.FRS.bean.ScheduleBean;
import com.mphasis.FRS.dao.Dao;
import com.mphasis.FRS.service.AdminService;
import com.mphasis.FRS.service.CustomerService;

import sun.misc.FloatingDecimal;

@RestController
@CrossOrigin("*")
public class FrsController {
	
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	Dao dao;
	
	@GetMapping("/Customer/ScheduleList")
	public List<ScheduleBean> getSchedule(String source, String destination, Date date)
	{
		List<ScheduleBean> li = customerService.viewScheduleByRoute(source, destination, date);
				return li;
	
	}
	
	//-------------------------------------ListReservationById-------------------------------------------------------
	
	@GetMapping("/Customer/ListReservationById/{id}")
	public List<ReservationBean> listReservationById(@PathVariable("id") String userId){		
		System.out.println(userId);
		List<ReservationBean> listReservationById=customerService.listResrvationById(userId);
		return listReservationById;
	}
	
//	@GetMapping("/Customer/ReservationList")
//	public List<ReservationBean> getReservationList()
//	{
//		List<ReservationBean> reservationList = customerService.viewReservation();
//				return reservationList;
//	
//	}
	
	
	@GetMapping("/Customer/CreditCardList")
	public List<CreditCardBean> getCreditCardList()
	{
		List<CreditCardBean> creditcardList = customerService.viewCreditList();
				return creditcardList;
	
	}	
	@PostMapping("/Customer/AddCreditCard")
	public CreditCardBean addCreditCardList(@RequestBody CreditCardBean creditcardbean)
	{
		System.out.println(creditcardbean);
		CreditCardBean creditcard = dao.addCreditCard(creditcardbean);
		return creditcard;
	
	}	

	
	
//	@DeleteMapping("/Customer/CancelTicket")
//	public ReservationBean delReservation(@RequestBody ReservationBean delReservation)
//	{
//	ReservationBean flag=customerService.CancelTicket(delReservation);
//	return delReservation;
//
//	}
	
	
	
	
		
	
//	--------------------------ADMIN CONTROLLER---------------------------
	
	
	@GetMapping("/Admin/ListProfile")
	public List<ProfileBean> listProfile(){
		List<ProfileBean> profileList=adminService.profileList();
		return profileList;
	}
	
	@GetMapping("/Admin/PassengerList/{id}")
	public List<PassengerBean> getPassengerList(@PathVariable("id") String reservationId)
	{
		List<PassengerBean> passengerList=adminService.passengerList(reservationId);
		return passengerList;
		
	}
	
@PostMapping("/Admin/AddFlight")
public FlightBean addFlight(@RequestBody FlightBean addflight) {
	System.out.println(addflight);
	FlightBean flightbean=adminService.addFlight(addflight);
	return flightbean;
	
}


@DeleteMapping("/Admin/DelFlight/{Id}")
public FlightBean delFlight(@PathVariable("Id") String flightid) {

	FlightBean flightbean=adminService.delFlight(flightid);
	return flightbean;
}
	

@GetMapping("/Admin/ListFlight")
public List<FlightBean> listFlight(){
	List<FlightBean> flightbean=adminService.flightList();
	return flightbean;
}

@PutMapping("/Admin/UpdateFlight")
public FlightBean updateFlight(@RequestBody FlightBean updateFlight) {
	System.out.println(updateFlight);
	FlightBean flightbean=adminService.updateFlight(updateFlight);
	return flightbean;
}

//--------------------------------ADMIN ROUTE----------------------------

@PostMapping("/Admin/AddRoute")
public RouteBean addRoute(@RequestBody RouteBean addroute) {
	RouteBean routebean=adminService.addRoute(addroute);
	return routebean;
	
}


@DeleteMapping("/Admin/DelRoute/{Id}")
public RouteBean delRoute(@PathVariable("Id") String delRouteID) {
	RouteBean routebean=adminService.delRoute(delRouteID);
	return routebean;
}
	

@GetMapping("/Admin/ListRoute")
public List<RouteBean> listRoute(){
	List<RouteBean> routebean=adminService.routeList();
	return routebean;
}

@PutMapping("/Admin/UpdateRoute")
public RouteBean updateRoute(@RequestBody RouteBean updateRoute) {
	RouteBean routebean=adminService.updateRoute(updateRoute);
	return routebean;
}


//--------------------------------ADMIN SCHEDULE----------------------------

@PostMapping("/Admin/AddSchedule")
public ScheduleBean addSchedule(@RequestBody ScheduleBean addschedule) {
	System.out.println(addschedule);
	ScheduleBean schedulebean=adminService.addschedule(addschedule);
	return schedulebean;
	
}


@DeleteMapping("/Admin/DelSchedule/{Id}")
public ScheduleBean delSchedule(@PathVariable("Id") String delScheduleID) {
	ScheduleBean schedulebean=adminService.deleteSchedule(delScheduleID);
	return schedulebean;
}
	

@GetMapping("/Admin/ListSchedule")
public List<ScheduleBean> listSchedule(){
	List<ScheduleBean> schedulebean=adminService.scheduleList();
	return schedulebean;
}

@PutMapping("/Admin/UpdateSchedule")
public ScheduleBean updateSchedule(@RequestBody ScheduleBean updateSchedule) {
	ScheduleBean schedulebean=adminService.updateSchedule(updateSchedule);
	return schedulebean;
}


//------------------------------LOGIN ADMIN CONTROLLER---------------------------
	

	@GetMapping("/login/{username}/{password}")
	public CredentialsBean login(@PathVariable("username") String userName, @PathVariable("password") String password) {
		
		CredentialsBean loginCredential = new CredentialsBean(userName, password, null, 0);
		return adminService.login(loginCredential);
	}
	
	@PostMapping("/logout")
	public CredentialsBean logout(@RequestBody CredentialsBean logoutCredential) 
	{
	
	return adminService.logout(logoutCredential);
}
	
	@PutMapping("/Admin/changePassword/{userId}/{oldPassword}/{newPassword}")
	public CredentialsBean adminChangePassword(@PathVariable("userId") String userId,@PathVariable("oldPassword") String oldPassword,@PathVariable("newPassword") String newPassword)
	{		
		return adminService.changePassword(userId, oldPassword, newPassword);
	}
	
	@PutMapping("/Customer/changePassword/{userId}/{oldPassword}/{newPassword}")
	public CredentialsBean customerChangePassword(@PathVariable("userId") String userId,@PathVariable("oldPassword") String oldPassword,@PathVariable("newPassword") String newPassword)
	{		
		return customerService.changePassword(userId, oldPassword, newPassword);
	}
	
	//------------------------------LOGIN CUSTOMER CONTROLLER---------------------------
	

//		@GetMapping("/login")
//		public CredentialsBean customerLogin(@RequestParam("username") String userName, @RequestParam("password") String password) {
//			
//			CredentialsBean loginCredential = new CredentialsBean(userName, password, null, 0);
//			return customerService.login(loginCredential);
//		}
//		
//		@PostMapping("/logout")
//		public CredentialsBean customerLogout(@RequestBody CredentialsBean logoutCredential) 
//		{
//		
//		return customerService.logout(logoutCredential);
//	}
//		
//		@PutMapping("/changePassword")
//		public CredentialsBean cutsomerChangePassword(@RequestBody CredentialsBean updateCredentials)
//		{
//			return customerService.updateCredential(updateCredentials);
//		}
//		
		
//		@GetMapping("/CreditCardList")
//		public List<CreditCardBean> creditCardList(){
//			
//			 List<CreditCardBean> creditCardList=customerService.viewCreditCardBean();
//			return creditCardList;
//			
//		}
	
	
	
	//--------------------------------------BookTicket----------------------------------
	
	@PostMapping("/bookTicket")
	public ReservationBean bookTicket(@RequestBody ReservationBean reservationBean )
	{
		ReservationBean reservationbeanBook= dao.bookTicket(reservationBean);
		return reservationbeanBook;
	}
	
	@PutMapping("/cancelTicket")
	public ReservationBean cancelTicket(@RequestBody ReservationBean reservationBean )
	{
		ReservationBean reservationbeanBook= dao.cancelTicket(reservationBean);
		return reservationbeanBook;
	}
	
	//--------------------------------------------ADD PASSENGER----------------------------------
	
		@PostMapping("/Customer/AddPassenger")
		public PassengerBean addPassenger(@RequestBody PassengerBean addPassenger) {
			System.out.println(addPassenger);
			PassengerBean addnewPassenger=customerService.addpassenger(addPassenger);
			return addnewPassenger;		
		}
		
		//-------------------------------------PROFILE CONTROLLER-------------------------------------------------------
		
		@PostMapping("/Customer/AddProfile")
		public ProfileBean addProfile(@RequestBody ProfileBean addProfile) {
			System.out.println(addProfile);
			ProfileBean addNewProfile=customerService.addProfile(addProfile);
		return addNewProfile;	
		}
		
	     @DeleteMapping("/Customer/DelProfile/{Id}")
	     public ProfileBean delProfile(@PathVariable("Id") String userID) {
	    	 
	    	 ProfileBean delProfile=customerService.delProfile(userID);
	    	 return delProfile;
	     }
	     
	     @PutMapping("/Customer/updateProfile")
	     public ProfileBean updateProfile(@RequestBody ProfileBean updateProfile) {
	    	 
	    	 ProfileBean updateprofile=customerService.updateProfile(updateProfile);
	    	 return updateProfile;
	     }
	
	}


