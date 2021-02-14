package CodingPractice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("adanada"));
        System.out.println("isPalindrome(24425) = " + isPalindrome(24425));

    }

    public static boolean isPalindrome(String str) {
        String temp = str.replaceAll("\\s+", "").toLowerCase();

        // IntStream.rangeClosed(0,temp.length()/2)
        //   .noneMatch(i->temp.charAt(i) != temp.charAt(temp.length()-1-i));
        return IntStream.rangeClosed(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - 1 - i));


    }

    public static boolean isPalindrome(int str) {//2442
        int myLocalNumber = str;
        int newNumber = 0;
        while (myLocalNumber > 0) {
            int lastDigit = myLocalNumber % 10;
            myLocalNumber = myLocalNumber / 10;
            newNumber = newNumber * 10 + lastDigit;
        }
        return newNumber == str;

    }


}
