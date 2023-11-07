package com.softserve.BasicsOfOOP.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Student {
    public static double avgRating = 0.0d;
    public static ArrayList<Student> students = new ArrayList<>();
    private String name;
    private int rating;

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        avgRating = countAvgRating();
        students.add(this);
    }

    /**
     * Finds the student with the highest rating in the given list of students.
     *
     * @param students the list of students
     * @return the student with the highest rating, or null if the list is empty
     */
    public static Student betterStudent(Student... students) {
        return Arrays.stream(students)
                .max(Comparator.comparing(Student::getRating))
                .orElse(null);
    }

    /**
     * Calculates the average rating of the students in the list.
     *
     * @return the average rating of the students
     */
    private double countAvgRating() {
        double avg = students.stream()
                .mapToDouble(Student::getRating)
                .average()
                .orElse(0.0);
        return avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", rating=" + rating +
               '}';
    }
}
