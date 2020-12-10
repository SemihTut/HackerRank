package CodingPractice.Numbers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class CSVWriter {
    private static final String SAMPLE_CSV_FILE = "MyFile.csv";

    public static void main(String[] args) throws IOException {

        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Input Number", "Prime Factors"));
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai ♥", "CEO", "Google");
            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");

            csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO", "Facebook"));

            csvPrinter.flush();
        }
    }
    public static void writeResult(int inputNumber, List<Integer> primeFactors){
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Input Number", "Prime Factors"));
        ) {
            writer.newLine();
            csvPrinter.printRecord(String.valueOf(inputNumber), String.valueOf(primeFactors));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeResult(int inputNumber, String primeFactors){
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Input Number", "Prime Factors"));
        ) {

            csvPrinter.printRecord(String.valueOf(inputNumber), String.valueOf(primeFactors));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
