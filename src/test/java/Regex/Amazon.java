package Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Amazon {

    public static void main(String[] args) {
        List<String>linksList = new ArrayList<>();
        linksList.add("Amazon semih");
        linksList.add("semih");
        linksList.add("Semih Amazon");
        String list = "Amazon Business Card";
        list.matches("^Amazon");
        if(list.matches("^Amazon")){
            System.out.println("list = " + list);
        }

        List<String> collect = linksList.stream()
                .filter(x -> Pattern.compile("Amazon$").matcher(x).find())
                .collect(Collectors.toList());
        System.out.println("size = " + collect);


    }

    //	“^[!@#\\$%\\^\\&*\\)\\(+=._-]”     line starts with special char

}
