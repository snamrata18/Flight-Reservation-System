package com.mphasis.FRS.IFRS;

import java.util.ArrayList;

import com.mphasis.FRS.bean.FlightBean;
import com.mphasis.FRS.bean.PassengerBean;
import com.mphasis.FRS.bean.RouteBean;
import com.mphasis.FRS.bean.ScheduleBean;

public interface IAdministrator {

	        public String addFlight(FlightBean flightBean);
			public String modifyFlight(FlightBean flightBean);
			public int removeFlight(ArrayList<String> flightID);
			public String addSchedule(ScheduleBean scheduleBean);
			public String modifySchedule(ScheduleBean scheduleBean);
			public int removeSchedule(ArrayList<String> scheduleID);
			public String addRoute(RouteBean routeBean) ;
			public String modifyRoute(RouteBean routeBean);
			public int removeRoute(ArrayList<String> routeID);
			public FlightBean viewByFlightId(String flightId);
			public RouteBean viewByRouteId(String routeId) ;
			ArrayList<FlightBean> viewByAllFlights() ;
			ArrayList<RouteBean> viewByAllRoute();
			ArrayList<ScheduleBean> viewByAllSchedule();
			public ScheduleBean viewByScheduleId(String scheduleId);
			ArrayList<PassengerBean> viewPassengersByFlight(String scheduleId);
	
}
