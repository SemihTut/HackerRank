package CodingPractice.Recursion;

public class RecursionJava {

    public static void main(String[] args) {
   // countBackwards(10);
        System.out.println(findFactorial(5));

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

    public static int findFactorial(int n){

        return n<2 ? 1 : n*findFactorial(n-1);
    }
}
