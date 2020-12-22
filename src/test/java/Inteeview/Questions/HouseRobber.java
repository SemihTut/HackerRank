package Inteeview.Questions;

public class HouseRobber {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1};
        System.out.println("rob(arr) = " + rob(arr));
    }
    private static int rob(int[]arr){
        int evenHouse = 0;
        int oddHouse = 0;
        for(int i=0;i<arr.length;i++){

            if(i%2==0){
                evenHouse+=arr[i];
            }else{
                oddHouse+=arr[i];
            }
        }
        return Math.max(evenHouse,oddHouse);
    }
}
