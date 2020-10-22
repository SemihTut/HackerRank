package Regex;

public class MaskRegex {
    public static void main(String[] args) {
        System.out.println(maskele("sem"));

    }

    public static String maskele(String str)
    {
        return str.replaceAll(".(?=.{4})", "*");
    }
}
