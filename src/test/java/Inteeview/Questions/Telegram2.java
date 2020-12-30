package Inteeview.Questions;

import java.util.Arrays;

public class Telegram2 {
    public static void main(String[] args) {
        String str = "My name is Semih";
        String[] s = str.split(" ");
        for(int i =0;i<s.length;i++){
            if(i%2==0){
                s[i]=s[i].toUpperCase();
            }else{
                s[i]=s[i].toLowerCase();
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
