package CodingPractice.HackerRank;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int[]arr = new int[]{1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(6, 3, arr));
    }
    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    if((ar[i]+ar[j])%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
