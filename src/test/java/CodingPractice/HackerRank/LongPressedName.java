package CodingPractice.HackerRank;

public class LongPressedName {
    public static void main(String[] args) {

    }
    public static boolean isLongPressed(String name, String typed){
        if(name.length() >typed.length()){
            return false;
        }
        int firstString = 0;
        int secondString = 0;
        while(secondString < typed.length()){
            if(name.charAt(firstString)==typed.charAt(secondString)){
                firstString++;
            }
        }
    }
}
