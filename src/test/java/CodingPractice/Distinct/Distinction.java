package CodingPractice.Distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinction {
    public static void main(String[] args) {
        String str = "galatasaray";
        System.out.println("dist(str) = " + dist(str));
    }

    public static String dist(String str){
        String[] split = str.split("");
        List<String> collect = Arrays.stream(split)
                .distinct()
                .collect(Collectors.toList());

        return String.join("",collect);
    }
}
