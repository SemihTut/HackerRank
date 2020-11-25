package CodingPractice.String;

import java.util.*;


public class FindWords {

    public static void main(String[] args) {
        String given = "AHKLSISALSKFLSALIIRIES ASLISEMIHGSTRYUUUUTTTTWWQQQQEEEE";
        String expected = "SETU";
        System.out.println(howManystr(expected, given));

    }
    public static Integer howManystr(String str,String givens){
        char[] chars = str.toUpperCase().toCharArray();
        Map<Character,Integer>freq = new HashMap<>();
        for(Character c : givens.toUpperCase().toCharArray()){
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
