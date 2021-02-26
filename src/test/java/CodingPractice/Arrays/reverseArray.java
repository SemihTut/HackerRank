package CodingPractice.Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {


        String str = "Her şey için ";
        String [] myArray = str.split(" ");
        String [] newArray = new String[myArray.length];

        for(int j=0, i =myArray.length-1;i>=0;i--,j++){
           newArray[j]=myArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
