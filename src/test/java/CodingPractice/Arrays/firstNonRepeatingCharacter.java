package CodingPractice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println("nonRepeatingOne " + nonRepeatingOne("aaabcddeefbcf"));
        String str ="123 results for PC";
        String digit=str.replaceAll("\\D","");
        System.out.println("digit = " + digit);
        String asd = str.substring(0,str.indexOf(""));
        System.out.println("asd = " + asd);


    }
    //aaabbcddeef
    public static char nonRepeatingOne(String str){
        Map<Character,Integer>freq = new HashMap<>();
        /*for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(freq.containsKey(a)){
                freq.put(a,freq.get(a)+1);
            }else{
                freq.put(a,1);
            }
        }*/
        for(Character a:str.toCharArray()){
            freq.merge(a,1,Integer::sum);
        }

        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(freq.get(a)==1) return a;
        }

      //  System.out.println(ortalama >=60?"Gectiniz tebrikler":"Butunlemeye kaldiniz");
        return '_';
    }

    /*

    for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(freq.get(a)==1) return a;
        }
     */

}
