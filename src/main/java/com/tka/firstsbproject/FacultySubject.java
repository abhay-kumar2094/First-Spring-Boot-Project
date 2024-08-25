package com.tka.firstsbproject;

public class FacultySubject {
		
	int facultyId;
	String subjectName;
	
	
	public FacultySubject(int facultyId, String subjectName) {
		super();
		this.facultyId = facultyId;
		this.subjectName = subjectName;
	}
	
	public FacultySubject() {
		super();
		
	}

	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	
}
