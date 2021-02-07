package CodingPractice;

import java.util.*;
import java.util.stream.IntStream;

public class freeTimeStudy {

    public static void main(String[] args) {
        System.out.println("robob = " + isPalindrome("ey edip adanada pide ye"));
        System.out.println(compareStrings("abcde", "bcdef"));
    }

    public static boolean isPalindrome(String str){

        String updated = str.replaceAll("\\s","").toLowerCase();

        return IntStream.rangeClosed(0,updated.length()/2)
                .noneMatch(i->updated.charAt(i)!=updated.charAt(updated.length()-1-i));

        // str.replaceAll("\\s,"").toLowerCase();
        // str.replaceAll("\\s,"").toLowerCase();

    }

    public static double compareStrings(String first, String second){
        List<String>firstOne = new ArrayList<>(Arrays.asList(first.split("")));
        List<String>secondOne = new ArrayList<>(Arrays.asList(second.split("")));
        double size = firstOne.size();
        for(String a : firstOne){
            secondOne.remove(a);
        }
        double unique = secondOne.size();
        return unique/size;

    }
}
