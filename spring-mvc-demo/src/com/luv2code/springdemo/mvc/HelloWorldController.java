package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//need a controller method to show the initial form of html
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//need a controller to process a form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		
		theName=theName.toUpperCase();
		
		//create a message
		
		String result = "Yo! This is your upper case name: " + theName;
		
		//add message to the model
		
		model.addAttribute("message", result);
		return "helloworld";
		
	}
	
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		
		//convert the data to all caps
		
		theName=theName.toUpperCase();
		
		//create a message
		
		String result = "Hello My Friend. Here @RequestParam is \n "
					  + "reading studentName and assigns it to theName variable: " + theName;
		
		//add message to the model
		
		model.addAttribute("message", result);
		return "helloworld";
		
	}

}
