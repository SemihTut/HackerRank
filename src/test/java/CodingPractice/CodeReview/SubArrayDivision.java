package CodingPractice.CodeReview;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {

        List<Integer>liste = Arrays.asList(3,2,5,6,2);
        System.out.println(birthday(liste, 8));
    }
    public static int birthday(List<Integer> s, int m) {

        int count = 0;
        for(int i=0; i<= s.size() - 1; i++) {
            for(int j=0;j<s.size()-1&&j!=i;j++){
                if(s.get(i)+s.get(j)==m){
                    count++;
                }
            }
        }
        return count;
    }
}
