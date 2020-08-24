package CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfChars {
    public static void main(String[] args) {
        //FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        String name = "galatsaray";
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
}
