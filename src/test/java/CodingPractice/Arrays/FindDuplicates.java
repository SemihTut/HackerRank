package CodingPractice.Arrays;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

        String sss = "aabbasdrtutnmsfasvddfhmbasdcacstnfscsdf";
        freq(sss);
       // System.out.println("newOne(sss) = " + newOne(sss));
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 45, 3, 67, 34, 2, 3, 45, 67, 9876));
        Map<Integer, Integer> quantity = new HashMap<>();
        //first way merge and for each
        for (Integer a : arr) {
            quantity.merge(a, 1, Integer::sum);
        }
        System.out.println(quantity);
        List<Integer> end = new ArrayList<>();
        List<Integer> end2 = new ArrayList<>();

        for (Integer i : quantity.keySet()) {
            (quantity.get(i) > 1 ? end : end2).add(i);
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

    public static String newOne(String str) {
        String[] myList = str.split("");
        StringBuilder result = new StringBuilder();
        for (String s : myList) {
            int quant = quantity(str, s);
            if (!result.toString().contains(s)) {
                result.append(quant).append(s);
            }
        }
        return result.toString();

    }

    public static int quantity(String str, String c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c.charAt(0))
                count++;
        }
        return count;
    }


    public static void freq(String str){
        List<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> quantity = new HashMap<>();
        for(String s : arr){
            quantity.merge(s,1,Integer::sum);
        }
        StringBuilder asd= new StringBuilder();
        for(String s : quantity.keySet()){
            asd.append(String.valueOf(quantity.get(s))).append(s);
        }
        System.out.println("asd = " + asd.toString());
    }
}
