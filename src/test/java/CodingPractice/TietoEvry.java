package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class TietoEvry {
    public static void main(String[] args) {

      String str = "Selenium";
        System.out.println(count(str, "S"));

    }
    public static int count(String str, String wanted){
        Map<String,Integer> freq = new HashMap<>();
        for(String a : str.split("")){
            freq.merge(a,1,Integer::sum);
        }
        return freq.get(wanted);

    }

    public static int count2(String str, String wanted){
        Map<String,Integer> freq = new HashMap<>();
        for(String a : str.split("")){
            freq.merge(a,1,Integer::sum);
        }
        return freq.get(wanted);

    }

    public static int count3(String str, String wanted){
        Map<String,Integer> freq = new HashMap<>();
        for(String a : str.split("")){
            freq.merge(a,1,Integer::sum);
        }
        return freq.get(wanted);

    }
}
