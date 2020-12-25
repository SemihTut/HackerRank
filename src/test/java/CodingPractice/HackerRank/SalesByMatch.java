package CodingPractice.HackerRank;
import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {
       int []ars = {10,20,20,10,10,30,50,10,20};
        System.out.println(salesByMatch(9, ars));
    }
    private static int salesByMatch(int n, int[]arr){
        Map<Integer,Integer>freq = new HashMap<>();
        for(Integer a : arr){
            freq.merge(a,1,Integer::sum);
        }
        int count = 0;
        for(Integer b:freq.keySet()){
            count +=freq.get(b)/2;
        }
        return count;
    }
}
