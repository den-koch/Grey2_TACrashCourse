package com.softserve.OOPInheritance.Practical;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
                new Cat(),
                new Cat(),
                new Cat()
        ));
        animals.forEach(Animal::voice);
        animals.forEach(Animal::feed);
    }
}
