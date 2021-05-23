package Regex;

import java.util.regex.Pattern;

public class SubstringIsPresent {
    public static void main(String[] args) {

        System.out.println("asa " + isPresent("galatasaray", "asa"));
    }

    public static boolean isPresent(String str, String subString){
        return Pattern.compile("(.*)"+subString+"(.*)").matcher(str).find();

    }
    public static boolean isIndex(String str, String subString){
        return str.indexOf(subString)!=-1;

    }
}
