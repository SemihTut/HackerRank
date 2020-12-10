package CodingPractice.Numbers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class BasicCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "MyFile.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index

                String inputNumber = csvRecord.get(0);
                String primeFactors = csvRecord.get(1);


                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("inputNumber : " + inputNumber);
                System.out.println("primeFactors : " + primeFactors);

                System.out.println("---------------\n\n");
            }
        }
    }

    public static String myReader() throws IOException {
        String inputNumber="";
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index

                inputNumber = csvRecord.get(0);
                String primeFactors = csvRecord.get(1);


                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + inputNumber);
                System.out.println("Email : " + primeFactors);

                System.out.println("---------------\n\n");
            }
        }

        return inputNumber;
    }
}
