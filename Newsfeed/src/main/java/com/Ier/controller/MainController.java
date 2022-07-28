package com.Ier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/Login")
	public String Login () {
		
		
		return "Login.html";
	}
		
		
	@RequestMapping("/Home")
	public String Home (@RequestParam String UserName, @RequestParam String Password, Model model) {
		model.addAttribute("UserName", UserName);
		model.addAttribute("Password", Password);
		
		
		return "Home.html";
	}
	@RequestMapping("/Post")
	public String  Post(@RequestParam String TxtMsg, Model model) {
		model.addAttribute("TxtMsg", TxtMsg);
		return "Post.html"; 
		
	}
	
	
	
	
		
	
	

}
