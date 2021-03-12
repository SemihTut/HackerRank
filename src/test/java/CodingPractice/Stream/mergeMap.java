package CodingPractice.Stream;

import java.util.*;
import java.util.stream.Collectors;


public class mergeMap {
    public static void main(String[] args) {

        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki",
                "Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Rome","Turku","Bolu");

        String str = "qwåeprkeprgköasfaslfömsöglmäaösäömgaä";
        System.out.println("convertMyStringToList(str) = " + convertMyStringToList(str));
      // System.out.println("convertItMap(listTeam) = " + convertItMap(listTeam));
        Map<Object, Long> k = listTeam.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println("k = " + k);


    }

    public static Map<String,Integer> convertItMap(List<String>list){
        Map<String,Integer> myMap = new HashMap<>();
        for(String city:list){
            myMap.merge(city,1,Integer::sum);
        }
        return myMap;
    }

    public static List<String> convertMyStringToList(String str){
        Map<String,Integer> myMap = new HashMap<>();
        List<String>myList = new ArrayList<>();  //OOP Concept polymorphism
        String[] arr = str.split("");
        for(String letter : arr){
            myMap.merge(letter,1,Integer::sum);
        }

        for(String a : myMap.keySet()){
            if(myMap.get(a)==1){
               myList.add(a);
            }
        }
        return myList;
    }
}
