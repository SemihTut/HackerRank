package CodingPractice.Stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class PinCode {

    public static void main(String[] args) {
      long[]birthDate=new long[]{2,6,0,4,1,9,8,5};
        System.out.println(pinCalculator(birthDate));

    }

    public static int pinCalculator(long[] birthDate){

       int [] pinAnalyze = new int[8];
       pinAnalyze[0] = (int) twoDigits(birthDate[0]+birthDate[1]);
       pinAnalyze[1] = (int) twoDigits(birthDate[2]+birthDate[3]);
       pinAnalyze[2] = (int) twoDigits(birthDate[4]+birthDate[5]+birthDate[6]+birthDate[7]);
       pinAnalyze[3] = (int) twoDigits(pinAnalyze[0]+pinAnalyze[1]+pinAnalyze[2]);
       pinAnalyze[4] = (int) twoDigits(pinAnalyze[0]+pinAnalyze[3]);
       pinAnalyze[5] = (int) twoDigits(pinAnalyze[0]+pinAnalyze[4]);
       pinAnalyze[6] = (int) twoDigits(pinAnalyze[1]+pinAnalyze[2]);
       pinAnalyze[7] = (int) twoDigits(pinAnalyze[5]+pinAnalyze[6]);
        int sum = Arrays.stream(pinAnalyze).sum();
        return (int) twoDigits(sum);

    }
    public static long twoDigits(long number){

        return number <= 10 ? number : (number%10)+(number/10);
    }
}
