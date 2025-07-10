# Training Center Management System (Java OOP Console Application)

A Java console application for managing a training center using Object-Oriented Programming (OOP) principles.

## Project Structure

```
TrainingCenterProject/
  tcms/
    core/         # Main.java, TrainingCentre.java
    students/     # Student.java
    trainers/     # Trainer.java
    courses/      # Course.java
    persons/      # Person.java
    interfaces/   # Displayable.java, Registrable.java, Searchable.java
out/              # Compiled class files
```

## Compile & Run

1. **Compile:**
   From the project root:
   ```bash
   javac TrainingCenterProject/tcms/*/*.java -d out
   ```
2. **Run:**
   From the project root:
   ```bash
   java -cp out tcms.core.Main
   ```

## Features
- Manage students, trainers, and courses.
- Register students in courses.
- Display information about the center, students, trainers, and courses.
- Organized code using professional Java packages.

## Notes
- Make sure to run compile and run commands from the project root directory.
- If you use an IDE (like VS Code or IntelliJ), set the classpath to the `out` directory.

---

*The project structure has been updated for better maintainability and scalability.*

