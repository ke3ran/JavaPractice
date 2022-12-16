package ru.ke3ran.metod2.lab11.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVSLinked {

    public static void main(String[] args) {
        addAt(new ArrayList<>(), "ArrayList");
        addAt(new LinkedList<>(), "LinkedList");
        System.out.println("- - - - - - - - -");

        remove(new ArrayList<>(), "ArrayList");
        remove(new LinkedList<>(), "LinkedList");
        System.out.println("- - - - - - - - -");

        add(new ArrayList<>(), "ArrayList");
        add(new LinkedList<>(), "LinkedList");
        System.out.println("- - - - - - - - -");

        contains(new ArrayList<>(), "ArrayList");
        contains(new LinkedList<>(), "LinkedList");
        System.out.println("- - - - - - - - -");
    }

    public static void addAt(List<Integer> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i, i);
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("INSERT " + name + " : " + time);
    }

    public static void remove(List<Integer> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.remove((Object) i);
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("REMOVE " + name + " : " + time);
    }

    public static void add(List<Integer> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("ADD " + name + " : " + time);
    }

    public static void contains(List<Integer> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.contains(i);
        }
        long finish = System.currentTimeMillis();
        long time = finish - start;
        System.out.println("CONTAINS " + name + " : " + time);
    }
}
