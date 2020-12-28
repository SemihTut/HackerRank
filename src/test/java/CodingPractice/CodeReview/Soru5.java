package CodingPractice.CodeReview;

public class Soru5 {
    public static void main(String[] args) {
        int[]arr ={1,4,2,7,3,5,-2,3,1,2};
        System.out.println(smallest(arr));
        int number =15;
        int start =0;
        int last = arr.length-1;



    }
    private static int smallest(int[]arr){
        int input =0;
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<small){
                small=arr[i];
                input =i;
            }
        }
        return input;
    }
}
