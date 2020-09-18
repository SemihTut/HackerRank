package CodingPractice.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("isPrime " + isPrime(15));
        System.out.println(primeNumbersUnTil(17));
        System.out.println(primeNumbersBetweenTwoNumbers(12,475));

    }
    public static boolean isPrime(int number){
        return number>1 && IntStream.range(2,number).noneMatch(i->number % i ==0);
    }
    public static List< Integer > primeNumbersUnTil(int n) {
        return IntStream.rangeClosed(2,n).filter(PrimeNumbers::isPrime).boxed().collect(Collectors.toList());

    }
    public static List<Integer>primeNumbersBetweenTwoNumbers(int startingNumber, int endingNumber){
        return IntStream.rangeClosed(startingNumber,endingNumber)
                .filter(PrimeNumbers::isPrime).boxed().collect(Collectors.toList());
    }

}
