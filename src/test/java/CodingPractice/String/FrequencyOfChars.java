package CodingPractice.String;

import java.util.*;

public class FrequencyOfChars {
    public static void main(String[] args) {
        //FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        String name = "galatsarayy";
        System.out.println("frequency(name) = " + frequency(name));
        System.out.println("frequencyOfUnique(name) = " + frequencyOfUnique(name));
        String result="";
        Map<Character,Integer>freq = new HashMap<>();
        for(char i : name.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        System.out.println("freq = " + freq);
        freq.get('s').toString();
        Set<Character> characters = freq.keySet();
        for(char ch : characters){
            result+=ch+freq.get(ch).toString();
        }
        System.out.println("result = " + result);
    }

    public static Map<Character,Integer> frequency(String str){
        Map<Character, Integer> freqs = new HashMap<>();
        for(char c : str.toCharArray()){
            freqs.merge(c,1,Integer::sum);
        }
        return freqs;
    }

    public static List<Character> frequencyOfUnique(String str){
        List<Character> end = new ArrayList<>();
        List<Character> end2 = new ArrayList<>();
        Map<Character, Integer> freqs = new HashMap<>();
        for(char c : str.toCharArray()){
            freqs.merge(c,1,Integer::sum);
        }

        for(char c : freqs.keySet()){

            if (freqs.get(c) == 1) {
                end.add(c);
            } else {
                end2.add(c);
            }
        }
        return end;
    }
}
