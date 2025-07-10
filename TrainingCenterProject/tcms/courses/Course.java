package tcms.courses;

import tcms.interfaces.Displayable;
import tcms.interfaces.Searchable;
import tcms.trainers.Trainer;
import tcms.students.Student;
import java.util.ArrayList;
import java.util.List;

public class Course implements Displayable, Searchable {
    private int courseId, durationHours;
    private String courseName, description;
    private Trainer trainer;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course() {}

    public Course(int courseId, String courseName, String description, int durationHours, Trainer trainer, List<Student> enrolledStudents) {
        setCourseId(courseId);
        setCourseName(courseName);
        setDescription(description);
        setDurationHours(durationHours);
        setTrainer(trainer);
        setEnrolledStudents(enrolledStudents);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Course Info:\nID: %d\nName: %s\nDescription: %s\nDuration Hours: %d\nTrainer: %s\n",
                getCourseId(), getCourseName(), getDescription(), getDurationHours(),
                trainer != null ? trainer.getName() : "None");

        if (enrolledStudents.isEmpty()) {
            System.out.println("Enrolled Students: None");
        } else {
            System.out.println("Enrolled Students:");
            for (Student student : enrolledStudents) {
                System.out.println("- " + student.getName());
            }
        }

        System.out.println("----------------------");
    }

    @Override
    public boolean matches(int ID) {
        return this.getCourseId() == ID;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        if (durationHours > 0) {
            this.durationHours = durationHours;
        } else {
            throw new IllegalArgumentException("Duration must be positive.");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
