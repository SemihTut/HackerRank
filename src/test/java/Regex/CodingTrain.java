package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingTrain {
    public static void main(String[] args) {

        String text = "Galatasaray, 22 sampiyonlugunu aldiginda ben 33 yasindaydim" +
                " asdli gelir mi asd@gmail.com 236-568, asli , asli23, assli345 semi";
        String reg = "\\d{2}";
        String reg1 = "[^\\d\\s]";
        String reg2 = "\\W";
        String reg3 = "asd?li\\s";
        String reg4 = "as\\w?li\\d{2}";
        String reg5 = "\\b\\w{4}\\b"; //4 harfli kelimler
        System.out.println("reg(text,reg) = " + reg(text, reg5));
        System.out.println("reg1(text,reg1) = " + reg(text, reg1));
        System.out.println("reg1(text,reg2) = " + reg(text, reg2));


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
