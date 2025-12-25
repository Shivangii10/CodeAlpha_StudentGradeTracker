package org.example;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> marks;


    // Constructor
    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    // Add a mark
    public void addMark(int mark) {
        marks.add(mark);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for marks
    public ArrayList<Integer> getMarks() {
        return marks;
    }

    // Calculate average marks
    public double getAverage() {
        Integer x = getInteger();
        if (x != null) return x;
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.size();
    }

    // Highest mark
    public int getHighest() {
        Integer x = getInteger();
        if (x != null) return x;
        int max = marks.get(0);
        for (int m : marks) {
            if (m > max) {
                max = m;
            }
        }
        return max;
    }

    private Integer getInteger() {
        if (marks.isEmpty()) {
            return 0;
        }
        return null;
    }

    // Lowest mark
    public int getLowest() {
        Integer x = getInteger();
        if (x != null) return x;
        int min = marks.get(0);
        for (int m : marks) {
            if (m < min) {
                min = m;
            }
        }
        return min;
    }
}
