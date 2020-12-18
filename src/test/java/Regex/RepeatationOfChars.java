package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatationOfChars {
    public static void main(String[] args) {

        String str = "neerajara mohra rerada";
        String reg = "(ra)";
        Matcher matcher = Pattern.compile(reg).matcher(str);
        int count=0;
        while(matcher.find()){
            count ++;
        }
        System.out.println("count = " + count);
    }
}
