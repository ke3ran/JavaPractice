package ru.ke3ran.metod1.lab5.ex1;

import java.util.Scanner;

public class AtoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        atoB(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }

    public static void atoB(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.printf("%d, ", i);
            }
        } else {
            for (int i = a; i>=b; i--) {
                System.out.printf("%d, ", i);
            }
        }
    }


}
