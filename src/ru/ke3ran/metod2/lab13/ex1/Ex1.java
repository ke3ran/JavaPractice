package ru.ke3ran.metod2.lab13.ex1;

public class Ex1 {

    public static void main(String[] args) {
        // 2
        String message = "Very boring task";
        System.out.println(message.charAt(message.length()-1));

        // 3
        String ends = "ДА ЗАКАНЧИВАЕТСЯ ОНА!!!";
        System.out.println(ends.endsWith("!!!"));

        // 4
        String like = "I like rock n' roll\n" +
                "Я люблю рок-и-ролл,\n" +
                "So put another dime in the jukebox, baby";
        System.out.println(like.startsWith("I like"));

        // 5
        String java = "Java........ but Kotlin....";
        System.out.println(java.contains("Java"));

        // 6
        String likeJava = "I like Java!!!";
        System.out.println(likeJava.indexOf("Java"));

        // 7
        likeJava.replaceAll("a", "o");
        System.out.println(likeJava);

        // 8
        System.out.println(likeJava.toUpperCase());

        // 9
        System.out.println(likeJava.toLowerCase());

        // 10
        System.out.println(likeJava.substring(7, 11));
    }

    // 1
    private static void acceptString(String message) {
        System.out.println(message);
    }


}
