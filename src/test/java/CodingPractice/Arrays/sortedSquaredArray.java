package CodingPractice.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sortedSquaredArray {
    public static void main(String[] args) {

        int[]ars = {-7,-4,-2,0,2,4,6,9};
        System.out.println(Arrays.toString(sortedSquared(ars)));
    }

    public static int[] sortedSquared(int[]arr){

        int[]arrSquared = new int[arr.length];
        int left =0;
        int right = arr.length-1;

        for(int i=arr.length-1;i>0;i--){
            if(Math.abs(arr[left])>arr[right]){
                arrSquared[i]=arr[left]*arr[left];
                left++;
            }else{
                arrSquared[i]=arr[right]*arr[right];
                right--;
            }
        }
        return arrSquared;
    }
}
