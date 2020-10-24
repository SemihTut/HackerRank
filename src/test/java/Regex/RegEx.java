package Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String result = "1-48 of 135 results for \"selenium\" semihtut123@gmail.com sem_ih@hotmail.edu";
        String regNumber = "[a-zA-Z\\s\\W+]";
        String regSearch = "[\\w.]+@\\w+\\.(net|com|edu)";
        String resultNumber = "\\s\\d+\\s";
        String pageNumber = "\\d-?\\d+";
        String searchTerm = "\"\\w+\"";
        String searchTerm2 = "[\"\\w+$\"]";
        System.out.println("converter(result,searchTerm) = " + converter(result, searchTerm2));
        System.out.println("converter(result,pageNumber) = " + converter(result, pageNumber));

        Matcher resultMatcher = Pattern.compile(resultNumber).matcher(result);
        if(resultMatcher.find()){
            String group = resultMatcher.group().trim();
            System.out.println("group = " + group);
        }
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
        //String searchTerm = result.replaceAll(regSearch,"1");



        System.out.println("manpltd = " + manpltd);

    }
    public static String converter(String str, String regex){
        Matcher resultMatcher = Pattern.compile(regex).matcher(str);
        String group = "";
        if(resultMatcher.find()){
            group += resultMatcher.group().replace(" ","");
            //System.out.println("group = " + group);
        }
        return group;
    }
}
