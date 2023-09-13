package com.jsp.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.jsp.springBoot.Employee;

@SpringBootApplication
public class FirstSpringBootProjectApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstSpringBootProjectApplication.class, args);
		Employee emp = applicationContext.getBean(Employee.class);
		emp.salary();
		System.out.println(emp);
	}
}
