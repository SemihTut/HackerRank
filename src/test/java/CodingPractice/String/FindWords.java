package CodingPractice.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindWords {

    public static void main(String[] args) {
        String given = "AHKLSISALSKFLSALIIRIES ASLISEMIHGSTRY";
        String expected = "GALATASARAY";
        System.out.println(howManystr(expected, given));


    }
    public static Integer howManystr(String str,String givens){
        char[] chars = str.toCharArray();
        Map<Character,Integer>freq = new HashMap<>();
        for(Character c : givens.toCharArray()){
            freq.merge(c,1,Integer::sum);
        }
        int min = Integer.MAX_VALUE;
        try {
            for(Character c : chars){
                min=freq.get(c)<min?freq.get(c):min;
            }
        } catch (Exception e) {
            min =0;
        }
        return min;
    }

}
