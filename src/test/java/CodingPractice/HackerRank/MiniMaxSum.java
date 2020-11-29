package CodingPractice.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MiniMaxSum {
    public static void main(String[] args) {

        int sum[]=new int[]{1,2,3,4,5};
        miniMaxSum(sum);
    }
    static void miniMaxSum2(int[] arr) {
        int sum= Arrays.stream(arr).sum();
        int min = Arrays.stream(arr).sorted().findFirst().getAsInt();
        int max = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList()).get(arr.length - 1);
        System.out.println((sum-max)+" "+(sum-min));

    }
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0, max = 0;
        for(int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--){
            max = max + arr[j];
            min = min + arr[i];
        }
        System.out.println(min + " " + max);
    }
}
