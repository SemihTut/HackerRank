package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telegram {
    public static void main(String[] args) {
        String str = "Product of 12 is soul out for 254";
        String regex = "\\d+";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        int total=0;
        while (matcher.find()){
            int a = Integer.parseInt(matcher.group());
            total+=a;
        }
        System.out.println("total = " + total);
    }
}
