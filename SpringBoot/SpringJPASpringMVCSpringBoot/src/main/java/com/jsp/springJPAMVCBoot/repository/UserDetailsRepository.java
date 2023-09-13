package com.jsp.springJPAMVCBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springJPAMVCBoot.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, String> 
{
	//Fetch Data based on email and password
	UserDetails findByEmailAndPassword(String email, String password);
}
