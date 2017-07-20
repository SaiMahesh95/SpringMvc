package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(){
		return "index";
	}

	@RequestMapping(value="/Welcome",method=RequestMethod.GET)
		public String welcomepage(Model model){
			model.addAttribute("ms", "welcome to spring");
			return "hello";
		}
	
}
