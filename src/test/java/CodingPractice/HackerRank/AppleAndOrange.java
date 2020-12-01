package CodingPractice.HackerRank;

public class AppleAndOrange {
    public static void main(String[] args) {

    }
    /*
    The first line contains two space-separated integers denoting the respective values of s and t .
    The second line contains two space-separated integers denoting the respective values of a and b.
    The third line contains two space-separated integers denoting the respective values of m and n.
    The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point a.
    The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point b.
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] applesEnd = new int[apples.length];
        int[] orangesEnd = new int[oranges.length];
        int countOr = 0;
        int countAp = 0;
        int count = 0;
        for(int i:apples){
          applesEnd[count]=i+a;
          countAp=applesEnd[count]>=s && applesEnd[count]<=t?countAp+1:countAp;
          count++;
        }
        count=0;
        for(int i:oranges){
           orangesEnd[count]=i+b;
           countOr=orangesEnd[count]>=s&&orangesEnd[count]<=t?countOr+1:countOr;
            count++;
        }
        System.out.println(countAp+"\n"+countOr);

    }
}
