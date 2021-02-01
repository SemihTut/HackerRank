package CodingPractice;

import java.util.stream.IntStream;

public class freeTimeStudy {

    public static void main(String[] args) {
        System.out.println("robob = " + isPalindrome("ey edip adanada pide ye"));
    }

    public static boolean isPalindrome(String str){

        String updated = str.replaceAll("\\s","").toLowerCase();

        return IntStream.rangeClosed(0,updated.length()/2)
                .noneMatch(i->updated.charAt(i)!=updated.charAt(updated.length()-1-i));

        // str.replaceAll("\\s,"").toLowerCase();

    }
}
