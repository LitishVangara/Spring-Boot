package com.jsp.springJPAMVCBoot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.springJPAMVCBoot.entity.UserDetails;
import com.jsp.springJPAMVCBoot.repository.UserDetailsRepository;

@Component
public class UserDetailsDAOImp implements UserDetailsDAO 
{
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Override
	public int insertUserDetails(UserDetails userDetails) 
	{
		userDetailsRepository.save(userDetails);
		return 1;
	}
	@Override
	public UserDetails fetchDtaByEmail(String email, String password) 
	{
		return userDetailsRepository.findByEmailAndPassword(email, password);
	}
}
