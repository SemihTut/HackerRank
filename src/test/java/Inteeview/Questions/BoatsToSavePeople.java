package Inteeview.Questions;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[]arr ={2,1};
        System.out.println(numberRescueBoat(arr, 3));
    }
    private static int numberRescueBoat(int[]people,int limit){
        Arrays.sort(people);
        int first =0;
        int last = people.length-1;
        int count=0;
        while(last>=first){
            if(people[first]+people[last]>limit){
               last--;
            }else{
                last--;
                first++;
            }
            count++;
        }
        return count;
    }
}
