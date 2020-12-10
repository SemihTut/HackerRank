package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakingNumber {
    public static void main(String[] args) {
        String text = "There are 1670 records that match the selected query";
        String text2 = " View 1-20 of 53";
        String asd = text2.replaceAll("[^\\s\\d]+\\s","");
        System.out.println("asd = " + asd);
        String reg = "\\d+";
        String result = text.replaceAll("[^0-9]","");
        System.out.println("result = " + result);
        String lastWord = text2.substring(text2.lastIndexOf(" ")+1);
        System.out.println("lastWord = " + lastWord);


    }

}
