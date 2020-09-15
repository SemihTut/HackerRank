package CodingPractice.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUnique {
    public static void main(String[] args) {

        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki");
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

        List<String> frequencyWords = listTeam.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
                .stream().filter(a -> a.getValue() != 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("frequencyWords = " + frequencyWords);

    }
}
