package com.calpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/jobs")
public class JobController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String getNewForm(Model m) {
		//m.addAttribute("accountForm", new AccountForm());
        return "secure";
    }

}
