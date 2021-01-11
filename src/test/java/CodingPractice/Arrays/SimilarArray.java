package CodingPractice.Arrays;

import org.apache.commons.lang3.ArrayUtils;


import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class SimilarArray {
    public static void main(String[] args) {
        int[]arr1 = {1111,2222,3333,4444};
        int[]arr2 ={2222,3333,4444,5555};
        Map<Integer,Integer>freq = new HashMap<>();
        int[] merged = ArrayUtils.addAll(arr1, arr2);

        for(int a : merged){
            freq.merge(a,1,Integer::sum);
        }
        for(int s : freq.keySet()){
            if(freq.get(s)>1){
                System.out.println(s);
            }
        }
    }
}
