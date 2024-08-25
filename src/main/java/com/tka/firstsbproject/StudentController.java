package com.tka.firstsbproject;

import java.util.ArrayList;

//import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.firstsbproject.FacultySubject;
@RestController
public class StudentController {
	
	@GetMapping("firstapi")
	public String WelcomeMessage() {
		return "Message-Data";
	}
	
	@GetMapping("allcarcompanies")
	public ArrayList<String> allcars() {
		ArrayList<String> allcars=new ArrayList<>();
		allcars.add("Maruti");
		allcars.add("tata");
		allcars.add("Honda");
		
		return allcars;
	}
		@GetMapping("filter")
	ArrayList<FacultySubject> facultysubs() {
			Student_Service service=new Student_Service();
		ArrayList<FacultySubject> al=service.facultysubject();
		return al;
	}
	

}
