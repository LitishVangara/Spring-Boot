package com.jsp.springBootJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.springBootJDBC.entity.UserDetails;

@Component
public class UserDetailsRowMapperDAOImp implements RowMapper<UserDetails>
{
	@Override
	public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(rs.getString("FirstName"));
		userDetails.setLastName(rs.getString("LastName"));
		userDetails.setEmail(rs.getString("Email"));
		userDetails.setMobileNumber(rs.getInt("MobileNumber"));
		userDetails.setPassword(rs.getString("Password"));
		return userDetails;
	}
}
