package com.softserve.oop.example;

public class Student {
    private String name;
    private double rating;

    private static int studentNumber;
    private static double ratingSum;


    public Student() {
        studentNumber++;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        studentNumber++;
        ratingSum += rating;
    }

    public boolean betterStudent(Student student) {
        if (student == null) throw new IllegalArgumentException();

        return this.rating > student.getRating();
    }

    public static double getAvgRating() {
        return ratingSum / studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        ratingSum -= this.rating;
        this.rating = rating;
        ratingSum += rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
