package com.placement.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.placement.entity.CollegeEntity;
import com.placement.entity.RecuriterEntity;
import com.placement.entity.RecuriterJobPostEntity;
import com.placement.entity.StudentEntity;
import com.placement.placementservice.CollegeService;
import com.placement.placementservice.RecuriterJobService;
import com.placement.placementservice.RecuriterService;
import com.placement.placementservice.StudentService;

@Controller
public class CollegeController 
{
	@Autowired
	CollegeService collegeServiceObj;
	
	@Autowired
	StudentService studentServiceObj;
	
	@Autowired
	RecuriterService recuriterServiceObj;
	
	@Autowired
	RecuriterJobService recuriterJobServiceObj;
	
	
	
	int Id;
	
	@GetMapping("/c_login")
	public String login()
	{
		return"CollegeModule/CollegeLogin";
	}
	
	@GetMapping("/c_signup")
	public String signUp()
	{
		return "CollegeModule/CollegeSignin";
	}
	
	@GetMapping("/c_myDetails")
	public String MyDetails(Model model)
	{
		CollegeEntity entity = collegeServiceObj.findByCollegeId(Id);
		model.addAttribute("college",entity);
		return "CollegeModule/CollegeMyDetails";
	}
	
	
	@GetMapping("/c_dashboard")
	public String dashboard(Model model)
	{
		CollegeEntity entity = collegeServiceObj.findByCollegeId(Id);
		model.addAttribute("college",entity);
		return "CollegeModule/CollegeDashboard";
	}
	
	@GetMapping("/dash_recuriterList")
	public String dashActivity(Model model)
	{
		List<RecuriterEntity>entityList = recuriterServiceObj.displayRecuriterList();
		model.addAttribute("recuriter",entityList);
		return "CollegeModule/CollegeRecuriterDetails";
	}
	
	@GetMapping("/dash_studentList")
	public String studentList(Model model)
	{
		List<StudentEntity> entityList = studentServiceObj.displayStudentList();
		
	//`	System.out.println("------------"+entityList.)
		model.addAttribute("student",entityList);
		return "CollegeModule/CollegeStudentDetails";
	}
	
	@GetMapping("/dash_jobList")
	public String jobList(Model model)
	{
		List<RecuriterJobPostEntity>entityList = recuriterJobServiceObj.viewAllJobs();
		model.addAttribute("job",entityList);
		return "CollegeModule/CollegeJobDetails";
	}
	
	@PostMapping("/saveCollegeDetails")
	public String studentDetails(@ModelAttribute CollegeEntity collegeEntityObj)
	{
		collegeServiceObj.addCollegeDetails(collegeEntityObj);
		return "CollegeModule/CollegeLogin";
	}
	
	@PostMapping("/collegeverifylogin")
	public String verifyLogin(@ModelAttribute CollegeEntity collegeEntityObj,HttpSession session)
	{
		
		CollegeEntity entity = collegeServiceObj.findByCollegeEmailAndCollegePassword(collegeEntityObj.getCollegeEmail(), collegeEntityObj.getCollegePassword());
		if(Objects.isNull(entity))
		{
			return "redirect:/c_login";
		}
		else
		{
			Id=entity.getCollegeId();
			return "redirect:/c_dashboard";
		}
	}
	
	@GetMapping("/updateCollegeDetails{id}")
	public String updateDetails(@PathVariable int id ,@ModelAttribute CollegeEntity collegeEntityObj,Model model)
	{
		CollegeEntity entityObj = collegeServiceObj.findByCollegeId(id);
		if(entityObj!=null)
		{
			entityObj.setCollegeName(collegeEntityObj.getCollegeName());
			entityObj.setCollegeCode(collegeEntityObj.getCollegeCode());
			entityObj.setAdminName(collegeEntityObj.getAdminName());
			entityObj.setCollegeEmail(collegeEntityObj.getCollegeEmail());
			entityObj.setCollegePhoneNo(collegeEntityObj.getCollegePhoneNo());
			entityObj.setCollegeAddress(collegeEntityObj.getCollegeAddress());
			entityObj.setCollegeCity(collegeEntityObj.getCollegeCity());
			entityObj.setCollegeCountry(collegeEntityObj.getCollegeCountry());
			entityObj.setCollegeState(collegeEntityObj.getCollegeState());
			entityObj.setCollegePassword(collegeEntityObj.getCollegePassword());
			
			collegeServiceObj.addCollegeDetails(entityObj);
			model.addAttribute("college",entityObj);
			return "redirect:/c_dashboard";
		}
		else 
		{
			return "CollegeModule/CollegeSignin";
		}
	}
}
