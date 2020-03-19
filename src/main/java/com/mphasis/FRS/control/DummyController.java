//package com.mphasis.FRS.control;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mphasis.FRS.bean.CredentialsBean;
//import com.mphasis.FRS.bean.FlightBean;
//import com.mphasis.FRS.dao.Dao;
//
//@RestController
//
//public class DummyController {
//	
//	
//	@Autowired
//	Dao d;
//	
//	
////	
////	
//	
//	
//	
////	@GetMapping("/listflight")
////	public List<FlightBean> listFlight() {
////		
////		return d.flightList();
////	}
//	
////	@GetMapping("/login")
////	public CredentialsBean login(@RequestParam("username") String userName, @RequestParam("password") String password) {
////		CredentialsBean loginCredential = new CredentialsBean(userName, password, null, 0);
////		return d.login(loginCredential);
////	}
////	@PostMapping("/logout")
////	public CredentialsBean login(@RequestBody CredentialsBean logoutCredential) {
////		
////		return d.logout(logoutCredential);
////	}
//
//}
