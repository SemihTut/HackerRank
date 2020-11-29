package CodingPractice.HackerRank;

import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candle= Arrays.asList(3,2,1,3,3);
        System.out.println("birthdayCakeCandles(candle) = " + birthdayCakeCandles(candle));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        Map<Integer,Integer>freq=new HashMap<>();
        for(Integer s : candles){
            freq.merge(s,1,Integer::sum);
        }
        Collections.sort(candles);
        int max = candles.get(candles.size()-1);
        return freq.get(max);
    }
}
