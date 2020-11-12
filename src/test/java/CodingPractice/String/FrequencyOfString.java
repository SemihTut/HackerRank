package CodingPractice.String;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyOfString {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Semih","Yahya","Hulya","Asli","Ahmet","Yahya","Ahmet"));
        System.out.println("freq(names) = " + freq(names));
        System.out.println("freq2(names) = " + freq2(names));
        System.out.println("UNIQ = " + uniq(names));

    }


    public static Map<String,Integer> freq(List<String> name){
        Map<String,Integer> nameAndFreq = new HashMap<>();
        for (String s : name){
            nameAndFreq.merge(s,1,Integer::sum);
        }
        return nameAndFreq;
    }

    public static List<String> freq2(List<String> name){
        Map<String,Integer> nameAndFreq = new HashMap<>();
        for (String s : name){
            nameAndFreq.merge(s,1,Integer::sum);
        }
        return nameAndFreq.entrySet().stream()
                .map(x->x.getValue()+x.getKey()).collect(Collectors.toList());
    }
    public static List<String> uniq(List<String> name){
        Map<String,Integer> nameAndFreq = new HashMap<>();
        for (String s : name){
            nameAndFreq.merge(s,1,Integer::sum);
        }
        return nameAndFreq.entrySet().stream()
                .filter(x->x.getValue()==1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

}
