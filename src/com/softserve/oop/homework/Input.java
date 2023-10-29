package com.softserve.oop.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static LocalDate date() {
        System.out.println("============");
        int year = enterInt("Enter year: ");
        int month = enterInt("Enter month: ");
        int day = enterInt("Enter day: ");
//        System.out.println("============");

        return LocalDate.of(year, month, day);

    }

    public static String name(){
        System.out.println("============");
        System.out.print("Enter name: ");
        return scanner.nextLine();
    }

    private static int enterInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Invalid data! Try again: ");
        }
        return scanner.nextInt();
    }
}
