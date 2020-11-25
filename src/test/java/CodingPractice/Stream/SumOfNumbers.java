package CodingPractice.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SumOfNumbers {
    public static void main(String[] args) {
        int[]number = new int[]{17,11,0,23,9};
        //1st way = Java 8 Stream
        int leftOfZeroSum = IntStream.range(0, indexOfZero(number)).map(x -> number[x]).sum();
        int rightOfZeroSum = IntStream.range(indexOfZero(number),number.length).map(x -> number[x]).sum();

        //2nd way
        //array icinde ki butun sayilari toplamanin kisa yollarindan bir tanesi
        int sumTotal = Arrays.stream(number).sum();
        int sumLeft=0;
        int i=0;
        // 0 a kadar olan sayilari topla
        while (!(number[i]==0)){
            sumLeft+=number[i];
            i++;
        }
        int sumRight=sumTotal-sumLeft;

    }
    //we need to find the index number of 0
    public static int indexOfZero(int[]numbers){
        List<Integer> collect = IntStream.range(0, numbers.length)
                .filter(x -> numbers[x] == 0).boxed().collect(Collectors.toList());
        return collect.get(0);
    }


}
