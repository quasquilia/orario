package com.guarascio.dataobjects;

import java.util.List;

public interface Teacher {

	int getClassSubjectHours(SchoolClass schoolClass,
			Subject subject);

	List<Subject> getClassSubjects(SchoolClass schoolClass);

	List<Subject> getSchoolClasses();

}