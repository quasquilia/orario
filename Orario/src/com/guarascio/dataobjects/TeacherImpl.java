package com.guarascio.dataobjects;

import java.util.List;

public class TeacherImpl implements Teacher {
	public final String teacherName;
	
	public TeacherImpl(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public void addClassSubjectHours(SchoolClass schoolClass, Subject subject, int hours) {
		
	}
	
	/* (non-Javadoc)
	 * @see com.guarascio.dataobjects.Teacher#getClassSubjectHours(com.guarascio.dataobjects.SchoolClass, com.guarascio.dataobjects.Subject)
	 */
	@Override
	public int getClassSubjectHours(SchoolClass schoolClass, Subject subject) {
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.guarascio.dataobjects.Teacher#getClassSubjects(com.guarascio.dataobjects.SchoolClass)
	 */
	@Override
	public List<Subject> getClassSubjects(SchoolClass schoolClass) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.guarascio.dataobjects.Teacher#getSchoolClasses()
	 */
	@Override
	public List<Subject> getSchoolClasses() {
		return null;
	}
}
