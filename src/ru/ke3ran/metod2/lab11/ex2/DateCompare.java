package ru.ke3ran.metod2.lab11.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Date ");
        String input = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse(input);
        Date currentDate = new Date();
        if (currentDate.after(date)) System.out.println("Before current date");
        else System.out.println("After current date");
    }
}
