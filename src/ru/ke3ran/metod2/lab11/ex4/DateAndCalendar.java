package ru.ke3ran.metod2.lab11.ex4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndCalendar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year, month, day;

        System.out.println("Enter year: ");
        year = scanner.nextInt();

        System.out.println("Enter month: ");
        month = scanner.nextInt();

        System.out.println("Enter day: ");
        day = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(year, month, day);
        Date date = new Date(year, month, day);

        System.out.println(calendar.getTime());
        System.out.println(date);

        int hours, minutes;

        System.out.println("Enter hours: ");
        hours = scanner.nextInt();

        System.out.println("Enter minutes");
        minutes = scanner.nextInt();

        calendar = new GregorianCalendar();
        date = new Date(year, month, day, hours, minutes);
        calendar.setTime(date);

        System.out.println(calendar.getTime());
        System.out.println(date);
    }
}
