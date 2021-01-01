package CodingPractice.FizzBuzz;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        fizzbuzz(19);
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
