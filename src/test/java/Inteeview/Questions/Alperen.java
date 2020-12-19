package Inteeview.Questions;

public class Alperen {
    public static void main(String[] args) {
        System.out.println("findFirst(34518,27589) = " + findFirst(30000, 27589));
    }

    public static int findFirst(int number1,int number2){
        int big = Math.max(number1,number2);
        int small = Math.min(number1,number2);
        int subs = big-small;
        while(subs%2!=0){
            small+=13;
            subs=big-small;
            break;
        }
        return firstDigit(subs);
    }
    public static int firstDigit(int num){
        while(num > 10){
            num=num/10;
        }
        return num;
    }
}
