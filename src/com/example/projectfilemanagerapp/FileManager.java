package com.example.projectfilemanagerapp;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileManager {

    //Attributes
    //Declare a DateTimeFormatter object to format dates and times
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //Declare a variable as path object to hold the path of the directory to be managed by the file manager.
    private static Path dirPath;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory you want to manage:");
        String inputPath = scanner.nextLine(); //User's input is read using a Scanner object and stored in a variable.

        try {
            dirPath = Paths.get(inputPath); //If the provided path is not a directory, an error message is displayed, and the program exits.
            if (!Files.isDirectory(dirPath)) {
                System.out.println("Invalid directory path.");
                return;
            }

      // The program enters a loop that displays a menu of options to the user and processes their choice until they choose to exit.
            boolean exit = false;
            while (!exit) {
                printMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();
                exit = processChoice(choice, scanner);
            }
        } catch (InvalidPathException e) {
            System.out.println("Invalid path: " + e.getMessage());
        }
    }

    //Create a method responsible for displaying the menu options to the user.
    private static void printMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Display directory contents");
        System.out.println("2. Copy a file");
        System.out.println("3. Move a file");
        System.out.println("4. Delete a file");
        System.out.println("5. Create a directory");
        System.out.println("6. Delete a directory");
        System.out.println("7. Search for a file");
        System.out.println("8. Exit");
    }

    //  method to take user's choice and execute the corresponding functionality based on the selected option.
    private static boolean processChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                displayDirectoryContents();
                break;
            case 2:
                copyFile(scanner);
                break;
            case 3:
                moveFile(scanner);
                break;
            case 4:
                deleteFile(scanner);
                break;
            case 5:
                createDirectory(scanner);
                break;
            case 6:
                deleteDirectory(scanner);
                break;
            case 7:
                searchFiles(scanner);
                break;
            case 8:
                return true;
            default:
                System.out.println("Invalid option.");
        }
        return false;
    }

    //File management operations implemented as separate methods
    private static void displayDirectoryContents() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            System.out.println("\nDirectory contents:");
            for (Path entry : stream) {
                BasicFileAttributes attrs = Files.readAttributes(entry, BasicFileAttributes.class);
                String type = attrs.isDirectory() ? "DIR" : "FILE";
                long size = attrs.size();
                LocalDateTime lastModified = LocalDateTime.ofInstant(attrs.lastModifiedTime().toInstant(), ZoneOffset.UTC);
                System.out.printf("%-10s %-10d %-20s %s%n", type, size, lastModified.format(formatter), entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error reading directory contents: " + e.getMessage());
        }
    }

    private static void copyFile(Scanner scanner) {
        System.out.println("Enter the source file name:");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter the target file name:");
        String targetFile = scanner.nextLine();
        Path source = dirPath.resolve(sourceFile);
        Path target = dirPath.resolve(targetFile);
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    private static void moveFile(Scanner scanner) {
        System.out.println("Enter the source file name:");
        String srcFile = scanner.nextLine();
        System.out.println("Enter the target file name:");
        String tgtFile = scanner.nextLine();
        Path source = dirPath.resolve(srcFile);
        Path target = dirPath.resolve(tgtFile);
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.println("Enter the file name to delete:");
        String fileToDelete = scanner.nextLine();
        Path file = dirPath.resolve(fileToDelete);
        try {
            Files.delete(file);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }

    private static void createDirectory(Scanner scanner) {
        System.out.println("Enter the name of the new directory:");
        String newDir = scanner.nextLine();
        Path dir = dirPath.resolve(newDir);
        try {
            Files.createDirectory(dir);
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    private static void deleteDirectory(Scanner scanner) {
        System.out.println("Enter the name of the directory to delete:");
        String dirToDelete = scanner.nextLine();
        Path dir = dirPath.resolve(dirToDelete);
        try {
            Files.delete(dir);
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting directory: " + e.getMessage());
        }
    }

    private static void searchFiles(Scanner scanner) {
        System.out.println("Enter the file name to search for:");
        String searchTerm = scanner.nextLine();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath, searchTerm)) {
            System.out.println("\nSearch results:");
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }
}
