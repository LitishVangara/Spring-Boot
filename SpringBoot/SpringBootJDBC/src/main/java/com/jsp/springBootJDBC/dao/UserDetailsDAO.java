package com.jsp.springBootJDBC.dao;

import java.util.List;

import com.jsp.springBootJDBC.entity.UserDetails;

public interface UserDetailsDAO 
{
	int updatePassword(String email, String password);
	List<UserDetails> findUserDetailsByMobileAndPassword(int mobileNumber, String password);
}
