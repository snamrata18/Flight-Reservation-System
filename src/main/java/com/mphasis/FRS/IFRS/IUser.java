package com.mphasis.FRS.IFRS;

import com.mphasis.FRS.bean.CredentialsBean;
import com.mphasis.FRS.bean.ProfileBean;

public interface IUser {
	public String login(CredentialsBean credentialsBean);
	public String logout(String userId);
	public  String changePassword(CredentialsBean credentialsBean, String newPassword);
	 public String register(ProfileBean profileBean);
	
}
