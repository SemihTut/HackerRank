package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakingNumber {
    public static void main(String[] args) {
        String text = "There are 1670 records that match the selected query";
        String reg = "\\d+";
        String result = text.replaceAll("[^0-9]","");
        System.out.println("toString() = " + result);
        System.out.println(reg(text, reg));

    }
    public static List<String> reg(String str, String reg){
        List<String>ask = new ArrayList<>();

        Matcher m = Pattern.compile(reg).matcher(str);
        while (m.find()){
            if(!m.group().isEmpty()){
                ask.add(m.group());
            }
        }
        return ask;
    }
}
