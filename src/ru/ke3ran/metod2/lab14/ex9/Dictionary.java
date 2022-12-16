package ru.ke3ran.metod2.lab14.ex9;

public class Dictionary {

    public static void main(String[] args) {
        String text = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        buildDictionary(text);
    }

    private static void buildDictionary(String text) {
        text = text.toLowerCase();

        int[] russian = new int['я' - 'а' + 1];
        int[] english = new int['z' - 'a' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                russian[ch - 'а']++;
            } else if (ch >= 'a' && ch <= 'z') {
                english[ch - 'a']++;
            }
        }

        for (int i = 0; i < russian.length; i++) {
            System.out.println((char) (i + 'а') + " = " + russian[i]);
        }
        for (int i = 0; i < english.length; i++) {
            System.out.println((char) (i + 'a') + " = " + english[i]);
        }
    }

}
