package CodingPractice.Numbers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderWithHeaderAutoDetection {
    private static final String SAMPLE_CSV_FILE_PATH = "MyFile.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withIgnoreHeaderCase()
                        .withTrim()
                );
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names

                String inputNumber = csvRecord.get("Input Number");
                String primeFactors = csvRecord.get("Prime Factors");


                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + inputNumber);
                System.out.println("Email : " + primeFactors);
                System.out.println("---------------\n\n");
            }
        }
    }
    public static List<String> myReader() throws IOException {
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
                String name = csvRecord.get("Input Number");
                myList.add(name);

            }
        }

        return myList;
    }
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
