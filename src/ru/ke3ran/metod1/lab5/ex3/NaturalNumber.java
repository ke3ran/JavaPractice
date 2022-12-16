package ru.ke3ran.metod1.lab5.ex3;

public class NaturalNumber {

    public static void main(String[] args) {
        natural(10);
    }

    public static void natural(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.printf("%d, ", i);
        }
    }

}
