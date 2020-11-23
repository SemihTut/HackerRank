package CodingPractice.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range_RangeClosed {

    public static void main(String[] args) {
        System.out.println("ranged(2,10) = " + ranged(2, 10));
        System.out.println(isPrime(7));

    }
    public static List<Integer> ranged(int start,int end){
       return IntStream.range(start, end)
                .filter(i -> i % 2 != 0).boxed()
               .collect(Collectors.toList());

    }
    public static boolean isPrime(int number){

        return number>1 && IntStream.rangeClosed(2,number/2).noneMatch(i->number%i==0);

    }


}
