package ru.ke3ran.metod1.lab5.ex5;

public class TriangleNumber {

    //1, 2 2 , 3 3 3, 4 4 4 4
    public static void main(String[] args) {
        triangle(5);
    }

    public static void triangle(int n) {
        if (n == 0) {
            return;
        }
        triangle(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", n);
        }
    }

}
