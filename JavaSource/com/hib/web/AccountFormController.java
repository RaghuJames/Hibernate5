package com.hib.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hib.model.Accounts;
import com.hib.service.UserManager;

@Controller
public class AccountFormController {
	@Autowired
	private UserManager userManager;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/accounts.htm",method=RequestMethod.GET)
	private String formBack(ModelMap map){
		Accounts act= new Accounts();
		List<Accounts> list = new ArrayList<Accounts>();
		list.add(new Accounts());
		list.add(new Accounts());
		list.add(new Accounts());
		map.put("accountModel", act);
		System.out.println("======list======"+list.size());
		map.put("accountList", list);
		return "account";
	}
	@RequestMapping(value="/accounts.htm",method=RequestMethod.POST)
	private String submit(@ModelAttribute("accountModel") Accounts act){
		//System.out.println("=============="+act.getAuditDate());
		System.out.println("========INSIDE==SUBMIT==");
		this.userManager.saveAccounts(act);
		return "redirec:/accounts.htm";
	}
	
}


