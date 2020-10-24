package Inteeview.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<String> capitalA= new ArrayList<>();
        List<String>capitalB= new ArrayList<>();
        List<String>capitalC= new ArrayList<>();

       // numbers.forEach(System.out::println);
        Consumer<Integer>meth = System.out::println;
        //numbers.forEach(meth);
        numbers.forEach(s->{if(s%2!=0) System.out.println(s);});
        System.out.println("/////////////////");
        numbers.stream()
                .filter(s-> (s%2==0))
                .forEach(System.out::println);

        String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy",
                "Bertha", "Annie", "Carl", "Dennis", "Caroline", "Bob", "Betty", "Bart", "Albert" };

        ArrayList<String>namesList = new ArrayList<>(Arrays.asList(testStrings));
        namesList.forEach(name-> {if(name.charAt(0)=='B'&& name.length()>4)capitalB.add(name);});
        namesList.forEach(name-> {if(name.charAt(0)=='A')capitalA.add(name);});
        namesList.forEach(name-> {if(name.charAt(0)=='C')capitalC.add(name);});
        namesList.forEach(name-> {if(name.charAt(0)=='B')capitalB.add(name);});

        //System.out.println("capitalA = " + capitalB);
        System.out.println("-----------------");
        namesList.stream()
                .filter(name-> (name.charAt(0)=='B'&& name.length()>4))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
