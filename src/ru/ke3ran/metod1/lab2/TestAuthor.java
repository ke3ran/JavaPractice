package ru.ke3ran.metod1.lab2;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Ray", "ray@gmail.com", 'M');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author); // явно
        author.setEmail("mailbox@gmail.com");
        System.out.println(author.getEmail());
        System.out.println(author);
    }
}
