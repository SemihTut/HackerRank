package Regex;

public class MaskRegex {
    public static void main(String[] args) {
        System.out.println(mask("ILoveAutomation!"));

    }

    public static String mask(String str){

        return str.replaceAll(".(?<=.{6})", "*");
        //Input  = ILoveAutomation!
        //Output = ILove***********
    }
}
