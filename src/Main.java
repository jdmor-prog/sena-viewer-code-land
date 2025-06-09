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

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Películas");
            System.out.println("2. Series");
            System.out.println("3. Libros");
            System.out.println("4. Revistas");
            System.out.println("5. Reporte");
            System.out.println("6. Reporte del día");
            System.out.println("7. Salir");
            System.out.print("Seleccione un número: ");

            if (scanner.hasNextInt()) {
                categoria = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número del 1 al 7.");
                scanner.next();
                continue;
            }

            switch (categoria) {
                case 1:
                    System.out.println("\nPelículas:");
                    System.out.println(movie);
                    System.out.println(movie_2);
                    contadorPeliculas++;
                    System.out.println("Veces vistas: " + contadorPeliculas);
                    break;
                case 2:
                    System.out.println("\nSeries:");
                    System.out.println(serie);
                    System.out.println(serie_2);
                    contadorSeries++;
                    System.out.println("Veces vistas: " + contadorSeries);
                    break;
                case 3:
                    System.out.println("\nLibros:");
                    System.out.println(book);
                    System.out.println(book_2);
                    contadorLibros++;
                    System.out.println("Veces vistas: " + contadorLibros);
                    break;
                case 4:
                    System.out.println("\nRevistas:");
                    System.out.println(magazine);
                    System.out.println(magazine_2);
                    contadorRevistas++;
                    System.out.println("Veces vistas: " + contadorRevistas);
                    break;
                case 5:
                    System.out.println("---------REPORTE:--------");
                    System.out.println(movie);
                    System.out.println(movie_2);
                    System.out.println(serie);
                    System.out.println(serie_2);
                    System.out.println(book);
                    System.out.println(book_2);
                    System.out.println(magazine);
                    System.out.println(magazine_2);
                case 6:
                    System.out.println("\nReporte del día");
                    System.out.println("Películas vistas: " + contadorPeliculas);
                    System.out.println("Series vistas: " + contadorSeries);
                    System.out.println("Libros vistos: " + contadorLibros);
                    System.out.println("Revistas vistas: " + contadorRevistas);
                    break;
                case 7:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (categoria != 7);

    }
}
