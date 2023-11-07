package com.softserve.Collections.Practical.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(
                generateRandomArrayList(10, 0, 20)
        );
        List<Integer> newCollection = myCollection.stream()
                .filter(element -> element > 5)
                .distinct()
                .map(myCollection::indexOf)
                .toList();

        System.out.println("Initial collection");
        System.out.println(myCollection);
//        * get only indexes of first found element
        System.out.println("New collection");
        System.out.println(newCollection);

        System.out.println("Formatted collection");
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        //* get only indexes of first found element
        myCollection.forEach(el -> System.out.format("position - %d,value of -%d%n", myCollection.indexOf(el), el));
    }

    public static List<Integer> generateRandomArrayList(int size, int min, int max) {
        return IntStream.range(0, size)
                .map(i -> RANDOM.nextInt(min, max + 1))
                .boxed()
                .toList();
    }
}
