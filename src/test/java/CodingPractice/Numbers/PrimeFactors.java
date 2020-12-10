package CodingPractice.Numbers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeFactors {

    private static final String SAMPLE_CSV_FILE_PATH = "MyFile.csv";
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        CSVWriter.writeResult(n,primeFactorsList(n));

    }
    //return list of primeFactors
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

    //reader by header
    public static List<String> myReaderPrimes() throws IOException {
        List<String> myList = new ArrayList<>();
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String email = csvRecord.get("Prime Factors");
                myList.add(email);

            }
        }

        return myList;
    }
}
