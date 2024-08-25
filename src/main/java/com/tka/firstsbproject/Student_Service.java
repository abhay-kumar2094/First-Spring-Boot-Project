package com.tka.firstsbproject;

import java.util.ArrayList;
//import java.util.ArrayList;
public class Student_Service {
		
	public ArrayList<FacultySubject> facultysubject() {
		Student_Dao dao=new Student_Dao();
		ArrayList<FacultySubject> all=dao.all_faculty_subs();
		ArrayList<FacultySubject> filter=new ArrayList<FacultySubject>();
		for(FacultySubject faculty : all) {
			if(faculty.getSubjectName()!="python") {
				filter.add(faculty);
			}
		}
		/*
		 * for(FacultySubject facultysubject : all) {
		 * if(!facultysubject.getName().equals("python"));
		 * sub_filter.add(facultysubject); }
		 */
		return filter;
	}
	

}
