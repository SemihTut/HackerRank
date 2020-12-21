package Inteeview.Questions;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOfOcuurences {
    public static void main(String[] args) {
        int[]arrs = {1,2,2,1,1,3,2};
        System.out.println(uniqueOccurences(arrs));
    }
    private static boolean uniqueOccurences(int[]arr){
        Map<Integer,Integer>freq = new HashMap<>();
        List<Integer>myList = new ArrayList<>();
        for(int a :arr){
            freq.merge(a,1,Integer::sum);
        }
        //(1=3),(2=3),(3=1)
        for(int b :freq.keySet()){
            myList.add(freq.get(b));
        }
        //3,3,1
        List<Integer> collect = myList.stream().distinct().collect(Collectors.toList());
        //3,1
        return collect.size() == freq.size();
    }
}
