package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.placement.entity.StudentEntity;
import com.placement.placementservice.StudentService;

@Controller
public class HomeController 
{
	
	@GetMapping("/")
	public String home()
	{
		return "Home";
	}
	
	@GetMapping("/studentlogin")
	public String studentLogin()
	{
		return "StudentModule/StudentLogin";
	}
	
	
	@GetMapping("/recuriterlogin")
	public String recuriterLogin()
	{
		return "RecuriterModule/RecuriterLogin";
	}

	@GetMapping("/collegelogin")
	public String collegeLogin()
	{
		return "CollegeModule/CollegeLogin";
	}


}
