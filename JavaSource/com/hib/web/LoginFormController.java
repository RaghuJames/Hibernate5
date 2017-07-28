package com.hib.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginFormController {
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	private String formBack(){
		System.out.println("===LOGIN===");
		return "login";
	}
}
