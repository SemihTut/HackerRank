package CodingPractice.HackerRank;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheHurdleRace {
    public static void main(String[] args) {
        int[]list = {1,6,3,5,2};
        System.out.println("hurdleRace(7,list) = " + hurdleRace(4, list));

    }
    static int hurdleRace(int k, int[] height) {
        int max = Arrays.stream(height).max().getAsInt();
        return max>k?(max-k):0;

    }
}
