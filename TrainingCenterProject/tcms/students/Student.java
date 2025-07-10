package tcms.students;

import tcms.persons.Person;
import tcms.courses.Course;
import tcms.interfaces.Displayable;
import tcms.interfaces.Registrable;
import tcms.interfaces.Searchable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Displayable, Registrable, Searchable {
    private String studentLevel;
    private List<Course> registeredCourses = new ArrayList<>();

    public Student() {}

    public Student(int id, String name, String email, String phoneNumber, String studentLevel) {
        super(id, name, email, phoneNumber);
        setStudentLevel(studentLevel);
    }

    @Override
    public void displayInfo() {
        System.out.printf(
                "ID: %d\nName: %s\nEmail: %s\nPhoneNumber: %s\nStudent Level: %s\n",
                getId(), getName(), getEmail(), getPhoneNumber(), getStudentLevel()
        );

        if (registeredCourses.isEmpty()) {
            System.out.println("Registered Courses: None");
        } else {
            System.out.println("Registered Courses:");
            for (Course course : registeredCourses) {
                System.out.println("- " + course.getCourseName());
            }
        }

        System.out.println("----------------------");
    }

    @Override
    public void registerToCourse(Course course) {
        registeredCourses.add(course);
    }

    @Override
    public void unregisterFromCourse(Course course) {
        registeredCourses.remove(course);
    }

    @Override
    public boolean matches(int id) {
        return this.getId() == id;
    }

    public String getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(String studentLevel) {
        if (studentLevel.equals("Beginner") || studentLevel.equals("Intermediate") || studentLevel.equals("Advanced")) {
            this.studentLevel = studentLevel;
        } else {
            throw new IllegalArgumentException("Invalid student level. Must be Beginner, Intermediate, or Advanced.");
        }
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
