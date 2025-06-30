import java.util.ArrayList;
import java.util.List;

public class Trainer extends Person implements Displayable, Searchable {
    private String specialization;
    private List<Course> assignedCourses = new ArrayList<>();

    public Trainer() {}

    public Trainer(int id, String name, String email, String phoneNumber, String specialization) {
        super(id, name, email, phoneNumber);
        setSpecialization(specialization);
    }

    @Override
    public void displayInfo() {
        System.out.printf(
                "ID: %d\nName: %s\nEmail: %s\nPhoneNumber: %s\nSpecialization: %s\n",
                getId(), getName(), getEmail(), getPhoneNumber(), getSpecialization()
        );

        if (assignedCourses.isEmpty()) {
            System.out.println("Assigned Courses: None");
        } else {
            System.out.println("Assigned Courses:");
            for (Course course : assignedCourses) {
                System.out.println("- " + course.getCourseName());
            }
        }

        System.out.println("----------------------");
    }

    @Override
    public boolean matches(int id) {
        return this.getId() == id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization.equals("AI") || specialization.equals("Web") || specialization.equals("Mobile")) {
            this.specialization = specialization;
        } else {
            throw new IllegalArgumentException("Invalid specialization. Must be AI, Web, or Mobile.");
        }
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(List<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }
}
