package CodingPractice.HackerRank;

public class CatsAndMouse {
    public static void main(String[] args) {
        System.out.println("catAndMouse(1,2,3) = " + catAndMouse(1, 3, 2));
    }
    private static String catAndMouse(int x, int y, int z){

        int distanceCatA = Math.abs(x-z);
        int distanceCatB = Math.abs(y-z);

        String result = distanceCatA==distanceCatB?"Mouse C":distanceCatA>distanceCatB?"Cat B":"Cat A";
        return result;
    }
}
