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
import org.springframework.web.bind.annotation.PutMapping;

import com.placement.entity.RecuriterJobPostEntity;
import com.placement.entity.StudentEntity;
import com.placement.placementservice.RecuriterJobService;
import com.placement.placementservice.StudentService;
@Controller
public class StudentController 
{
	int Id;

	@Autowired
	StudentService studentServiceObj;
	
	@Autowired
	RecuriterJobService jobservice;
	
	@GetMapping("/s_login")
	public String login()
	{
		return"StudentModule/StudentLogin";
	}
	
	@GetMapping("/signup")
	public String signUp()
	{
		return "StudentModule/StudentSignin";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model)
	{
		StudentEntity entityObj = studentServiceObj.findByStudentId(Id);
		model.addAttribute("studentModel",entityObj);
		
		return "StudentModule/StudentDashboard";
	}
	
	@GetMapping("/dash_activity")
	public String dashActivity()
	{
		return "StudentModule/StudDashActivity";
	}
	
	
	
	
	@PostMapping("/apply{id}")
	public String applyJob(@PathVariable int id)
	{
		
		
		return "StudentModule/StudDashActivity";
	}
	
	
	
	@GetMapping("/viewjobs")
	public String viewJob(Model model)
	{
		List<RecuriterJobPostEntity> obj = jobservice.viewAllJobs();
		model.addAttribute("job",obj);
		return "StudentModule/StudDashJobApply";
	}
	
	@PostMapping("/saveStudentDetails")
	public String studentDetails(@ModelAttribute StudentEntity studentEntityObj)
	{
		studentServiceObj.addStudentDetails(studentEntityObj);
		return "StudentModule/StudentLogin";
	}
	
	@GetMapping("/updateStudentDetails{id}")
	public String updateDetails(@PathVariable int id,@ModelAttribute StudentEntity studentEntityObj,Model model)
	{
	
		StudentEntity entityObj = studentServiceObj.findByStudentId(id); 
		if(entityObj!=null)
		{
			entityObj.setStudentName(studentEntityObj.getStudentName());
			entityObj.setStudentEmail(studentEntityObj.getStudentEmail());
			entityObj.setStudentPhoneno(studentEntityObj.getStudentPhoneno());
			entityObj.setStudentDateOfBirth(studentEntityObj.getStudentDateOfBirth());
			entityObj.setStudentDegree(studentEntityObj.getStudentDegree());
			entityObj.setStudentBranch(studentEntityObj.getStudentBranch());
			entityObj.setStudentAcademicYear(studentEntityObj.getStudentAcademicYear());
			entityObj.setStudentAddress(studentEntityObj.getStudentAddress());
			entityObj.setStudentCity(studentEntityObj.getStudentCity());
			entityObj.setStudentCountry(studentEntityObj.getStudentCountry());
			entityObj.setStudentState(studentEntityObj.getStudentState());
			entityObj.setStudentPassword(studentEntityObj.getStudentPassword());
			
			studentServiceObj.addStudentDetails(entityObj);
			model.addAttribute("studentModel",entityObj);
			return "StudentModule/StudentDashBoard";
		
		}
		else
		{
			return "StudentModule/StudentDashBoard";
		}
		
		
	}
	
	
	@PostMapping("/verifylogin")
	public String verifyLogin(@ModelAttribute StudentEntity studentEntityObj,Model model,HttpSession session)
	{
		StudentEntity entity = studentServiceObj.findByStudentEmailAndStudentPassword(studentEntityObj.getStudentEmail(), studentEntityObj.getStudentPassword());
		if(Objects.isNull(entity))
		{
			return "redirect:/s_login";
		}
		else
		{
			Id=entity.getStudentId();
			model.addAttribute("studentModel",entity);
			return "StudentModule/StudentDashboard";
		}
	}
	

}