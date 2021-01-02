package CodingPractice.FizzBuzz;

import java.util.List;
import java.util.Random;
import java.util.stream.*;
import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
       // fizzbuzz(19);
        Random rn = new Random();
       // System.out.println("rn.nextInt(100) = " + rn.nextInt(100));
        IntStream ints = rn.ints(10,0,11);
        List<Integer> collect = ints.filter(x -> x > 7).boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
    private static void fizzbuzz (int number){
        for (int i=0;i<number;i++ ){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
