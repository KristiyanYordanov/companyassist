package com.krissoft.companyassist.config;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	Logger logger = Logger.getLogger(FrontController.class);

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		System.out.println("hiii");
		return "/home";
	}
	
	
	@RequestMapping(value = "/editor", method = RequestMethod.GET)
	public String editor(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		System.out.println("editor");
		return "/editor";
	}

}
