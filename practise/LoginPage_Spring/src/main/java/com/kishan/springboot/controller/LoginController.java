package com.kishan.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String gotoLoginPAge()//@RequestParam String name,Model model
	{
//		model.addAttribute("name", name);
//		System.out.println("name ="+name);
		return "login";
	}
	
	@RequestMapping(value = "login",method =RequestMethod.POST)
	public String shwoWelcome(@RequestParam String name, @RequestParam String  password,ModelMap model)//@RequestParam String name,Model model
	{
		model.put("name", name);;
		model.put("password", password);
		if(isvalidUser(name,password))
		{
		return "welcome";
		}
		else
		{
			model.put("errorMsg","please enter correct Login and Password" );
			return "login";
			
		}
	}

	private boolean isvalidUser(String name, String password) {
		return name.equalsIgnoreCase("kishan")&&password.equalsIgnoreCase("1234");
		
		//return false;
	}

}

