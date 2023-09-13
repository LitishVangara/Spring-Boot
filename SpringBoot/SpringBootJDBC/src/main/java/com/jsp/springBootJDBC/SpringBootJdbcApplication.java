package com.jsp.springBootJDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.springBootJDBC.dao.UserDetailsDAO;
import com.jsp.springBootJDBC.dao.UserDetailsDAOImp;
import com.jsp.springBootJDBC.entity.UserDetails;

@SpringBootApplication
public class SpringBootJdbcApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootJdbcApplication.class, args);
		UserDetailsDAO userDetailsDAO = applicationContext.getBean(UserDetailsDAOImp.class);
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter Email : ");
		//String email = scan.next();
		System.out.println("Enter Mobile Number : ");
		int mobileNumber = scan.nextInt();
		System.out.println("Enter Password : ");
		String password = scan.next();
		/*int record = userDetailsDAO.updatePassword(email, password);
		if (record > 0) 
		{
			System.out.println("Password Updated...");
		}
		else
		{
			System.out.println("Invalid Email...");
		}*/
		List<UserDetails> record = userDetailsDAO.findUserDetailsByMobileAndPassword(mobileNumber, password);
		if (record != null) 
		{
			for (UserDetails userDetails : record) 
			{
				System.out.println(userDetails);
			}
			System.out.println("Record retrieved...");
		}
		else
		{
			System.out.println("Record Not Found...");
		}
	}
}
