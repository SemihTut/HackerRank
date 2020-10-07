package CodingPractice.Stream;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> listTeam = Arrays.asList("Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Helsinki",
                "Istanbul","Ankara","Izmir","Helsinki","Espoo","Izmir","Bolu","Rome","Turku","Bolu");

        System.out.println("No repeated items "+singleOnes(listTeam));
        System.out.println("Only 1 item "+ onlyOnce(listTeam));
        System.out.println("More Than Once "+ moreThanOnce(listTeam));

    }
    public static List<String> singleOnes(List<String>list){

        return list.stream().distinct().collect(toList());

    }

    public static List<String> onlyOnce(List<String>list){

        return list.stream().collect(groupingBy(city->city,counting()))
                .entrySet().stream().filter(city->city.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(toList());

    }
    public static List<String> moreThanOnce(List<String>list){

        return list.stream().collect(groupingBy(city->city,counting()))
                .entrySet().stream().filter(city->city.getValue()!=1)
                .map(Map.Entry::getKey)
                .collect(toList());

    }
}
