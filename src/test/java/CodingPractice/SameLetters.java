package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(isSame("abc","abb"));


    }

    public static boolean isSame(String first, String second){

        Map<Character,Integer> freqFirst = new HashMap<>();
        Map<Character,Integer> freqSecond = new HashMap<>();

        for(char ch : first.toCharArray()){
            freqFirst.put(ch,freqFirst.getOrDefault(ch,0)+1);
        }
        for(char ch : second.toCharArray()){
            freqSecond.put(ch,freqSecond.getOrDefault(ch,0)+1);
        }

        return freqFirst.keySet().equals(freqSecond.keySet());
    }
}
