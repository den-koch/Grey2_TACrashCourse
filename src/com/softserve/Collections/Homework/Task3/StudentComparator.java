package com.softserve.Collections.Homework.Task3;

public class StudentComparator {
    public static int compareStudentsByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public static int compareStudentsByCourse(Student student1, Student student2) {
        return student1.getCourse() - student2.getCourse();
    }

}
