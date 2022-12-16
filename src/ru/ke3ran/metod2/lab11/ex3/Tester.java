package ru.ke3ran.metod2.lab11.ex3;

import java.util.Date;

public class Tester {

    public static void main(String[] args) {
        BetterStudent betterStudent = new BetterStudent(
                1L,
                "Valentine",
                100,
                new Date(1067788800000L)
        );
        System.out.println(betterStudent.toString(0)); // long
        System.out.println(betterStudent.toString(1)); // medium
        System.out.println(betterStudent.toString(-1)); // short
    }

}