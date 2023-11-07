package com.softserve.OOPInheritance.Homework.Task1;

import com.softserve.OOPInheritance.Homework.Task1.FlyingBirds.Eagle;
import com.softserve.OOPInheritance.Homework.Task1.FlyingBirds.Swallow;
import com.softserve.OOPInheritance.Homework.Task1.NonFlyingBirds.Chicken;
import com.softserve.OOPInheritance.Homework.Task1.NonFlyingBirds.Penguin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>(List.of(
                new Eagle(),
                new Swallow(),
                new Chicken(),
                new Penguin()
        ));

        birds.forEach(System.out::println);

        System.out.println("-".repeat(20));

        birds.forEach(Bird::fly);
    }
}
