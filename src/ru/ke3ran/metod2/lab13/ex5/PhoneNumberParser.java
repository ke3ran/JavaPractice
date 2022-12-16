package ru.ke3ran.metod2.lab13.ex5;

public class PhoneNumberParser {
    private final String code;
    private final String city;
    private final String triplet;
    private final String quadruple;

    public PhoneNumberParser(String phone) {
        if (phone.startsWith("8")) {
            code = "+7";
        } else {
            code = phone.substring(0, phone.length() - 10);
        }
        city = phone.substring(phone.length() - 10, phone.length() - 7);
        triplet = phone.substring(phone.length() - 7, phone.length() - 4);
        quadruple = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumberParser("88005553535"));
        System.out.println(new PhoneNumberParser("+78005553535"));
        System.out.println(new PhoneNumberParser("+1238005553535"));
        System.out.println(new PhoneNumberParser("+118005553535"));
    }
}
