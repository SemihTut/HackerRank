package Inteeview.Questions;
import java.time.Duration;
import java.time.Instant;
import java.util.*;


public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[]arr = {4,2,1,3,9,7,8};
        System.out.println(minAbsDif(arr));

    }
    private static List<List<Integer>> minAbsDif(int[]arr){
       // Instant start = Instant.now();
        List<List<Integer>>resultList = new LinkedList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min(arr[i]-arr[i-1],min);
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                resultList.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
       // Instant end = Instant.now();
        //Duration elapsedTime = Duration.between(start,end);
        return resultList;
    }
}
