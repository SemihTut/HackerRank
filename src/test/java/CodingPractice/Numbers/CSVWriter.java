package CodingPractice.Numbers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

                CSVPrinter csvPrinter = new CSVPrinter(writer,CSVFormat.DEFAULT)
        ) {

            csvPrinter.printRecord(String.valueOf(inputNumber), String.valueOf(primeFactors));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeResult(int inputNumber, String primeFactors){
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));


                CSVPrinter csvPrinter = new CSVPrinter(writer,CSVFormat.DEFAULT)
        ) {

            csvPrinter.printRecord(String.valueOf(inputNumber), String.valueOf(primeFactors));

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public String convertToCSV(String[] data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }
    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
