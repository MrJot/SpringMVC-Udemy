package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
//full adress of the web page will be: full_project_name/student-->This is why we have request mapping
public class StudentController {
	
	
//This is subpage for /student, We are returning "student-form" 
//	therefore we must create jsp page with the same name
	
@RequestMapping("/showForm")
public String showForm(Model theModel) {
	
	
	//create student object
	
	Student theStudent= new Student();
	
	theModel.addAttribute("student", theStudent);
	
	//add student object to the model
	
	return "student-form";
}


//we are returning model to "student-confirmation" jsp page.
//as function parameter we need to have model atribute and object
//model atribue name equals to model atribue which was defined in the previous function
//We must create "student-confirmation.jsp" page


@RequestMapping("/processForm")
public String processForm(@ModelAttribute("student") Student theStudent) {
	
	System.out.println("theStudent: "+theStudent.getStudentFirstName());
	System.out.println("theStudent: "+theStudent.getStudentLastName());
	
	return "student-confirmation";
}
}
