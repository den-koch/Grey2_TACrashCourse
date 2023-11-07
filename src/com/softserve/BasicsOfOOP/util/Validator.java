package com.softserve.BasicsOfOOP.util;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+(?:[- ][a-zA-Z]+)*$");

    /**
     * Validates the name of a person using regex.
     *
     * @param name the name to validate
     * @return true if the name is valid, false otherwise
     */
    public static boolean isValidName(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates the year.
     *
     * @param year the year to validate
     * @return true if the year is valid, false otherwise
     */
    public static boolean isValidYear(int year) {
        return Integer.toString(year).length() == 4;
    }

    /**
     * Validates the month.
     *
     * @param month the month to validate
     * @return true if the month is valid, false otherwise
     */
    public static boolean isValidMonth(int month) {
        return month > 0 && month <= 12;
    }

    /**
     * Validates the day.
     *
     * @param day the day to validate
     * @return true if the day is valid, false otherwise
     */
    public static boolean isValidDay(int day) {
        return day >= 1 && day <= 31;
    }
}
