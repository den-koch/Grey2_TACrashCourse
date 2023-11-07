package com.softserve.Collections.Homework.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Ivan", 2),
                new Student("Slavik", 2),
                new Student("Misha", 3),
                new Student("Pasha", 3),
                new Student("Grisha", 1),
                new Student("Ann", 2)
        ));

        printStudents(students, 2);

        displaySortedByCourse(students);

        displaySortedByNames(students);
    }

    public static void printStudents(List<Student> students, Integer course) {
        students.stream()
                .filter(student -> course == student.getCourse())
                .forEach(System.out::println);
    }

    public static void printStudents(List<Student> students) {
        students.forEach(System.out::println);
    }

    public static void displaySortedByNames(List<Student> students) {
        System.out.println("Sorted by name:");
        students.stream()
                .sorted(StudentComparator::compareStudentsByName)
                .forEach(System.out::println);
    }

    public static void displaySortedByCourse(List<Student> students) {
        System.out.println("Sorted by course:");
        students.stream()
                .sorted(StudentComparator::compareStudentsByCourse)
                .forEach(System.out::println);
    }
//    public static void printStudentsByIterator(List<Student> students, Integer course) {
//        Iterator<Student> iterator = students.iterator();
//
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getCourse() == course) {
//                System.out.println(student.getName());
//            }
//        }
//    }


}
