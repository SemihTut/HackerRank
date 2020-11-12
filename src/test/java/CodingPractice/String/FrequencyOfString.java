package CodingPractice.String;

import java.util.*;

public class FrequencyOfString {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Semih","Yahya","Hulya","Asli","Ahmet","Yahya","Ahmet"));
        System.out.println("freq(names) = " + freq(names));

    }


    public static Map<String,Integer> freq(List<String> name){
        Map<String,Integer> nameAndFreq = new HashMap<>();
        for (String s : name){
            nameAndFreq.merge(s,1,Integer::sum);
        }
        return nameAndFreq;
    }

    public static Map<String,Integer> freq2(List<String> name){
        Map<String,Integer> nameAndFreq = new HashMap<>();
        for (String s : name){
            nameAndFreq.merge(s,1,Integer::sum);
        }
        nameAndFreq.entrySet().stream()
                .filter()
    }

}
