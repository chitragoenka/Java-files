package com.example.assignmentio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergingIntegers {

    public static void main(String[] args) {
        String inputFile1 = "src/com/example/assignmentio/input1.txt";
        String inputFile2 = "src/com/example/assignmentio/input2.txt";
        String outputFile = "src/com/example/assignmentio/merged.txt";
        String commonOutputFile = "src/com/example/assignmentio/common.txt";


        try {
            List<Integer> integers1 = readIntegersFromFile(inputFile1);
            List<Integer> integers2 = readIntegersFromFile(inputFile2);

            List<Integer> mergedIntegers = mergeIntegers(integers1, integers2);
            writeIntegersToFile(mergedIntegers, outputFile);

            Set<Integer> commonIntegers = findCommonIntegers(integers1, integers2);
            writeIntegersToFile(new ArrayList<>(commonIntegers), commonOutputFile);

            System.out.println("Integers from first file "+ integers1);
            System.out.println("Integers from second file "+ integers2);
            System.out.println();

            System.out.println("Merged integers successfully written to " + outputFile);


            System.out.println("Common integers successfully written to " + commonOutputFile);

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format in input files: " + e.getMessage());
        }
    }

    private static List<Integer> readIntegersFromFile(String fileName) throws IOException, NumberFormatException {
        List<Integer> integers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                integers.add(Integer.parseInt(line));
            }
        }

        return integers;
    }

    private static List<Integer> mergeIntegers(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        return merged;
    }

    private static Set<Integer> findCommonIntegers(List<Integer> list1, List<Integer> list2) {
        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(list2);
        return common;
    }

    private static void writeIntegersToFile(List<Integer> integers, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : integers) {
                writer.write(number.toString());
                writer.newLine();
            }
        }
    }
}

