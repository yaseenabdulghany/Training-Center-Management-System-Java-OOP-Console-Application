import java.util.ArrayList;
import java.util.List;

public class TrainingCentre implements Displayable {
    private String centerName;
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Trainer> trainers = new ArrayList<>();

    public TrainingCentre() {}

    public TrainingCentre(String centerName, List<Course> courses, List<Student> students, List<Trainer> trainers) {
        this.centerName = centerName;
        this.courses = courses;
        this.students = students;
        this.trainers = trainers;
    }

    @Override
    public void displayInfo() {
        System.out.println("Training Center: " + centerName);

        System.out.println("Courses:");
        if (courses.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Course course : courses) course.displayInfo();
        }

        System.out.println("Students:");
        if (students.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Student student : students) student.displayInfo();
        }

        System.out.println("Trainers:");
        if (trainers.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Trainer trainer : trainers) trainer.displayInfo();
        }

        System.out.println("=====================================");
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }
}
