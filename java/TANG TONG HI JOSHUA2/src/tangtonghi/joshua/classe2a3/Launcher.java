package tangtonghi.joshua.classe2a3;

import tangtonghi.joshua.classe2a3.part1.Book;
import tangtonghi.joshua.classe2a3.part1.BookList;
import tangtonghi.joshua.classe2a3.part1.Movie;

import java.util.Random;

public class Launcher {
//    Dans la méthode “main” de la classe "Launcher" : [6 points]
//- coder une variable nommée "books" de type BookList et l’instancier
//- appeler la méthode d’initialisation des livres
//- appeler la méthode d’affichage des livres
//- coder la simulation de location de livres pour 5 lecteurs selon le scénario suivant :
//            1. Le lecteur 1 âgé de 20 ans emprunte plusieurs livres (choisissez vous-même ce nombre).
//            2. La lectrice 2 âgée de 7 ans emprunte aussi plusieurs livres (choisissez vous-même ce nombre).
//            3. Un adulte emprunte aussi plusieurs livres (choisissez vous-même ce nombre).
//            4. Le petit de 3 ans emprunte (accompagné de sa maman) aussi plusieurs livres (choisissez vous-même ce nombre).
//            5. Une mamie passionnée de lecture emprunte aussi plusieurs livres (choisissez vous-même ce nombre).
//    Pour simuler chaque location, appeler “getFreeBook” pour chaque livre emprunté par chaque lecteur. Et ainsi de suite pour les 5 lecteurs.
//    Afficher cette simulation dans la console afin de voir la liste des livres et leur disponibilité.

    public static void main(String[] args) {
        BookList books = new BookList();
        books.initBooks();
        books.displayBooks();

        int ageLecteur1 = 20;
        int nombreLivresLecteur1 = 3;
        books.simulateRental(ageLecteur1, nombreLivresLecteur1);

        int ageLecteur2 = 7;
        int nombreLivresLecteur2 = 2;
        books.simulateRental(ageLecteur2, nombreLivresLecteur2);

        int ageLecteur3 = 35;
        int nombreLivresLecteur3 = 4;
        books.simulateRental(ageLecteur3, nombreLivresLecteur3);

        int ageLecteur4 = 3;
        int nombreLivresLecteur4 = 1;
        books.simulateRental(ageLecteur4, nombreLivresLecteur4);

        int ageLecteur5 = 70;
        int nombreLivresLecteur5 = 2;
        books.simulateRental(ageLecteur5, nombreLivresLecteur5);

        System.out.println("\nSimulation de location des livres :\n");
        books.displayBooks();


    }
}

