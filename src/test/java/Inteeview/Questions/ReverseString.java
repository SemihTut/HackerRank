package Inteeview.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Semih is a qualified backend tester";
        List<Character>arrList= new ArrayList<Character>();

        for(char x :name.toCharArray()){
            arrList.add(x);
        }
        Collections.reverse(arrList);
        System.out.println("arrList = " + arrList);

        //First way
        StringBuilder stringBuilder = new StringBuilder(name);
        String reverse = stringBuilder.reverse().toString();

        System.out.println("reverse = " + reverse);

        System.out.println("---------------------");

        //Second way
        Stream<Character> stream = arrList.stream();
        Stream<String> stringStream = stream.map(String::valueOf);
        String reverse2 = stringStream.collect(Collectors.joining());
        System.out.println("collect = " + reverse2);

    }
}
