package ru.ke3ran.metod2.lab14.ex4;

import java.util.regex.Pattern;

public class FindMePluses {

    public static void main(String[] args) {
        System.out.println(hasPlus("1 / 3 -5"));
        System.out.println(hasPlus("1 + 3 -5"));
        System.out.println(hasPlus("1 / 3+5"));
    }

    public static boolean hasPlus(String s) {
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }
}
