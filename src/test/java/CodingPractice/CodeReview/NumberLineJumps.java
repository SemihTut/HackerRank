package CodingPractice.CodeReview;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(jumps(0, 4, 4, 1));
    }
    private static String jumps(int x1,int v1, int x2,int v2){

        return v1<=v2?"NO":(x2-x1)%(v1-v2)!=0?"NO":"YES";
    }

    private static String jumps2(int x1,int v1, int x2,int v2){

        return v1<=v2?"NO":(x2-x1)%(v1-v2)!=0?"NO":"YES";
    }

    private static String jumps3(int x1,int v1, int x2,int v2){

        return v1<=v2?"NO":(x2-x1)%(v1-v2)!=0?"NO":"YES";
    }
}
