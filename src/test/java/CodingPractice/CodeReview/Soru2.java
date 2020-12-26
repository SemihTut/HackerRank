package CodingPractice.CodeReview;

import java.util.*;

public class Soru2 {
    public static void main(String[] args) {
        System.out.println(liste(20));
    }
    private static Map<Integer,Integer>liste(int number){
        Map<Integer,Integer>freq=new HashMap<>();
        List<Integer>gradings =new ArrayList<>();
        for(int i=0;i<number;i++){
            int grade = (int) (Math.random() * 10);
            gradings.add(grade);
        }
        for(Integer a : gradings){
            freq.merge(a,1,Integer::sum);
        }
        return freq;
    }
}
