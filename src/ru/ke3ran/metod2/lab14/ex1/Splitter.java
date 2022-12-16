package ru.ke3ran.metod2.lab14.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн:");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}