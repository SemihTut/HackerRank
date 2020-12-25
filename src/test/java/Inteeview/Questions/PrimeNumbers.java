package Inteeview.Questions;

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("prList(10) = " + prList(119));

    }
    private static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    private static List<Integer>prList(int n){
        List<Integer> primeList=new ArrayList<>();
        if(n>=2){
           primeList.add(2);
        }
        for(int i=3;i<n;i+=2){
            if(isPrime(i)){
                primeList.add(i);
            }
        }
        return primeList;
    }

}
