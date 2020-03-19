package com.mphasis.FRS.IFRS;

import com.mphasis.FRS.bean.CredentialsBean;

public interface IAuthentication {

	public String authenticate(CredentialsBean credentialsBean);
	public String authorize(String userId);
	public String changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
	
}
