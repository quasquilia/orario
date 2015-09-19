package com.guarascio.rules;

import com.guarascio.dataobjects.Timetable;

public interface Rule {
	boolean isRespected(Timetable t);
}
