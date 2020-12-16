package Regex.TimBuchalka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueItems {

    public static void main(String[] args) {

        String str = "AASSDFGHJJHGFSRTYYTREWWQI1";
        Map<Character,Integer>freq = new HashMap<>();
        String str2 ="";
        for(char a : str.toCharArray()){
            freq.merge(a,1,Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        for(char a :freq.keySet()){
            sb.append(a).append(freq.get(a));
        }
        System.out.println("sb = " + sb.toString());
    }
}
