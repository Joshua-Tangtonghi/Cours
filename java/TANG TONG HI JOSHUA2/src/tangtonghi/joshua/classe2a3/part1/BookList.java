package tangtonghi.joshua.classe2a3.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookList {
//    - Définir soit un tableau de Book avec une constante définissant le nombre total de Book en location (30), soit une List de Book (comme vous préférez).
//    - Définir une constante pour définir le nombre de Book par tranche d’âge (3 ans, 6 ans, 10 ans, 13 ans et 16 ans), soit 5 constantes dont la somme doit être égale à 30 (mais c’est bien sûr).
//    - Coder une méthode "initBooks()" pour initialiser les Book de la médiathèque et les stocker dans la liste (tableau ou List selon votre choix) des Book.
//    - Coder une méthode "displayBooks()" pour afficher la liste des Book avec leurs informations
//    - Coder une méthode "Book getFreeBook(int age)" qui renvoie le premier Book disponible correspondant à l'âge du lecteur (un jeune de 10 ans ne pourra emprunté un Book pour 16 ans et +)

    private static final int NOMBRE_TOTAL_Book = 30;
    private static final int Book_PAR_TRANCHE_AGE = 6;

    private List<Book> Book;

    public BookList() {
        Book = new ArrayList<>();
    }

    public void initBooks() {
        Random random = new Random();

        for (int i = 0; i < NOMBRE_TOTAL_Book; i++) {
            int id = i + 1;
            String titre = "Book" + random.nextInt(100);
            String auteur = "Auteur" + random.nextInt(20);
            int ageMinimum;

            if (i < Book_PAR_TRANCHE_AGE) {
                ageMinimum = 3;
            } else if (i < Book_PAR_TRANCHE_AGE * 2) {
                ageMinimum = 6;
            } else if (i < Book_PAR_TRANCHE_AGE * 3) {
                ageMinimum = 10;
            } else if (i < Book_PAR_TRANCHE_AGE * 4) {
                ageMinimum = 13;
            } else {
                ageMinimum = 16;
            }

            Book.add(new Book(id, titre, auteur, ageMinimum));
        }
    }

    public void displayBooks() {
        for (Book Book : Book) {
            Book.display();
        }
    }

    public Book getFreeBook(int age) {
        for (Book Book : Book) {
            if (Book.isDisponible() && Book.getAgeMinimum() <= age) {
                return Book;
            }
        }
        return null;
    }

    public void simulateRental(int age, int numberOfBooks) {
        for (int i = 0; i < numberOfBooks; i++) {
            Book livre = getFreeBook(age);
            if (livre != null) {
                livre.setDisponible(false);
            }
        }
    }
}



