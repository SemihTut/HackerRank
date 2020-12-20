package Inteeview.Questions;
import java.util.*;
import java.util.stream.IntStream;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        selfDividing(1,22).forEach(System.out::print);
    }
    public static List<Integer>selfDividing(int a, int b){
        List<Integer>myList=new ArrayList<>();
       // IntStream.range(a,b).filter(x-> x<10?listo.add(x):)
        for(int i = a;i<=b;i++){
            if(isSelfDividing(i)){
                myList.add(i);
            }
        }

       return myList;

    }
    private static boolean isSelfDividing(int n){
        int temp = n;
        while(temp>0){
            int d = temp%10;
            if(d==0 || n%d!=0){
              return false;
            }
            temp/=10;
        }
        return true;
    }
}
