package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTrain {
    public static void main(String[] args) {

        String text = "Galatasaray, 22 sampiyonlugunu aldiginda ben 33 yasindaydim" +
                " asdli gelir mi asd@gmail.com 236-568";
        String reg = "\\d{2}";
        String reg1 = "[^\\d\\s]";
        System.out.println("reg(text,reg) = " + reg(text, reg));
        System.out.println("reg1(text,reg1) = " + reg(text, reg1));


    }
    public static List<String> reg(String str, String reg){
        List<String>ask = new ArrayList<>();

        Matcher m = Pattern.compile(reg).matcher(str);
        while (m.find()){
            if(!m.group().isEmpty()){
                ask.add(m.group());
            }
        }
        return ask;
    }
}
