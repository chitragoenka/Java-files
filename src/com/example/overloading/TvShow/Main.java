package com.example.overloading.TvShow;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> TvShows = new ArrayList<>();

        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Sounds interesting! Who plays the main character?");
            String mainCharacter = scanner.nextLine();

            System.out.print("How many episodes in total? ");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            System.out.println("What rating does it have?");
            double rating = Double.parseDouble(scanner.nextLine());

            System.out.println("I have to watch it. Is it on Netflix? (yes or no)");
            String onNetflixInput = scanner.nextLine();

            boolean onNetflix = onNetflixInput.equalsIgnoreCase("yes");
           // scanner.nextLine();

            TvShow TvShow = new TvShow(name, mainCharacter, episodes, genre, rating, onNetflix);
            TvShows.add(TvShow);
        }

        for (TvShow TvShow : TvShows) {
            System.out.println(TvShow.toString());
        }
    }
}