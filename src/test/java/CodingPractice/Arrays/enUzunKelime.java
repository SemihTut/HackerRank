package CodingPractice.Arrays;

import java.util.Scanner;

public class enUzunKelime {
    public static void main(String[] args) {
        String [] arr = new String[5];
        Scanner scanner = new Scanner(System.in);
        String longest ="";
        int max = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println((i+1)+". Texti giriniz: ");
            arr[i] = scanner.nextLine();
            if(arr[i].length()>max){
                max=arr[i].length();
                longest = arr[i];
            }
        }
        char first =longest.charAt(0);//ilk harf
        System.out.println("first = " + first);
        char last = longest.charAt(longest.length()-1); //son harf

        if(Character.isUpperCase(first)){
            first = Character.toLowerCase(first);
        }else{
            first = Character.toUpperCase(first);
        }
        if(Character.isUpperCase(last)){
            last = Character.toLowerCase(last);
        }else{
            last = Character.toUpperCase(last);
        }

        System.out.println("max = " + max);
        System.out.println("longest = " + longest);
        System.out.println("first = " + first);
        System.out.println("last = " + last);
    }
}
