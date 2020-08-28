package CodingPractice.Numbers;

import java.util.ArrayList;
import java.util.List;

public class FINRA {

    //Write a method which prints out the numbers from
    // 1 to 30 but for numbers which are a multiple of 3,
    // print "FIN" instead of the number and for numbers which
    // are a multiple of 5, print "RA" instead of the number.
    // for numbers which are a multiple of both 3 and 5,
    // print "FINRA" instead of the number.
    public static void main(String[] args) {

        String result="";

        for(int i=1;i<30;i++){

            result+= (i%3==0&&i%5==0)?"FINRA":(i%3==0)?"FIN":(i%5==0)?"RA":i+"";
        }

        System.out.println("result = " + result);
    }

}
