package CodingPractice.CodeReview;

import java.util.Arrays;
import java.util.stream.Stream;

public class Soru5 {
    public static void main(String[] args) {
        int[]arr = {1,23,43,56,2,5,8};
        int[]arrNew = new int[arr.length];
        int first = 0;
        int last = arr.length - 1;

        for(int i = 0;i<arr.length;i++){
            if(twoDigits(arr[i])){
                arrNew[last]=arr[i];
                last--;
            }else{
                arrNew[first]=arr[i];
                first++;
            }
        }
        for(int a :arrNew){
            System.out.print(a+" ");
        }

    }
    public static boolean twoDigits(int n) {
        return n/10!=0;
    }
}
