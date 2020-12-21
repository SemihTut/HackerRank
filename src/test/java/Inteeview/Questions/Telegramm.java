package Inteeview.Questions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telegramm {
    public static void main(String[] args) {
        String str ="((X)(Y){3}(Z){3}){4}";
        lastConverter(str);

    }
    private static String converter(String str){
        String asd ="";
        if(str.toCharArray().length<2){
            str=str+"1";
        }
        for(int i=0;i<Integer.parseInt(str.substring(str.length()-1));i++){
            //System.out.print(str.toCharArray()[0]);
            asd+=str.toCharArray()[0];
        }
        return asd;
    }
    private static void lastConverter(String str){
        String s = str.replaceAll("\\W", ""); //XY3Z35

        int i = str.lastIndexOf("{");
        int k = str.lastIndexOf(")");
        if(i>k){
            s = "("+s.substring(0,s.length()-1)+")"+s.substring(s.length()-1);
        }else{
            s = "("+s+")"+"1";
        }
        System.out.println("s = " + s);//s = (XY3Z3)4
        Integer integer = Integer.valueOf(s.substring(s.length() - 1));
        //s=(X5Y3Z)2
        String reg = "([A-Z]\\d?)"; //X5,Y3,Z

        Matcher matcher = Pattern.compile(reg).matcher(s);
        String converter="";
        while (matcher.find()){
            converter += converter(matcher.group());
        }
        System.out.println("converter = " + converter);
        String as="";
        for(int z = 0; z <integer; z++){
            as += converter;

        }
        System.out.println("New string = " + as);
    }
}
