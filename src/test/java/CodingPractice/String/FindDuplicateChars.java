package CodingPractice.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateChars {
    public static void main(String[] args) {
        String str = "baaaaaadfghjkldfguyiyopdfglklköhöhdfg";
        System.out.println(repeated(str, "dfg"));
    }
    public static int repeated(String str,String aa){
        int count = 0;
        Matcher matcher = Pattern.compile(aa).matcher(str);
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
