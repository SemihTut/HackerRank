package CodingPractice.Numbers;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeFactors {
    public static void main(String[] args) throws IOException {
        String line ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        BufferedReader br = new BufferedReader(new FileReader("MyFile.csv"));

        CSVWriter.writeResult(n,primeFactorsList3(n));



        System.out.println(CSVReaderWithHeaderAutoDetection.myReader());
        System.out.println("CSVReader " + CSVReaderWithHeaderAutoDetection.myReaderPrimes().toString());


    }
    public static List<Integer> primeFactorsList(int n) {
        String list = "";
        List<Integer> primeFactors = new ArrayList<>();
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            list=""+2;
            primeFactors.add(2);
            n /= 2;
        }
        // n must be odd at this point.

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list+=i;
                primeFactors.add(i);
                n /= i;
            }
        }
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2){
            list+=2;
            primeFactors.add(n);
        }

        //stream/distinct
        return primeFactors.stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> primeFactorsList2(int number) {
        int n = number;
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 2) primeFactors.add(n);
        return primeFactors;
    }

    public static String primeFactorsList3(int n) {
        String list = "";
        StringBuilder sb = new StringBuilder(list);

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            sb.append(2).append(",");
            n /= 2;
        }
        // n must be odd at this point.

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                sb.append(i);
                n /= i;
            }
        }
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2){
            sb.append(n);
        }
        //stream/distinct
        return sb.toString();
    }
}
