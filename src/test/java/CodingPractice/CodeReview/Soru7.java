package CodingPractice.CodeReview;

import java.util.Random;
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        int number = (int)((Math.random()*99)+1);
        System.out.println("number = " + number);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1-100 aras bir sayi giriniz");
        int count = 1;
        int guess = scanner.nextInt();
        while(number!=guess){
            if(number>guess){
                System.out.println("Daha buyuk bir sayi giriniz");
            }else {
                System.out.println("Daha kucuk bir sayi giriniz");
            }
            guess = scanner.nextInt();
            count ++;
        }
        System.out.println("count = " + count);
    }
}
