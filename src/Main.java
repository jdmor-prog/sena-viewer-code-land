import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        // ----------------------------- Objetos
        Book book = new Book("100 años de soledad", "05/06/1967", "Sudamericana", "0001");
        Book book_2 = new Book("El coronel no tiene quien le escriba", "08/06/1961", "Sudamericana", "0001");

        Movie movie = new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, (short) 2010);
        Movie movie_2 = new Movie("Guardians of the Galaxy", "Sci-Fi", "James Gunn", 160, (short) 2016);

        Magazine magazine = new Magazine("Forbes", "2020", "Forbes");
        Magazine magazine_2 = new Magazine("JP Morgan", "2022", "J.P. Morgan");

        Serie serie = new Serie("Arcane", "Sci-Fi", "Riot", 25, 15);
        Serie serie_2 = new Serie("Dark", "Sci-Fi, Suspenso", "Baran bo", 120, 20);
        // ----------------------------- Objetos

        int contadorPeliculas = 0;
        int contadorSeries = 0;
        int contadorLibros = 0;
        int contadorRevistas = 0;

        int categoria = 0;

    }
}
