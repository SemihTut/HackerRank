package CodingPractice.Stream;

import org.jsoup.select.Collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
      /*  System.out.println(getFibonacci(10));
        System.out.println(getFibonacci2(5));
        System.out.println("fib(3) = " + fib(7));
        System.out.println(isFibonacci(14));
        System.out.println("isFibo(5) = " + isFibo(3));
        System.out.println("getFibonacci(3) = " + getFibonacci(3));
        System.out.println("fib(6) = " + fib(6));
        System.out.println("--------------FIBONACCI----------------");
        System.out.println("fib(1) = " + fib(1));
        System.out.println("fib(2) = " + fib(2));
        System.out.println("fib(3) = " + fib(3));
        System.out.println("fib(4) = " + fib(4));
        System.out.println("fib(5) = " + fib(5));*/
       // System.out.println("isFibo(5) = " + isFibo(5));
       // System.out.println("myNumber(15) = " + myNumber(5));
        myList(5);


    }

    /**
     *
     * @param series
     * @return
     */
    public static List<Integer>getFibonacci(int series){

        return Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(x -> x[0]).collect(Collectors.toList());

    }

    /**
     *
     * @param series
     * @return
     */

    public static long getFibonacci2(int series){
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(x -> x[0]).mapToInt(x->x).sum();

    }

    /**
     *
     * @param series
     * @return
     */
    public static List<Integer>getFibonacci3(int series){

        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(series)
                .map(x->x[0]).collect(Collectors.toList());

    }

    /**
     *
     * @param number
     * @return
     */
    public static boolean isFibo(int number){
        return Stream.iterate(new int []{0,1},t ->new int[]{t[0],t[0]+t[1]})
                .limit(number+1)
                .map(x->x[0]).collect(Collectors.toList()).contains(number);
    }



    public static int fib(int n){

        return n<2?n:fib(n-1)+fib(n-2);
    }

    /**
     *
     * @param number stream iterate new int []{0,1},t -> new int[]{t[1],t[0]+t[1]}
     * @return
     */
    private static boolean isFibonacci(int number){
        return Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[1]+t[0]})
                .limit(number+1).map(x->x[0])
                .collect(Collectors.toList()).contains(number);
    }

    public static boolean ehliyetYasi(int yas){
        return yas>18;
    }

    public static void ehliyetYasi2(int yas){
        System.out.println(yas>18?"Alabilir":"Alamaz");
    }

    public static int myNumber(int number){
        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(number)
                .map(x -> x[0])
                .collect(Collectors.toList());
        return collect.get(collect.size()-1);

    }

    /**
     *
     * @param number
     * @return
     */
    public static boolean isFibon(int number){
        return Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(number+1)
                .map(x->x[0])
                .collect(Collectors.toList()).contains(number);
    }

    /**
     *
     * @param number
     */
    public static void myList(int number){

        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(number)
                .map(x -> x[0])
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}


