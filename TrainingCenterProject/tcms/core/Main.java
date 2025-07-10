package tcms.core;

import tcms.students.Student;
import tcms.trainers.Trainer;
import tcms.courses.Course;
import tcms.core.TrainingCentre;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ahmed Youssef", "ahmed.youssef@gmail.com", "01011223344", "Beginner");
        Student s2 = new Student(2, "Mariam Adel", "mariam.adel@gmail.com", "01099887766", "Intermediate");
        Student s3 = new Student(3, "Omar Khaled", "omar.khaled@gmail.com", "01055667788", "Advanced");

        Trainer t1 = new Trainer(100, "Eng. Yasser Hossam", "yasser.hossam@gmail.com", "01122334455", "AI");
        Trainer t2 = new Trainer(101, "Eng. Rania Mahmoud", "rania.mahmoud@gmail.com", "01233445566", "Web");

        Course aiCourse = new Course(501, "AI Foundations",
                "This course covers the basics of Artificial Intelligence including Machine Learning and Neural Networks.",
                40, t1, new ArrayList<>());

        Course webCourse = new Course(502, "Full-Stack Web Development",
                "Learn HTML, CSS, JavaScript, and backend development using modern frameworks.",
                60, t2, new ArrayList<>());

        aiCourse.getEnrolledStudents().add(s1);
        aiCourse.getEnrolledStudents().add(s3);
        webCourse.getEnrolledStudents().add(s2);

        t1.getAssignedCourses().add(aiCourse);
        t2.getAssignedCourses().add(webCourse);

        s1.registerToCourse(aiCourse);
        s3.registerToCourse(aiCourse);
        s2.registerToCourse(webCourse);

        TrainingCentre centre = new TrainingCentre("FutureTech Learning Academy", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        centre.addStudent(s1);
        centre.addStudent(s2);
        centre.addStudent(s3);
        centre.addTrainer(t1);
        centre.addTrainer(t2);
        centre.addCourse(aiCourse);
        centre.addCourse(webCourse);

        centre.displayInfo();
    }
}
