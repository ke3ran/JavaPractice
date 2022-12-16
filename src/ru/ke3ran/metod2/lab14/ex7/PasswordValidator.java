package ru.ke3ran.metod2.lab14.ex7;

import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String[] args) {
        System.out.println(checkPass("badpass"));
        System.out.println(checkPass("_Googpass1"));
    }

}
