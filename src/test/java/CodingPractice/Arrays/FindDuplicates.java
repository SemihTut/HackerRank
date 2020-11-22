package CodingPractice.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,3,45,3,67,34,2,3,45));
        Map<Integer,Integer> quantity = new HashMap<>();
        //first way merge and for each
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

        //second way using stream
        List<Integer> collect = quantity.entrySet().stream()
                .filter(x -> x.getValue() != 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);


    }
}
