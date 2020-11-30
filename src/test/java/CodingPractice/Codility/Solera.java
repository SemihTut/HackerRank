package CodingPractice.Codility;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solera {
    public static void main(String[] args) {
        int[]a = new int[]{5,-15,345,21,6};
        System.out.println("solution2(a) = " + solution2(a));
        System.out.println("solution(a) = " + solution(a));
    }
    public static boolean solution (@NotNull int[] A) {
        List<Integer>myList = new ArrayList<>();
        
        int count =0;
        for(int a :A){
            count=a!=1?count+1:count;
            myList.add(a);
            }
        List<Integer> freqList = myList.stream().distinct().collect(Collectors.toList());

        return freqList.size()>1 && count >= 2;
        }

        public static int solution2(@NotNull int[] A) {
            int sum =0;
            for(int a:A){
                sum=Math.abs(a)>9 && Math.abs(a)<100?sum+a:sum;
            }
            return sum;
        }
    }


