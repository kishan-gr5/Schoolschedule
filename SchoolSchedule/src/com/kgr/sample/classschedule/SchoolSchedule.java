package com.kgr.sample.classschedule;

import java.util.ArrayList;


import com.kgr.sample.schoolclass.SchoolClass;

public class SchoolSchedule 
{
	private ArrayList<SchoolClass> classes = new ArrayList<SchoolClass>();

	public ArrayList<SchoolClass> getClasses() {
		return classes;
	}
	public void addClass(SchoolClass schoolclass)
	{
		classes.add(schoolclass);
	}
}
