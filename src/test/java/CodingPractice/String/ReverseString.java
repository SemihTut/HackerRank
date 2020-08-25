package CodingPractice.String;

public class ReverseString {
    public static void main(String[] args) {

        String team = "galatasaray";
        StringBuilder sb = new StringBuilder(team);
        String reverse = sb.reverse().toString();
        System.out.println("reverse = " + reverse);

    }
}
