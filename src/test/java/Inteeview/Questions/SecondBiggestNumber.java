package Inteeview.Questions;

import java.util.Arrays;
import java.util.List;

public class SecondBiggestNumber {
    public static void main(String[] args) {
            List<Integer>asd = Arrays.asList(1,23,45,678);
        System.out.println("secondBiggest(asd) = " + secondBiggest(asd));
    }
    private static int secondBiggest(List<Integer> liste){
        int sira =0;
        int biggest = Integer.MIN_VALUE;
        for(int i=0; i<liste.size(); i++){
            if(liste.get(i)>biggest){
                biggest=liste.get(i);
                sira=i;
            }
        }
       // liste.remove(liste.indexOf(biggest));

        for(int i=0; i<liste.size(); i++){
            if(liste.get(i)>biggest){
                biggest=liste.get(i);
            }
        }
        return biggest;

    }
}
