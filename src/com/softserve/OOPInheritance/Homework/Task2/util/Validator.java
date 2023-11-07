package com.softserve.OOPInheritance.Homework.Task2.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    //    Social Security Number Regex
    final static String ssnRegex = "^\\d{3}-\\d{2}-\\d{4}$";

    //     Individual Taxpayer Identification Number Regex
    final static String itinRegex = "^9\\d{2}-\\d{2}-\\d{4}$";
    //    Employee Id Regex
    final static String idRegex = "^[a-z]{2}\\d{4}$";
    final static Pattern ssnPattern = Pattern.compile(ssnRegex);
    final static Pattern itinPattern = Pattern.compile(itinRegex);
    final static Pattern idPattern = Pattern.compile(idRegex);

    public static boolean ssnValidator(String ssn) {
        Matcher ssnMatcher = ssnPattern.matcher(ssn);
        return ssnMatcher.matches();
    }

    public static boolean itinValidator(String itin) {
        Matcher itinMatcher = itinPattern.matcher(itin);
        return itinMatcher.matches();
    }

    public static boolean idValidator(String id) {
        Matcher idMatcher = idPattern.matcher(id);
        return idMatcher.matches();
    }

}
