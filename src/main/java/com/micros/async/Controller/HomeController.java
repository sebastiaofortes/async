package com.micros.async.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micros.async.service.SendEmailService;

@Controller
public class HomeController {

@Autowired	
SendEmailService MySES;
		
	
@RequestMapping("/")	
public String Home() {
	
	
	return "home";
}

@RequestMapping("/sync")	
public String Sync() {
	

	

	MySES.Send();
	
	return "sync";
}	



@RequestMapping("/async")	
public String Async() {
	

	
	MySES.ASend();
	
	return "async";
}	
	



	public HomeController() {
		// TODO Auto-generated constructor stub
	}

}
