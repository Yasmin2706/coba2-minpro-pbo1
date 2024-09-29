package com.mycompany.posttest1pbo;

import java.util.ArrayList;
import java.util.Scanner;
import manajemen_film.Movie;
import manajemen_genrefilm.Genre;

public class Posttest1pbo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Movie> movieList = new ArrayList<>();
            ArrayList<Genre> genreList = new ArrayList<>();

            // Tambahkan beberapa genre ke daftar genre
            genreList.add(new Genre("Action", "Film dengan banyak adegan aksi yang seru!"));
            genreList.add(new Genre("Drama", "Film dengan cerita yang mendalam dan menyentuh hati."));
            genreList.add(new Genre("Comedy", "Film dengan unsur humor yang lucu!"));
            genreList.add(new Genre("Horror", "Film yang menakutkan dan menyeramkan."));

            boolean running = true;

            while (running) {
                System.out.println("\n== Manajemen Film Bioskop ==");
                System.out.println("1. Tambah Film");
                System.out.println("2. Tampilkan Daftar Film");
                System.out.println("3. Hapus Film");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Tambah Film
                        System.out.print("Masukkan Judul Film: ");
                        String judul = scanner.nextLine();
                        System.out.print("Masukkan Tahun Rilis: ");
                        int tahunRilis = scanner.nextInt();
                        scanner.nextLine();  // Clear buffer
                        System.out.print("Masukkan Sutradara: ");
                        String sutradara = scanner.nextLine();

                        // Tampilkan daftar genre
                        System.out.println("Pilih Genre:");
                        for (int i = 0; i < genreList.size(); i++) {
                            System.out.println((i + 1) + ". " + genreList.get(i).getJenisGenre());
                        }
                        System.out.print("Masukkan nomor genre: ");
                        int genreChoice = scanner.nextInt();
                        scanner.nextLine();

                        // Validasi pilihan genre
                        if (genreChoice >= 1 && genreChoice <= genreList.size()) {
                            Genre selectedGenre = genreList.get(genreChoice - 1); // Ambil genre yang dipilih
                            Movie newMovie = new Movie(judul, tahunRilis, sutradara, selectedGenre.getJenisGenre());  // Sesuaikan dengan Movie class
                            movieList.add(newMovie);
                            System.out.println("Film berhasil ditambahkan ke genre " + selectedGenre.getJenisGenre() + "!");
                        } else {
                            System.out.println("Pilihan genre tidak valid.");
                        }
                        break;

                    case 2:
                        // Tampilkan Daftar Film
                        if (movieList.isEmpty()) {
                            System.out.println("Belum ada film yang ditambahkan.");
                        } else {
                            for (Movie movie : movieList) {
                                movie.displayInfo();
                            }
                        }
                        break;

                    case 3:
                        // Hapus Film
                        System.out.print("Masukkan Judul Film yang ingin dihapus: ");
                        String judulToDelete = scanner.nextLine();
                        Movie filmToRemove = null;

                        for (Movie movie : movieList) {
                            if (movie.getJudul().equalsIgnoreCase(judulToDelete)) {
                                filmToRemove = movie;
                                break;
                            }
                        }

                        if (filmToRemove != null) {
                            movieList.remove(filmToRemove);
                            System.out.println("Film berhasil dihapus!");
                        } else {
                            System.out.println("Film tidak ditemukan.");
                        }
                        break;

                    case 4:
                        running = false;
                        System.out.println("Keluar dari sistem.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }

            scanner.close();
        }
    }
}