package tcms.interfaces;

import tcms.courses.Course;

public interface Registrable { void registerToCourse(Course course); void unregisterFromCourse(Course course); }