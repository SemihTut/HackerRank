package CodingPractice.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeNumbersZero {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,0,4,5);
        System.out.println("makeZero(numbers) = " + makeZero(numbers));



    }

    public static List<Integer> makeZero (List<Integer>list){
        int element =0;
        List<Integer>left=new ArrayList<>();
        List<Integer>right=new ArrayList<>();
        int indexZero = indexOfZero(list);
        System.out.println("indexZero = " + indexZero);
        for(int i=0;i<indexZero;i++){
               left.add(list.get(i));
        }
        for(int i=indexZero;i<list.size();i++){
                right.add(list.get(indexZero));
        }
        return Stream.concat(left.stream(),right.stream()).collect(Collectors.toList());
    };

    public static int indexOfZero(List<Integer>numbers){
        List<Integer> collect = IntStream.range(0, numbers.size())
                .filter(x -> numbers.get(x) == 0).boxed().collect(Collectors.toList());
        return collect.get(0);
    }

    public static int indexOfZero2(List<Integer>numbers){
        List<Integer> collect = IntStream.range(0, numbers.size())
                .filter(x -> numbers.get(x) == 0).boxed().collect(Collectors.toList());
        return collect.get(0);

    }


}
