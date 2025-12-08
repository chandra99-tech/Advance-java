package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String homepage(){
		return "index";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String message = "Welcome From Controller";
		return new ModelAndView("welcome", "message", message);
	}
	
	@GetMapping("/test")
	public String testdata(Model myModel) {
		myModel.addAttribute("name","Ayush");
		myModel.addAttribute("email","ash@gmail.com");
		return "testdata";
	}
}
