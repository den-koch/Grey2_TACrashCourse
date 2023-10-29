package com.softserve.oop.example;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Sam", 89);
        Student student2 = new Student("Bob", 65);
        Student student3 = new Student("Mary", 77);

        System.out.println("Students: ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.printf("\nAverage rating: %.2f\n", Student.getAvgRating());

        student3.setRating(93);
        System.out.println("\nUpdate rating: " + student3);
        System.out.printf("Average rating: %.2f\n", Student.getAvgRating());

        System.out.printf("\n%s better then %s: %b", student1.getName(), student2.getName(), student1.betterStudent(student2));
        System.out.printf("\n%s better then %s: %b", student2.getName(), student3.getName(), student2.betterStudent(student3));

    }
}