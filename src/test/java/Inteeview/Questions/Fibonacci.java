package Inteeview.Questions;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21 34
        System.out.println("fibonacciNumber(2) = " + fibonacciNumber(5));
        System.out.println("listOfFibonacci(3,7) = " + listOfFibonacci(2, 7));
    }
    private static int fibonacciNumber(int n){
        if(n<2) return n;
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
    private static List<Integer>listOfFibonacci(int start, int end){
        List<Integer>fibList = new ArrayList<>();
        for(int i = start; i<=end; i++){

            fibList.add(fibonacciNumber(i-1)+fibonacciNumber(i-2));
        }
        return fibList;
    }
}
