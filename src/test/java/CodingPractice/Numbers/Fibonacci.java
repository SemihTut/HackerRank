package CodingPractice.Numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("fib(5) = " + fib(6));
        System.out.println("fibonacciList(7) = " + fibonacciList(6));
        System.out.println("fibonacciSumStream(6) = " + fibonacciSumStream(6));
    }
    public static int fib(int n){

        return n<2?n:fib(n-1)+fib(n-2);
    }
    public static List<Integer> fibonacciList(int n){
        return Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(n).map(x->x[0])
                .collect(Collectors.toList());

    }
    public static int fibonacciSumStream(int limit){

        return Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(limit)
                .map(x->x[0]).mapToInt(Integer::intValue).sum();
    }
}
