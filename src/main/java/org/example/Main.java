package org.example;

import java.util.List;
import java.util.SequencedSet;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        List<Integer> l = List.of(1, 2, 3, 4);
        var count = l.stream().map((x) -> 1).count();
        System.out.println(count);

        StackADT<Integer> s = null;
    }
}