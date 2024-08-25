package com.tka.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class All_States {

			public HashMap<String , ArrayList<String>> dao() {
			ArrayList<String> alMH=new ArrayList<String>();
			alMH.add("Mumbai");
			alMH.add("Pune");
			alMH.add("NagPur");
			System.out.println();
			
			ArrayList<String> alDL=new ArrayList<String>();
			System.out.println();
			
			ArrayList<String> alUP=new ArrayList<String>();
			alMH.add("Noida");
			alMH.add("Lucknow");
			alMH.add("Mathura");
			System.out.println();
			
			HashMap<String , ArrayList<String>> india=new HashMap<String , ArrayList<String>>();
			india.put("MH", alMH);
			india.put("DL", alDL);
			india.put("UP", alUP);
			System.out.println(india);
			
			return india;
		}
}
