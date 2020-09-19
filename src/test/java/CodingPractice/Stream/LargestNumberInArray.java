package CodingPractice.Stream;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,145,90};
        System.out.println(largestNum(arr));
    }
    public static int largestNum(int[]arr){

        return Arrays.stream(arr).max().getAsInt();
    }

}
