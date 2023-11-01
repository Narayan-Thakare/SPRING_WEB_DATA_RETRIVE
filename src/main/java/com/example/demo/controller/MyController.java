package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;

@Controller
public class MyController {
	
	
	
	@RequestMapping("/")
	String myfun(Model m) {
		
		Student s=new Student();
		
		System.out.println("Data in u object from "+s);
		m.addAttribute("obj",s);
		
		
		return "page1.html";
	}
	
	
	
	@RequestMapping("/data")
	ModelAndView  myfun2(@ModelAttribute("obj") Student s  ) {
		
		//Student s=new Student();
		
		System.out.println("Data in u object from After "+s);
		
		
		return new ModelAndView("welcome.html").addObject("ob",s);
	}
	

}
