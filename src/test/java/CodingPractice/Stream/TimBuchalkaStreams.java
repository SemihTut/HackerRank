package CodingPractice.Stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TimBuchalkaStreams {
    public static void main(String[] args) {
      //  fibonacciList(10).forEach(System.out::println);

        System.out.println("---------------");
      //  fibonacciList(7).forEach(System.out::println);
       // System.out.println("fibonacciList(13) = " +isFibonacci(14));

        String myString = "Let's 5 split this up into array";
        String[]parts = myString.split(" ");
      //  Arrays.stream(parts).forEach(System.out::println);
        String s1 = myString.replaceAll("\\D", "");
        System.out.println("s1 = " + s1);
        List<String>listArray= Arrays.asList(parts);
        List<String> numbers = listArray.stream().map(s->s.replaceAll("\\D",""))
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);

    }

    public static List<Integer> fibonacciList(int number){

        return Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0]+t[1]})
                .limit(number+1)
                .map(n->n[0])
                .collect(Collectors.toList());
    }

    public static boolean isFibonacci(int number){
        return Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0]+t[1]})
                .limit(number+1)
                .map(n->n[0]).collect(Collectors.toList()).contains(number);
    }
    public static boolean isFibonacci2(int number){
        return Stream.iterate(new int[]{0,1},t -> new int[]{t[1],t[0]+t[1]})
                .limit(number+1)
                .map(n->n[0]).collect(Collectors.toList()).contains(number);
    }

}
