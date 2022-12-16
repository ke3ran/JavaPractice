package ru.ke3ran.metod2.lab14.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceParser {

    public static void main(String[] args) {
        System.out.println(findCorrectPrice("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
    }

    public static List<String> findCorrectPrice(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
    
}
