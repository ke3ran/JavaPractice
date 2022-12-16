package ru.ke3ran.metod2.lab14.ex2;

public class IsString {

    public static void main(String[] args) {
        System.out.println(isThatString("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatString("abcdefghijklmnoasdfasdpqrstuv18340"));
    }


    public static boolean isThatString(String s) {
        return s.equals("abcdefghijklmnopqrstuv18340");
    }
}
