package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GradeManager manager = new GradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Student Grade Tracker ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Summary Report");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    Student student = new Student(name);

                    System.out.print("Enter number of subjects: ");
                    int subjects = scanner.nextInt();

                    for (int i = 1; i <= subjects; i++) {
                        System.out.print("Enter mark for subject " + i + ": ");
                        int mark = scanner.nextInt();

                        while (mark < 0 || mark > 100) {
                            System.out.println("Invalid mark! Enter between 0–100:");
                            mark = scanner.nextInt();
                        }

                        student.addMark(mark);
                    }

                    manager.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    manager.displayReport();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();

                    Student found = manager.searchStudent(searchName);

                    if (found != null) {
                        System.out.println("\nStudent found:");
                        System.out.println("Name: " + found.getName());
                        System.out.println("Marks: " + found.getMarks());
                        System.out.println("Average: " + found.getAverage());
                        System.out.println("Highest: " + found.getHighest());
                        System.out.println("Lowest: " + found.getLowest());
                    } else {
                        System.out.println("No student found with that name.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
