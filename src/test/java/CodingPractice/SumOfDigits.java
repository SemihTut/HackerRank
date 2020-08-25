package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sum("as23ty"));

    }

    public static int sum(String str){
        int total=0;
        char[] chars = str.toCharArray();
        for(char ch : chars){
            if(Character.isDigit(ch)){
               total+= Integer.parseInt(""+ch);
            }
        }
        return total;
    }
}
