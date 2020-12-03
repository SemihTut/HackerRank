package CodingPractice.HackerRank;

import java.util.Arrays;

public class BreakingRecords {
    public static void main(String[] args) {
        int[]arr = new int[]{3,4,21,36,10,28,35,5,24,42};
        System.out.println("breakingRecords(arr) = " + Arrays.toString(breakingRecords(arr)));
    }

    public static int[] breakingRecords(int[] scores) {
        int recordMin = 0;
        int recordMax = 0;
        int maxPoint= scores[0];
        int minPoint = scores[0];
        for(int i=1;i<scores.length;i++){

           if(scores[i]>maxPoint){
               maxPoint=scores[i];
               recordMax++;
           }else if(scores[i]<minPoint){
               minPoint=scores[i];
               recordMin++;
           }
        }

       return new int[]{recordMax,recordMin};
    }
}
