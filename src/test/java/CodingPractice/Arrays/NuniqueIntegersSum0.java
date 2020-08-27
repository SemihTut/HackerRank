package CodingPractice.Arrays;

import java.util.Arrays;

public class NuniqueIntegersSum0 {

    public static void main(String[] args) {
        System.out.println("SumUpToZero(7) = " + Arrays.toString(SumUpToZero(7)));

    }
    public static int[] SumUpToZero(int n){

        int[]result = new int[n];
        int sum=0;

        for(int i=0; i<n-1; i++){
            result[i]=i;
            sum+=i;
        }
        result[n-1]=-sum;
        return result;
    }
}
