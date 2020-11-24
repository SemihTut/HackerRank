package CodingPractice.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SumOfNumbers {
    public static void main(String[] args) {
        int[]number = new int[]{17,11,0,23,9,89,3,215,11,78};
       //Java 8 Stream
        int leftOfZeroSum = IntStream.range(0, indexOfZero(number)).map(x -> number[x]).sum();
        int rightOfZeroSum = IntStream.range(indexOfZero(number),number.length).map(x -> number[x]).sum();
        System.out.println("leftOfZeroSum = " + leftOfZeroSum);
        System.out.println("rightOfZeroSum = " + rightOfZeroSum);
    }
    public static int indexOfZero(int[]numbers){
        List<Integer> collect = IntStream.range(0, numbers.length)
                .filter(x -> numbers[x] == 0).boxed().collect(Collectors.toList());
        return collect.get(0);
    }


}
