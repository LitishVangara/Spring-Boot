package com.jsp.springJPAMVCBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springJPAMVCBoot.dao.UserDetailsDAO;
import com.jsp.springJPAMVCBoot.entity.UserDetails;

@Controller
public class ApplicationController 
{
	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	@RequestMapping("/sample")
	public String displaySample()
	{
		return "Sample";
	}
	
	@RequestMapping("/userDetails")
	public ModelAndView displayuserDetailsRegistrationPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UserDetails");
		return mv;
	}
	
	@RequestMapping(path = "/userDetailsRegister", method = RequestMethod.POST)
	//@ResponseBody
	public ModelAndView userDetailsRegister(@ModelAttribute UserDetails userDetails, @RequestParam("cPassword") String confirmPassword)
	{
		ModelAndView mv = new ModelAndView();
		if (userDetails.getPassword().equals(confirmPassword)) 
		{
			//Call Insert Record Method
			userDetailsDAO.insertUserDetails(userDetails);
			//return "Record Inserted...";
			//return "Login";
			mv.setViewName("Login");
			mv.addObject("javaMessage1", "Registration Successfull!!!");
		}
		else
		{
			//Invalid Data
			//return "Please Inter Valid Data...";
			//return "UserDetails";
			mv.setViewName("UserDetails");
			mv.addObject("javaMessage", "Please enter Valid Password!!!");
		}
		return mv;
	}
	
	@RequestMapping(path = "/userDetailsLogin", method = RequestMethod.POST)
	public ModelAndView userDetailsLogin(@RequestParam("email") String email, @RequestParam("password") String password)
	{
		UserDetails userDetails = userDetailsDAO.fetchDtaByEmail(email, password);
		System.out.println(userDetails);
		ModelAndView mv = new ModelAndView();
		if (userDetails != null)
		{
			mv.setViewName("MainPage");
			mv.addObject("information", userDetails);
		}
		else
		{
			mv.setViewName("Login");
			mv.addObject("javaMessage1", "Please Enter Valid Data...");
		}
		return mv;
	}
}
