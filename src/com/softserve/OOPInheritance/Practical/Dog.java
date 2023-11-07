package com.softserve.OOPInheritance.Practical;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof woof!");
    }

    @Override
    public void feed() {
        System.out.println("Ate bone.");
    }
}
