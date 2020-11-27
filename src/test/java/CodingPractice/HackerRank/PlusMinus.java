package CodingPractice.HackerRank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlusMinus {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,1,4,0,-1};
        plusMinus(arr);

    }
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive=0;
        int negative =0;
        int zero =0;
        int size =arr.length;

        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]>0){
                positive++;
            }else{
                negative++;
            }
        }
        float p = (float) positive/size;
        float n = (float)negative/size;
        float z = (float)zero/size;
        System.out.format("%.6f %n", p);
        System.out.format("%.6f %n" , n);
        System.out.format("%.6f %n" , z);

    }

}
