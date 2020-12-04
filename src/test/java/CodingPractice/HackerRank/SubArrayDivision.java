package CodingPractice.HackerRank;

import java.util.*;

public class SubArrayDivision {
    public static void main(String[] args) {


    }
    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        for(int i=0; i<= s.size() - m; i++) {
            if( s.subList(i, i+m).stream().mapToInt(n -> n).sum() == d) {
                count++;
            }
        }

        return count;
    }


}
