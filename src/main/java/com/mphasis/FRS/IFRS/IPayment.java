package com.mphasis.FRS.IFRS;

public interface IPayment {

	
	public String creditCardNumber=null;
	public String validFrom=null;
	public String validTo=null; 
	public String balance=null;
	
	
	public  String findByCardNumber(String userid, String cardnumber); 
	public String PaymentStatus(String payment) ;	
}
