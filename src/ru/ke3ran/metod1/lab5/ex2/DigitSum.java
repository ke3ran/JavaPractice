package ru.ke3ran.metod1.lab5.ex2;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(digitSum(12));
    }

    public static int digitSum(int number) {
        return (number == 0) ? 0 : (number % 10) + digitSum(number / 10);
    }


}
