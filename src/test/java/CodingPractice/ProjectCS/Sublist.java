package CodingPractice.ProjectCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sublist {
    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 0, 0, 0));
        List<Integer> integers = list0.subList(0, 3);
        System.out.println(integers);
    }
}
