package CodingPractice.Stream;


import java.util.Arrays;

;
import java.util.stream.IntStream;


public class SumOfNumbers {
    public static void main(String[] args) {
        int[]number = new int[]{17,11,0,23,9,89,3,215,11,78};

        int totalSum = Arrays.stream(number).sum();
        int leftOfZeroSum = 0;
        for(int i=0;i<indexOfZero(number);i++){
            leftOfZeroSum+=number[i];
        }
        System.out.println("0'in solundaki sayilarin toplami = " + leftOfZeroSum);
        int rightOfZero = totalSum-leftOfZeroSum;
        System.out.println("0'in sagindaki sayilarin toplami = " + rightOfZero);

    }
    public static int indexOfZero(int[]numbers){
        int index=0;
        for(int i=0;i<numbers.length;i++){
            index+=(numbers[i]==0)?i:0;
        }
        return index;
    }

}
