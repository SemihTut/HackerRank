package CodingPractice.String;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPal("Adanada."));

    }
    public static boolean isPal(String str){
        str=str.replaceAll("([^a-zA-Z0-9])","").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
