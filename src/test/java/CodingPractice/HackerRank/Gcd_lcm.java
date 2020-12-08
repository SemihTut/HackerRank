package CodingPractice.HackerRank;

import java.util.Arrays;

public class Gcd_lcm {
    public static void main(String[] args) {

    }

    private static int gcd(int x,int y){
        return (y==0)?x:gcd(y,x%y);
    }

    private static int gcd(int... numbers) {
        return Arrays.stream(numbers).reduce(0, Gcd_lcm::gcd);
    }

    private static int lcm(int... numbers){
        return Arrays.stream(numbers).reduce(1,(x,y)->x*(y/gcd(x,y)));
    }
}
