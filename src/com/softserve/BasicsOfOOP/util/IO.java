package com.softserve.BasicsOfOOP.util;

import com.softserve.BasicsOfOOP.Homework.Person;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user to enter their date of birth and returns a `LocalDate` object representing the date of birth.
     *
     * @return the user's date of birth as a `LocalDate` object
     */
    public static LocalDate inputLocalDate() {
        try {
            System.out.println("Please enter a year:");
            int year = SCANNER.nextInt();
            System.out.println("Please enter a month as number:");
            int month = SCANNER.nextInt();
            System.out.println("Please enter a day:");
            int day = SCANNER.nextInt();
            return LocalDate.of(year, month, day);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Sorry invalid date.");
        }
    }

    /**
     * Prompts the user to enter their name and validates the name. If the name is not valid, the user is prompted to enter their name again.
     *
     * @return the user's name
     */
    public static String inputName() {
        boolean isValid = false;
        String name = "";
        while (!isValid) {
            System.out.println("Please enter your name:");
            name = SCANNER.next();
            isValid = Validator.isValidName(name);
            if (!isValid) {
                System.err.println("Try valid name");
            }
        }
        return name;
    }

    /**
     * Prompts the person to enter their name and date of birth.
     */
    public static void inputPerson(Person person) {
        person.setDob(inputLocalDate());
        person.setName(IO.inputName());
    }

    /**
     * Prints the person's name and date of birth to the console.
     */
    public static void outputPerson(Person person) {
        System.out.println(person);
    }

}
