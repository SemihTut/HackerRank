package CodingPractice.HackerRank;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean flag;
        if(v1>v2){
            flag= (x1 - x2) % (v1 - v2) == 0;
        }else{
           flag=false;
        }
        return flag ?"YES":"NO";
    }
}
