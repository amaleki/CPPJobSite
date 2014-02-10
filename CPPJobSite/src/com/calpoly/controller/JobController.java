package com.calpoly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calpoly.model.Job;
import com.calpoly.service.JobService;

@Controller
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String getNewForm(Model m) {
		
		List<Job> jobs = jobService.openJobs();
		m.addAttribute("jobs", jobs);
		
        return "secure";
    }

}
