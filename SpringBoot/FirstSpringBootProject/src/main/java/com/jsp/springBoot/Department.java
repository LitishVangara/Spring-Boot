package com.jsp.springBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department 
{
	@Value("10")
	private int deptNo;
	@Value("Production")
	private String deptName;
	@Override
	public String toString() 
	{
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
}
