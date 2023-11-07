package com.softserve.BasicsOfOOP.Example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 90);
        Student student2 = new Student("Misha", 79);
        Student student3 = new Student("Pavlo", 69);

        System.out.println("All students:");
        Student.students.forEach(System.out::println);
        System.out.format("The best student:%s%n", Student.betterStudent(student1, student2, student3));
        System.out.println(Student.avgRating);
        Student.students.forEach(student -> {
            System.out.format("%s has %s rating", student.getName(), student.getRating());
        });


    }
}
