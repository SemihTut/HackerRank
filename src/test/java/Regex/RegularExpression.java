package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpression {

    public static void main(String[] args) {
        String re = ".";
        String text = ",";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println("result = " + result);


    }
}
