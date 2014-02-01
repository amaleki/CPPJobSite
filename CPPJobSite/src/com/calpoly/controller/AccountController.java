package com.calpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calpoly.controller.form.AccountForm;
import com.calpoly.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value="/register", method = RequestMethod.GET)
    public String getNewForm(Model m) {
		m.addAttribute("accountForm", new AccountForm());
        return "register";
    }
	
	 @RequestMapping(value="/register", method = RequestMethod.POST)
	    public String submitForm(AccountForm accountForm, BindingResult result) {
		 System.out.println("Test Page");
	        if (result.hasErrors()) {
	            return "account/new";
	        }
	        System.out.println(accountForm.toString());
	        accountService.createAccount(accountForm);
	        return "redirect:/index.jsp";
	 }

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
}
