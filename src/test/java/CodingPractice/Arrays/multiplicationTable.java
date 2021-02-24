package CodingPractice.Arrays;

public class multiplicationTable {
    public static void main(String[] args) {
        int i;
        for(i=1;i<6;i++){
            for(int j=0;j<11;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(i=6;i<11;i++){
            for(int j=0;j<11;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
