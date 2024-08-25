package com.tka.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RestController;

import com.tka.dao.All_States;

public class All_States_Service {

		

	public HashMap<String , ArrayList<String>> service() {
	All_States objs=new All_States();
	
	HashMap<String , ArrayList<String>> alstates=objs.dao();
	
	return alstates;
}
}
