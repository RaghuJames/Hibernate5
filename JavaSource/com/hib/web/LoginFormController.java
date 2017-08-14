package com.hib.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hib.model.User;
import com.hib.service.UserManager;

@Controller
public class LoginFormController {
	private UserManager userManager;
	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	private String formBack(ModelMap map){
		System.out.println("===LOGIN===");
		User user = new User();
		map.put("user", user);
		return "login";
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	private String onSubmit(@ModelAttribute("user")User user){
		this.userManager.saveUser(user);
		System.out.println("===SUBMIT===");
		return "redirect:/accounts.htm";
	}
	private String saveAccount(@ModelAttribute("user")User user){
		this.userManager.saveUser(user);
		System.out.println("===SUBMIT===");
		return "login";
	}
}
