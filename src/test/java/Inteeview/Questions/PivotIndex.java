package Inteeview.Questions;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PivotIndex {
    public static void main(String[] args) {
        int[]arr = {1,3,4,5,2,6};
        System.out.println("pivotIndex(arr) = " + pivotIndex(arr));


    }
    public static int pivotIndex(int[]arr){
        Instant start = Instant.now();
        int sumTotal = Arrays.stream(arr).sum();
        int leftTotal=0;
        int result=0;
        for(int i=0;i<arr.length-1;i++){
            if(i!=0){
                leftTotal+=arr[i-1];
            }
            if(leftTotal==sumTotal-leftTotal-arr[i]){
                result=i;
            }
        }
        Instant end = Instant.now();
        Duration elapsedTime = Duration.between(start,end);
        System.out.println("elapsedTime = " + elapsedTime);
        return result;
    }
}
