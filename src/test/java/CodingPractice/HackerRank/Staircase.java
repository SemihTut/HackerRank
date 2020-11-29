package CodingPractice.HackerRank;

public class Staircase {
    public static void main(String[] args) {
    staircase(6);
    }
    static void staircase(int n) {
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
