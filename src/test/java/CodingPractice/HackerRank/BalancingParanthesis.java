package CodingPractice.HackerRank;

import java.util.HashMap;
import java.util.Map;

public class BalancingParanthesis {
    public static void main(String[] args) {
        String str = "(())))))))))";
        System.out.println("getMin(str) = " + getMin(str));
        String skil="pcmbzpcmbzpcmbzzzzzz";
        System.out.println("perfectTeam(skil) = " + perfectTeam(skil));
    }
    public static int getMin(String s){

        Map<String,Integer>freq = new HashMap<>();

        for(char c : s.toCharArray()){
            freq.merge(String.valueOf(c),1,Integer::sum);

        }
        return Math.abs(freq.get("(")-freq.get(")"));
    }
    public static int perfectTeam(String skills){
        Map<String,Integer>freq = new HashMap<>();

        for(char c : skills.toCharArray()){
            freq.merge(String.valueOf(c),1,Integer::sum);

        }
        int min = Integer.MAX_VALUE;
        for(String a : freq.keySet()){
            min=freq.get(a)<min?freq.get(a):min;
        }
        return min;
    }
}
