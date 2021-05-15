package Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Amazon {

    /**
     *
     * @param args to find the links which ends with amazon and not start with amazon
     */
    public static void main(String[] args) {
        List<String>linksList = new ArrayList<>();
        linksList.add("Amazon semih");
        linksList.add("2amazon");
        linksList.add("Semih Amazon");
        linksList.add("Amazon Business Card amazon");


        List<String> collect = linksList.stream()
                .filter(x -> !Pattern.compile("^([Aa])mazon").matcher(x).find()
                && Pattern.compile("([Aa])mazon").matcher(x).find())
                .collect(Collectors.toList());
        System.out.println("result " + collect);


        List<String> collect1 = linksList.stream()
                .filter(x -> Pattern.compile("\\b([Aa])mazon$").matcher(x).find())
                .collect(Collectors.toList());
        System.out.println("Link ends with amazon " + collect1);

    }

    //	“^[!@#\\$%\\^\\&*\\)\\(+=._-]”     line starts with special char

}
