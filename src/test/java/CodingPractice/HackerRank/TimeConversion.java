package CodingPractice.HackerRank;

import java.text.*;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {
        String date = "17:45:23AM";
        System.out.println(timeConversion(date));
    }
    static String timeConversion(String s){
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat expected = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;
        try{
            output = expected.format(df.parse(s));
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;

    }
}
