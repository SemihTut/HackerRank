package CodingPractice.Stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

public class PinCode {

    public static void main(String[] args) {
        long[]alp=new long[]{2,4,0,4,1,9,8,9};
        long[]samet=new long[]{2,3,1,0,1,9,8,6};
        long[]yusuf=new long[]{0,1,1,0,1,9,8,9};

      long[]abim = new long[]{0,5,0,8,1,9,7,9};
        System.out.println("Alp's pin code analyze " + pinCalculator(alp));
        System.out.println("Samet's pin code analyze "+ pinCalculator(samet));
        System.out.println("Yusuf's pin code analyze "+ pinCalculator(yusuf));

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
