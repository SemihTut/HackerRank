package CodingPractice.HackerRank;

public class PatternJava {

    public static void main(String[] args) {
       /* rightTriangle(4);
        leftTriangle(4);
        pyramid(4);*/
        //pyramidBack(4);
        backwards(7);
        pyramid2(7);
    }

    public static void rightTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void leftTriangle(int n){
        int i, j;
        for (i=0; i<n; i++){
            for (j=2*(n-i); j>=0; j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n){

        int i,j,k;
        for(i=0;i<n;i++){
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    public static void pyramidBack(int n){

        int i,j,k,t,y;
        for(i=0;i<n;i++){
            for(j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for(k=1;k<n;k++){
            for(t=0;t<k;t++){
                System.out.print(" ");

            }
            for(y=0;y<=n-1-k;y++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void backwards(int n){
        int i,j,k;
        for(i=0;i<n;i++){
            for(k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramid2(int n){
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}