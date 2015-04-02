package com.kgr.sample.schoolclass;
public class SchoolClass 
{
	private String title;
	private int starttime;
	private int endtime;
	private int day;
	
	public SchoolClass(String title,int starttime,int endtime,int day)
	{
		this.title = title;
		this.starttime = starttime;
		this.endtime = endtime;
		this.day = day;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
}
