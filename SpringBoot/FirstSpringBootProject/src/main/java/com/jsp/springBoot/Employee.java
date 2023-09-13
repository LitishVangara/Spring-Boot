package com.jsp.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("1019")
	private int empId;
	@Autowired
	private Department department;
	public void salary() 
	{
		System.out.println("Salary...");
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", department=" + department + "]";
	}
}
