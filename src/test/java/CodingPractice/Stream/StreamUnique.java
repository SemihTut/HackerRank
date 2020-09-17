package CodingPractice.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUnique {
    public static void main(String[] args) {

        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki",
                "Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Rome","Turku","Bolu");
        List<String> unique = listTeam.stream()
                .distinct().collect(Collectors.toList());//A,B,C,D,E,F
        System.out.println("unique = " + unique);

        List<String> collect = listTeam.stream()
                .map(String::toUpperCase)
                // Build a map from word -> frequency
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                // stream the frequency map entries
                .entrySet().stream()
                // filter to retain unique words (with frequency == 1)
                .filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("entryStream = " + collect);

        List<StringBuilder> collectReverse = listTeam.stream().map(StringBuilder::new)
                .map(StringBuilder::reverse).collect(Collectors.toList());
        System.out.println("collectReverse = " + collectReverse);

        List<String> frequencyWords = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream().filter(a -> a.getValue() != 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("frequencyWords = " + frequencyWords);
        System.out.println("----------------------------");
        Map<String, Long> collect1 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("collect1.keySet() = " + collect1.keySet());
        System.out.println("collect1 = " + collect1);
        Map<String, Long> collect2 = listTeam.stream().collect(Collectors.groupingBy(s -> s.substring(0,3), Collectors.counting()));
        System.out.println("collect2 = " + collect2);
        System.out.println("----------------------------");
        Map<String, Long> stringLongMap = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        LinkedHashMap<String, Long> collect3 = stringLongMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("collect3 = " + collect3);
        String key = collect3.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("key = " + key);
        System.out.println("----------------------");
        String key1 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().max((a1, a2) -> a1.getValue() > a2.getValue() ? 1 : -1).get().getKey();
        System.out.println("key1 = " + key1);

        //SECOND WAY TO FIND KEY THAT IS THE BIGGEST VALUE
        String key2 = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue))
                .get().getKey();
        System.out.println("min = " + key2);


        listTeam.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))

                .entrySet().stream().filter(a -> a.getValue()!=1)
                ;


    }
}

