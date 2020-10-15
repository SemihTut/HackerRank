package Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String result = "1-48 of 135 results for 'selenium' semihtut123@gmail.com sem_ih@hotmail.edu";
        String regNumber = "[a-zA-Z\\s\\W+]";
        String regSearch = "[\\w.]+@\\w+\\.(net|com|edu)";
        Matcher m = Pattern.compile(regSearch).matcher(result);
        int count =0;
        List<String> emails = new ArrayList<>();
        while (m.find()){
            count++;
            System.out.println("m.group() = " + m.group());
            emails.add(m.group());
        }
        System.out.println("count = " + count);
        System.out.println("emails = " + emails);
        String[] split = result.split(regSearch);
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));


        String manpltd =  result.replaceAll(regNumber,"");
        String searchTerm = result.replaceAll(regSearch,"1");

        System.out.println("searchTerm = " + searchTerm);

        System.out.println("manpltd = " + manpltd);

    }
}
