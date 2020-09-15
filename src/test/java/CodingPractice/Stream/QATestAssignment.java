package CodingPractice.Stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QATestAssignment {
    public static void main(String[] args) {

        /*
        Write a program in python or java which accepts a single list as a parameter.
        This list consists of any number of lists (1..n), and you can assume each list
        only contains words(e..g. [‘apple’, ‘mango’, ‘cherry’...]).
        The program should print out the following:
        -words that appear in more than one list
        -The total number of unique words across all lists
        -Top five frequent words in the all lists
        How would you test this program? Write a test to verify it?

         */



    }
    public static void assignment(List<List<String>>lists){
        //convert all lists to one list
        List<String> stringList = lists.stream().flatMap(List::stream).collect(Collectors.toList());

        //unique items
        List<String> uniqueItems = stringList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
                .stream().filter(a -> a.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

        //number of unique items
        int size = uniqueItems.size();
        System.out.println("size = " + size);

        //repeated items
        List<String> repeatedWords = stringList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting())).entrySet()
                .stream().filter(a -> a.getValue() != 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("frequencyWords = " + repeatedWords);

    }
}
