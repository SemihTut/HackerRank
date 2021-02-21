package CodingPractice.Arrays;

import java.util.Scanner;

public class randomWhileAlp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 10 + 1);
        int i = 0;
        int girilensayi = 0;
        System.out.println("3 Tahmin Hakkiniz Vardir");
        System.out.println("0-10 Arasi Sayi Tahmin Ediniz");

        while (true) {
            i++;
            System.out.println("Sayi Giriniz= ");
            girilensayi = sc.nextInt();
            if(i<3){
                if (girilensayi == random) {
                    System.out.println("bildin tebrikler");
                    System.out.println("Random Sayi =" + random);
                    break;
                } else if (girilensayi > random) {
                    System.out.println("biraz daha kucuk dusun");
                } else{
                    System.out.println("biraz daha buyuk dusun");
                }
            }else{
                System.out.println("tahmin hakkiniz doldu");
                System.out.println("Random Sayi= " + random);
                break;
            }
            System.out.println(3-i+" hakkiniz kaldi");
        }
    }
}

