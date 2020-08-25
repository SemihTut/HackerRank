package CodingPractice.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("Galatasaray"));

        String team = "galatasaray";
        Map<Character,Integer>myMap = new HashMap<>();

        for(char ch : team.toCharArray()){
            myMap.put(ch,myMap.getOrDefault(ch,0)+1);

        }
        System.out.println("myMap.keySet() = " + myMap.keySet());
        String s = myMap.keySet().toString();

        s=s.replace(",",", ").replace("[","").replace("]","");
        System.out.println("s = " + s);
        String removeDup = "";
        for(char c : myMap.keySet()){
            removeDup+= c;
        }
        System.out.println("removeDup = " + removeDup);
    }

    //second way
    public static String removeDup(String str) {

      //  new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        System.out.println("str = " + str);

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }
}
