package com.tka.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.dao.All_States;
import com.tka.service.All_States_Service;

public class All_States_Controller {
	
	@GetMapping("alstates")
	HashMap<String , ArrayList<String>> alstates() {
		All_States_Service ser=new All_States_Service();
		
		HashMap<String , ArrayList<String>> con=ser.service();
		
		return con;
	}
}
