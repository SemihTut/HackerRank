package CodingPractice.HackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class HackerRank {

    public static void main(String[] args) {

        List<Integer>list1 = Arrays.asList(1,2,3);
        List<Integer>list2 = Arrays.asList(4,5,6);
        List<Integer>list3 = Arrays.asList(7,8,0);

        List<List<Integer>>allList = new ArrayList<>();
        allList.add(list1);
        allList.add(list2);
        allList.add(list3);

        List<Integer> collect = allList.stream()
                .flatMap(List::stream).collect(Collectors.toList());


        int result =Math.abs((collect.get(0)+collect.get(8))-(collect.get(2)+collect.get(6)));

        System.out.println("result = " + result);
    }
}
