package Inteeview.Questions;

public class Telegram3 {
    public static void main(String[] args) {
        System.out.println("solution(27) = " + solution(28));
    }

    public static int solution(int number){
        // 28 verilirse sonuc 37 olacak. kendisinden sonra gelen en kucuk sayi
        // basamak degerleri toplami esit olmak kaydiyla
        int newNumber = number;
        do {
            newNumber++;
        } while (totalValue(number) != totalValue(newNumber));
        return  newNumber;
    }
    public static int totalValue(int number){
        int count=0;
        while(number>0){
            count+=number%10;
            number=number/10;
        }
        return count;
    }
}
