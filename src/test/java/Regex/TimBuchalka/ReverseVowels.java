package Regex.TimBuchalka;

public class ReverseVowels {
    public static void main(String[] args) {

        String word = "Ab,c,de!$";
        System.out.println("vowels(word) = " + vowels(word));

    }
    public static String vowels(String str){

        String[] arr = str.split("");
        String newStr = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
                arr[i] = arr[i].toUpperCase();
            }else if(arr[i].equals("A") || arr[i].equals("E") || arr[i].equals("I") || arr[i].equals("O") || arr[i].equals("U")){
                arr[i] = arr[i].toLowerCase();
            }
            newStr =newStr.concat(arr[i]);
        }
        return newStr;
    }
    /*
    String[] arr = str.split("");
        String newStr = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
                arr[i] = arr[i].toUpperCase();
            }else if(arr[i].equals("A") || arr[i].equals("E") || arr[i].equals("I") || arr[i].equals("O") || arr[i].equals("U")){
                arr[i] = arr[i].toLowerCase();
            }
            newStr =newStr.concat(arr[i]);
        }
        return newStr;
     */
}
