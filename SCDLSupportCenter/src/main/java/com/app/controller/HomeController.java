package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("AdminLogin","Home-SCDL Support Center");
		return "home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("AdminLogin","About-SCDL Support Center");
		return "about";
	}
	
	@RequestMapping("/signup")
	public String adminsign_in(Model model) {
		
		model.addAttribute("AdminLogin","About-SCDL Support Center");
		return "sign";
	}
	

	
}
