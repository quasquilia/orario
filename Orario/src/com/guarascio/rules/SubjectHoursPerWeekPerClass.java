package com.guarascio.rules;

import com.guarascio.dataobjects.SchoolClass;
import com.guarascio.dataobjects.Subject;
import com.guarascio.dataobjects.Timetable;

public class SubjectHoursPerWeekPerClass implements Rule {
	public final SchoolClass schoolClass;
	public final Subject subject;
	public final int hours;
	
	public SubjectHoursPerWeekPerClass(SchoolClass schoolClass,
			Subject subject, int hours) {
		super();
		this.schoolClass = schoolClass;
		this.subject = subject;
		this.hours = hours;
	}

	@Override
	public boolean isRespected(Timetable t) {
		// TODO Auto-generated method stub
		return false;
	}

}
