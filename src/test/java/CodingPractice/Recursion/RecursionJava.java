package CodingPractice.Recursion;

public class RecursionJava {

    public static void main(String[] args) {
    countBackwards(10);

    }

    public static void countBackwards(int n){

    if(n==0){
         System.out.println("DONE");
     }else {
         System.out.println(n);
         n--;
         countBackwards(n);

     }
   /* String msg ="";
     msg = n==0 ? "DONE" : ""+n;
        System.out.println(msg);*/
    }
}
