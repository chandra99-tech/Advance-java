package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.beans.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService stservice;
	
	@GetMapping("/showstudent")
	public ModelAndView getAllProduct(HttpSession session) {
		MyUser user = (MyUser) session.getAttribute("user");
		if(user!=null && List.of("user","admin","moderator").contains(user.getRole())) {
			List<Student> slist = stservice.getAllStudents();
			return new ModelAndView("showstudent","slist",slist);
		}
		else {
			return new ModelAndView("loginpage","message","Please Provide Credentails");
		}
	}
	
	@GetMapping("/addstudent")
	public String showstudentform(Model myModel) {
		myModel.addAttribute("s1",new Student());
		return "insertStudent";
		
	}
	
	@PostMapping("/insertStudent")
	//public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty, @RequestParam double price, @RequestParam LocalDate mfgdate,@RequestParam int cid) {
	public ModelAndView insertProduct(@ModelAttribute Student s) {
		System.out.println(s);
		boolean status=stservice.addstudent(s);
		return new ModelAndView("redirect:/student/showstudent");
	}
}
