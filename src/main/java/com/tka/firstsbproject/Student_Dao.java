package com.tka.firstsbproject;

import java.util.ArrayList;

public class Student_Dao {
		
		public ArrayList<FacultySubject> all_faculty_subs() {
			ArrayList<FacultySubject> subs=new ArrayList<>();
			subs.add(new FacultySubject(1,"java"));
			subs.add(new FacultySubject(2,"oracle"));
			subs.add(new FacultySubject(3,"python"));
			subs.add(new FacultySubject(4,"oracle"));
			subs.add(new FacultySubject(5,"python"));
			
			return subs;
		}

	}


