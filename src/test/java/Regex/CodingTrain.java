package Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CodingTrain {
    public static void main(String[] args) {

        String text = "Galatasaray, 22 sampiyonlugunu aldiginda ben 33 yasindaydim" +
                " asdli gelir (mi) asd1@gmail.com 236-568, (asli) , asli23, assli345 semi sem.tit@gmail.com";

        String name = "Gunerli,Samet";

        List<String> names = Arrays.asList("Gunerli,Samet", "Ulker, Mehmet Alperen");
        String changeReg = "(\\w+),(.*)";

        Pattern compile = Pattern.compile(changeReg);
        List<List<String>> collect = names.stream().map(x -> regChange(x, changeReg))
                .collect(Collectors.toList());
        List<String> collect1 = collect.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        Matcher m = compile.matcher(name);
        String last ="";
        if (m.matches()) {
            String Surname = m.group(1);
            String namess = m.group(2);
            last += namess+" "+Surname;
        }
        System.out.println("last = " + last);

        String reg = "\\d{2}";
        String reg1 = "[^\\d\\s]";
        String reg2 = "\\W";
        String reg3 = "asd?li\\s";
        String reg4 = "as\\w?li\\d{2}";
        String reg5 = "\\b\\w{4}\\b"; //4 harfli kelimler
        String reg6 = "\\(\\b\\w+\\)";
        String reg7 = "[\\w.]+@\\w+[.](com|net)+";
        System.out.println("reg(text,reg) = " + reg(text, reg5));
        System.out.println("reg1(text,reg6) = " + reg(text, reg6));
        System.out.println("reg1(text,reg7) = " + reg(text, reg7));


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

    public static List<String> regChange(String str, String reg){
        List<String>ask = new ArrayList<>();

        Matcher m = Pattern.compile(reg).matcher(str);
        String last ="";
        if (m.matches()) {
            String Surname = m.group(1);
            String namess = m.group(2);
            last += namess+" "+Surname;
            ask.add(last);
        }
        return ask;
    }

}
