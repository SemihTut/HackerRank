package CodingPractice.Arrays;

import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int[]as={2,5,6,98,12,0};
        System.out.println(min(as)+" max ="+max(as));

    }
    public static int max (int[] arr){

        Arrays.sort(arr);
        return arr[arr.length-1];

    }
    public static int min (int[] arr){

        Arrays.sort(arr);
        return arr[0];

    }
}
