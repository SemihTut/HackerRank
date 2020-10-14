package CodingPractice.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmQuestion {

    public static void main(String[] args) {
        int i = algoQ(9753, 8641);
        System.out.println("i = " + i);
    }
    public static int algoQ(int a, int b){

        String first = String.valueOf(a);
        String second = String.valueOf(b);

        List<Integer> arrActual = Arrays.asList(9,7,5,3);
        List<Integer> arrActual2 = Arrays.asList(8,6,4,2);

        List<String> arrFirst = Arrays.asList(first.split(""));
        List<String> arrSecond = Arrays.asList(second.split(""));

        List<Integer> newListFirst = arrFirst.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> newListSecond = arrSecond.stream().map(Integer::valueOf).collect(Collectors.toList());
        int count =0;
        for(int i=0; i<4; i++){
            if (arrActual.get(i) - newListFirst.get(i) > newListFirst.get(i) + 10 - arrActual.get(i)) {
                count += Math.abs(newListFirst.get(i) + 10 - arrActual.get(i));
            } else {
                count += Math.abs(arrActual.get(i) - newListFirst.get(i));
            }
            if (arrActual2.get(i) - newListSecond.get(i) > newListSecond.get(i) + 10 - arrActual2.get(i)) {
                count += Math.abs(newListSecond.get(i) + 10 - arrActual2.get(i));
            } else {
                count += Math.abs(arrActual2.get(i) - newListSecond.get(i));
            }
        }
        return count;
    }
}
