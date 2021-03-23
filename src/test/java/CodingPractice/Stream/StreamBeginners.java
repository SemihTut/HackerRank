package CodingPractice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBeginners {
    public static void main(String[] args) {

        //Streams can be created from different element sources
        // e.g. collection or array with the help of stream() and of() methods:
        String [] arr = new String[]{"a","b","c","e","d"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> Stream2 = Stream.of("a", "b", "c");

        //Multi-threading with streams
        List<Integer>numbers = new ArrayList<>(Arrays.asList(2,3,4,4));
        numbers.parallelStream().forEach(StreamBeginners::addNumber);

        System.out.println("distinct() = " + numbers.stream().distinct().collect(Collectors.toList()));

        boolean b = numbers.stream().anyMatch(number -> number.equals(2));
        boolean c = numbers.stream().noneMatch(number -> number.equals(5));
        System.out.println("b = " + b+" " +c);

        int reduce = IntStream.range(1, 9).reduce(0,Integer::sum);
        System.out.println("reduce = " + reduce);

        System.out.println(stream.sorted().collect(Collectors.toList()));
    }
    public static int addNumber(int a){
        return a+1;
    }
}
