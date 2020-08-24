package CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheUnique {
    public static void main(String[] args) {
        String team = "AAABBBCCCDEFD";
        Map<Character,Integer>uniq = new HashMap<>();
        for(char ch : team.toCharArray()){
            uniq.put(ch,uniq.getOrDefault(ch,0)+1);
        }
        String s = "";
        for(char ch : team.toCharArray()){
            if(uniq.get(ch)==1){
              s+=ch;
            }

        }
        System.out.println("s = " + s);

    }
}
