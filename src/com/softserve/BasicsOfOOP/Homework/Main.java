package com.softserve.BasicsOfOOP.Homework;

import com.softserve.BasicsOfOOP.util.IO;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//        Person person4 = new Person();
//        Person person5 = new Person();

        IO.inputPerson(person1);
        IO.outputPerson(person1);
    }
}
