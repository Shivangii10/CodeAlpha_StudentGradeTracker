package org.example;

import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Search student by name
    public Student searchStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // Display report of all students
    public void displayReport() {
        if (students.isEmpty()) {
            System.out.println("\nNo students to display yet.");
            return;
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("Name\t\tAverage\tHighest\tLowest");
        System.out.println("--------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%s\t\t%.2f\t%d\t%d\n",
                    s.getName(),
                    s.getAverage(),
                    s.getHighest(),
                    s.getLowest());
        }

        System.out.println("--------------------------------------------------");
    }
}
