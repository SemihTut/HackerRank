package CodingPractice.Arrays;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int[]examp = {2,0,3,4,0,0,5,100,0,45};
        System.out.println(Arrays.toString(movingRight(examp)));
    }
    public static int[]movingRight(int[]given){
        int first =0;
        int last = given.length-1;
        while(first<last){
            if(given[first]!=0 && given[last]!=0){
                first++;
            }else if(given[first]==0 && given[last]!=0){
                int temp = given[last];
                given[last] = given[first];
                given[first] = temp;
                last--;
                first++;
            }else{
                last--;
                first++;
            }
        }
        return given;
    }
}
