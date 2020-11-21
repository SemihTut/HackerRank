package CodingPractice.Arrays;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,3,45,3,67,34,2,3,45));
        Map<Integer,Integer> quantity = new HashMap<>();
        //first way
        for(Integer a : arr){
            quantity.merge(a,1,Integer::sum);
        }
        System.out.println(quantity);
        List<Integer> end = new ArrayList<>();
        List<Integer> end2 = new ArrayList<>();

        for(Integer i : quantity.keySet()){
            (quantity.get(i)>1?end:end2).add(i);
        }
        System.out.println("end = " + end);
        System.out.println("end2 = " + end2);
    }
}
