package CodingPractice.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reversed(459687456));
    }
    public static int reversed(int number){
        String num = String.valueOf(number);
        List<StringBuilder> collect = Stream.of(num).map(StringBuilder::new).map(StringBuilder::reverse)
                .collect(Collectors.toList());
        String s = collect.toString();
        String str = s.substring(1,s.length()-1);
        return Integer.parseInt(str);
    }


}
