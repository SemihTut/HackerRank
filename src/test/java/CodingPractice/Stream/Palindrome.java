package CodingPractice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("adanada"));

    }
    public static boolean isPalindrome(String str){
        String temp = str.replaceAll("\\s+","").toLowerCase();
        return IntStream.rangeClosed(0,temp.length()/2)
                .noneMatch(i->temp.charAt(i) != temp.charAt(temp.length()-1-i));

    }


}
