package CodingPractice.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("isPrime " + isPrime(11));
        System.out.println(primeNumbersUnTil(2));
        System.out.println(primeNumbersBetweenTwoNumbers2(12,47));

    }
    public static boolean isPrime(int number){
        return number>1 && IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(i->number % i ==0);
    }
    public static List< Integer > primeNumbersUnTil(int n) {
        return IntStream.range(2,n).filter(PrimeNumbers::isPrime).boxed().collect(Collectors.toList());

    }
    public static List<Integer>primeNumbersBetweenTwoNumbers(int startingNumber, int endingNumber){
        return IntStream.rangeClosed(startingNumber,endingNumber)
                .filter(PrimeNumbers::isPrime).boxed().collect(Collectors.toList());
    }

    public static List<Integer>primeNumbersBetweenTwoNumbers2(int startingNumber, int endingNumber){
        return IntStream.rangeClosed(startingNumber,endingNumber)
                .filter(number->number>1 && IntStream.range(2,number).noneMatch(i->number % i ==0)).boxed().collect(Collectors.toList());
    }
}
