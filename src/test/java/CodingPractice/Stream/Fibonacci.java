package CodingPractice.Stream;

import org.jsoup.select.Collector;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(5));
        System.out.println(getFibonacci2(5));

    }
    public static List<Integer>getFibonacci(int series){

        return Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(x -> x[0]).collect(Collectors.toList());

    }

    public static long getFibonacci2(int series){
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(x -> x[0]).mapToInt(x->x).sum();

    }

}
