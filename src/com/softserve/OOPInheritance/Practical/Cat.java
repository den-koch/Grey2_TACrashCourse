package com.softserve.OOPInheritance.Practical;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Mew mew!");
    }

    @Override
    public void feed() {
        System.out.println("Ate fish.");
    }
}
