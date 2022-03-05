package com.placement.controller;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.placement.entity.RecuriterEntity;
import com.placement.entity.RecuriterJobPostEntity;
import com.placement.placementservice.RecuriterJobService;
import com.placement.placementservice.RecuriterService;


@Controller
public class RecuriterController 
{
	int Id;

	@Autowired
	RecuriterService recuriterServiceObj;
	
	@Autowired
	RecuriterJobService jobServiceObj;
	
	@GetMapping("/r_login")
	public String login()
	{
		return"RecuriterModule/RecuriterLogin";
	}
	
	@GetMapping("/r_signup")
	public String signUp()
	{
		return "RecuriterModule/RecuriterSignin";
	}
	
	@GetMapping("/r_dashboard")
	public String dashboard(Model model)
	{
		RecuriterEntity entity = recuriterServiceObj.findByCompanyId(Id);
		model.addAttribute("recuriter", entity);
		return "RecuriterModule/RecuriterDashboard";
	}
	
	@GetMapping("/r_viewjobs")
	public String viewJob(Model model)
	{
		List<RecuriterJobPostEntity> obj = jobServiceObj.viewAllJobs();
		model.addAttribute("job",obj);
		return "RecuriterModule/RecDashViewJobs";
	}
	
	@GetMapping("/r_applyjob")
	public String applyJob()
	{
		return "RecuriterModule/RecDashPostJobs";
	}
	
	
	@GetMapping("/r_dash_activity")
	public String dashActivity()
	{
		return "RecuriterModule/RecDashCheckApplicant";
	}
	
	@PostMapping("/addjob")
	public String addjob(@ModelAttribute RecuriterJobPostEntity jobEntityObj,Model model)
	{
			jobServiceObj.addJobs(jobEntityObj);
			
			return "redirect:/r_viewjobs";	
	}
	
	@GetMapping("/deletejob{id}")
	private String delete(@PathVariable int id) 
	{
		
		RecuriterJobPostEntity entity  = jobServiceObj.findByJobId(id);
		if(entity!=null)
		{
			  jobServiceObj.deleteJob(id);
			  
			  return"redirect:/r_viewjobs";
		}
				
		return"RecuriterModule/RecDashViewJobs";
		
	}
	
	@GetMapping("/updateDetails{id}")
	public String updateDetails(@PathVariable int id,@ModelAttribute RecuriterJobPostEntity jobEntityObj,Model model)
	{
		RecuriterJobPostEntity entityObj = jobServiceObj.findByJobId(id);
		
		if(entityObj!=null)
		{
			entityObj.setJobName(jobEntityObj.getJobName());
			entityObj.setCompanyName(jobEntityObj.getCompanyName());
			entityObj.setJobSalary(jobEntityObj.getJobSalary());
			entityObj.setJobQualification(jobEntityObj.getJobQualification());
			entityObj.setJobDeadline(jobEntityObj.getJobDeadline());
			entityObj.setJobDescription(jobEntityObj.getJobDescription());
			
			jobServiceObj.addJobs(entityObj);
			model.addAttribute("job",entityObj);
			return "RecuriterModule/RecDashViewJobs";
			
		}
		else
		{
			return "RecuriterModule/RecuriterDashboard";
		}
		
	}
	
	
	@GetMapping("/findJob{id}")
	public String findJob(@PathVariable int id,Model model)
	{
		RecuriterJobPostEntity entityObj = jobServiceObj.findByJobId(id);
		model.addAttribute("job",entityObj);
		return "RecuriterModule/RecDashEditJob";
	}
	
	
	
	
	@PostMapping("/saveRecuriterDetails")
	public String studentDetails(@ModelAttribute RecuriterEntity recuriterEntityObj)
	{
		recuriterServiceObj.addRecuriterDetails(recuriterEntityObj);
		return "RecuriterModule/RecuriterLogin";
	}
	
	
	
	@PostMapping("/recuriterverifylogin")
	public String verifyLogin(@ModelAttribute RecuriterEntity recuriterEntityObj,Model model)
	{
		
		RecuriterEntity entity = recuriterServiceObj.findByCompanyEmailAndCompanyPassword(recuriterEntityObj.getCompanyEmail(), recuriterEntityObj.getCompanyPassword());
		if(Objects.isNull(entity))
		{
			return "redirect:/r_login";
		}
		else
		{
			Id=entity.getCompanyId();
			model.addAttribute("recuriter", entity);
			return "redirect:/r_dashboard";
		}
	} 
	
	//
	
	
	@GetMapping("/updateRecuriterDetails{id}")
	public String updateRecuriterDetails(@PathVariable int id,Model model,@ModelAttribute RecuriterEntity recEntityObj)
	{
		RecuriterEntity entityObj = recuriterServiceObj.findByCompanyId(id);
		if(entityObj!=null)
		{
			entityObj.setCompanyName(recEntityObj.getCompanyName());
			entityObj.setCompanyEmail(recEntityObj.getCompanyEmail());
			entityObj.setCompanyPhoneNo(recEntityObj.getCompanyPhoneNo());
			entityObj.setRecuriterName(recEntityObj.getRecuriterName());
			entityObj.setRecuriterPhoneNo(recEntityObj.getRecuriterPhoneNo());
			entityObj.setCompanyAddress(recEntityObj.getCompanyAddress());
			entityObj.setCompanyCity(recEntityObj.getCompanyCity());
			entityObj.setCompanyCountry(recEntityObj.getCompanyCountry());
			entityObj.setCompanyState(recEntityObj.getCompanyState());
			entityObj.setCompanyPassword(recEntityObj.getCompanyPassword());
			
			recuriterServiceObj.addRecuriterDetails(entityObj);
			model.addAttribute("recuriter",entityObj);
			return "RecuriterModule/RecuriterDashboard";
		}
		else
		{
			return "RecuriterModule/RecuriterDashboard";
		}
		
	}

}