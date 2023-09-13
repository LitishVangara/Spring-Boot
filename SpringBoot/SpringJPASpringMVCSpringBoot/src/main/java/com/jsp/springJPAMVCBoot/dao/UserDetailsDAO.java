package com.jsp.springJPAMVCBoot.dao;

import com.jsp.springJPAMVCBoot.entity.UserDetails;

public interface UserDetailsDAO 
{
	int insertUserDetails(UserDetails userDetails);
	UserDetails fetchDtaByEmail(String email, String password);
}
