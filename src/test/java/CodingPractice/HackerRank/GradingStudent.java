package CodingPractice.HackerRank;

import java.util.*;

public class GradingStudent {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        System.out.println("gradingStudents(grades) = " + gradingStudents(grades));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer>newList = new ArrayList<>();
        for(int grade :grades){
            int resultGrade = grade<38 || grade %5 <3?grade:grade+(5-grade%5);
            newList.add(resultGrade);
        }
        return newList;
    }
}
