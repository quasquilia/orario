package com.guarascio.dataobjects;

import java.util.List;

public class ClassHours {
	public final SchoolClass schoolClass;
	public final List<Hour>[] dailyHours = new List[6];
	
	public ClassHours(SchoolClass schoolClass) {
		super();
		this.schoolClass = schoolClass;
	}
	
	public void setDailyHours(int dayOfWeek, List<Hour> hours) {
		dailyHours[dayOfWeek] = hours;
	}
	
	
	
	
}
