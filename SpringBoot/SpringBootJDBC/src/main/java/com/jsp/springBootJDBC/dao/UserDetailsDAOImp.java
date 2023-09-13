package com.jsp.springBootJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.springBootJDBC.entity.UserDetails;

@Component
public class UserDetailsDAOImp implements UserDetailsDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int updatePassword(String email, String password) 
	{
		String query = "update userdetails set Password = ? where Email = ?";
		int record = jdbcTemplate.update(query, password, email);
		return record;
	}
	@Override
	public List<UserDetails> findUserDetailsByMobileAndPassword(int mobileNumber, String password) 
	{
		String query = "select * from userdetails where MobileNumber = ? and Password = ?";
		RowMapper<UserDetails> rm = new UserDetailsRowMapperDAOImp();
		List<UserDetails> result = jdbcTemplate.query(query, rm, mobileNumber, password);
		return result;
	}
}
