package com.estore.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET	)
	public String homePage() {
		System.out.println("[HomeController] serving the request at /");
		return "home";	
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomePage(Model model) {
		System.out.println("[HomeController] serving the request at /");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateTimeStamp = sdf.format(date);
		model.addAttribute("welcomeDateTimeStamp", dateTimeStamp);
	
		return "welcome";
	}
	
	
	

}
