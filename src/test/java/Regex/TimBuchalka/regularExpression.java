package Regex.TimBuchalka;

public class regularExpression {
    public static void main(String[] args) {
        String first = "abcdFEG1234asdvdfhlföj";
        System.out.println(first.replaceAll("^abcd","XXXXXXXXXX"));

        String second = "abcdFEGabcfthjdsadfökö456k4äöy";
        System.out.println(second.replaceAll(".","ss"));
        System.out.println(second.matches("^abc"));

        //a,b,d den sonra F geliyorsa demek
        System.out.println(second.replaceAll("[abd][F]","SSSS"));

        //case sensitive (?i) --> kucuk buyuk farketmiyor
        System.out.println(second.replaceAll("(?i)[a-f]","S"));

        String third = "abcdF     EGabc  fth jdsadfökö        456k4äöy";
        System.out.println(third.replaceAll("\\s",""));
    }
}
