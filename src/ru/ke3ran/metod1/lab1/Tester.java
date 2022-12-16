package ru.ke3ran.metod1.lab1;

import ru.ke3ran.metod1.lab1.ex1.Ball;
import ru.ke3ran.metod1.lab1.ex2.Book;

public class Tester {

    public static void main(String[] args) {
        Ball ball = new Ball(13);
        System.out.println(ball);
        Book book = new Book("John Morgan", "1111-1111-111");
        System.out.println(book);
    }

}
