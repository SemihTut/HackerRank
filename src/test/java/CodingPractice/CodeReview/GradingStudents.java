package CodingPractice.CodeReview;
import java.util.*;
public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradings(10));
    }
    private static List<Integer>gradings(int number){
        List<Integer>gradings =new ArrayList<>();
        List<Integer>success = new ArrayList<>();
        for(int i=0;i<number;i++){
            int grade = (int) (Math.random() * 100);
            gradings.add(grade);
        }
        System.out.println("gradings = " + gradings);
        for(Integer s : gradings){
            if(s<=37){
                System.out.print(s+" FAIL");
                System.out.println();
            }else{
                if(s%5>2){
                    s+=5-s%5;
                }else{
                    s-=s%5;
                }
                success.add(s);
            }
        }
        return success;
    }
}
