package CodingPractice.CodeWars;
import java.util.*;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(reverse(4429));
        System.out.println(descendingOrder(471239376));
        System.out.println(sortDesc3(74239));

    }

    private static int reverse(int number) {
        int sortedNumber =0;
        while(number>0){
            int digit = number%10;
            sortedNumber=sortedNumber*10+digit;
            number=number/10;
        }
        return sortedNumber;
    }

    private static int descendingOrder(int number){
        List<Integer>listNumber=new ArrayList<>();
        while(number>0){
            int digit=number%10;
            listNumber.add(digit);
            number/=10;
        }
        List<Integer> collect = listNumber.stream().sorted().collect(Collectors.toList());
        for(int i=0;i<collect.size()-1;i++){
            number=number*10+collect.get(i);
        }
        return number;
    }

    private static List<Integer> ascendingOrder(int number){
        List<Integer>listNumber=new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while(number>0){
            int digit=number%10;
            listNumber.add(digit);
            number/=10;
        }
        List<Integer> collect = listNumber.stream().sorted().collect(Collectors.toList());
        List<Integer>ascending=new ArrayList<>();
        for(int i=listNumber.size()-1;i>=0;i--){
           ascending.add(collect.get(i));
        }
        return ascending;
    }
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
    public static int sortDesc3(final int num) {
        int[] digitsCount = new int[10]; //contains all digits from 0..9 to increment their count
        int number = num;
        while (number != 0) {
            int digit = number % 10;
            digitsCount[digit]++;
            number /= 10;
        }
        int result = 0;
        for (int digit = 9; digit >= 0; --digit) {
            int count = digitsCount[digit];
            for (int i = 0; i < count; ++i)
                result = result * 10 + digit;
        }
        return result;
    }
}
