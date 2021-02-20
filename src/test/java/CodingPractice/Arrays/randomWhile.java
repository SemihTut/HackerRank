package CodingPractice.Arrays;

import java.util.Scanner;

public class randomWhile {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int rnd = (int) (Math.random() * 10) +1;
        System.out.println("rnd = " + rnd);
        while(true){
            int userNumber = sc.nextInt();
            if(userNumber == rnd){
                System.out.println("Congs");
                break;
            }
            if(userNumber < rnd){
                System.out.println("Please input bigger");
            }else {
                System.out.println("Input smaller");
            }
            count++;

            if(count>3){
                System.out.println("You have no right to select number");
                break;
            }

        }
    }
}
