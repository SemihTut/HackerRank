package CodingPractice.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QATestAssignment {
    public static void main(String[] args) {
        /*
        Write a program in python or java which accepts a single list as a parameter.
        This list consists of any number of lists (1..n), and you can assume each list
        only contains words(e..g. [‘apple’, ‘mango’, ‘cherry’...]).
        The program should print out the following:
        -words that appear in more than one list
        -The total number of unique words across all lists
        -Top five frequent words in the all lists
        How would you test this program? Write a test to verify it?

         */

        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki",
                "Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Rome","Turku","Bolu");
        //convert all lists to one list
       // List<String> stringList = lists.stream().flatMap(List::stream).collect(Collectors.toList());

        //unique items
       // List<String> uniqueItems = stringList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
       //         .stream().filter(a -> a.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

        //number of unique items
     //   int size = uniqueItems.size();
     //   System.out.println("size = " + size);

        //repeated items
     //   List<String> repeatedWords = stringList.stream()
     //           .collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
    //            .stream().filter(a -> a.getValue() != 1)
     //           .map(Map.Entry::getKey).collect(Collectors.toList());
    //    System.out.println("repeatedWords = " + repeatedWords);

        System.out.println("words that appear in more than one list");
        LinkedHashMap<String, Long> setu = listTeam.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("setu = " + setu);


        Map<String, Long> stringLongMap = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        LinkedHashMap<String, Long> collect3 = stringLongMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));



    }
}
