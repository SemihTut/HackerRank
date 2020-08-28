package CodingPractice.Numbers;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isNumber(5));
        System.out.println(isNumber(6));
    }
    public static String isNumber(int num){

        return num%2==0?"Even":"Odd";
    }
}
