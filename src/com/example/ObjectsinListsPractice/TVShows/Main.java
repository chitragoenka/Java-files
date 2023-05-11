package com.example.ObjectsinListsPractice.TVShows;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("How many episodes? ");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(name, episodes, genre);
            tvShows.add(tvShow);
        }

        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow.toString());
        }
    }
}

