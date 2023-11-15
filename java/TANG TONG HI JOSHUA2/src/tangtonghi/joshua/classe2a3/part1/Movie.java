package tangtonghi.joshua.classe2a3.part1;

import java.util.ArrayList;
import java.util.List;

public class Movie {
//    - Seuls les habitants de la commune peuvent emprunter des Movies.
//    - Chaque Movie a les caractéristiques suivantes : un numéro distinct pour l'identifier, un âge minimum à avoir pour son visionnage (tout public, interdit -12 ans et interdit -16 ans). On ne se préoccupe pas du titre, ni des acteurs ou réalisateurs.
//    - Les Movies se louent pour 2 semaines.
//    - La commune fait l'acquisition de 10 Movies.
//    - La location est gratuite, mais limitée à 1 Movie max à chaque emprunt (même si le lecteur a déjà chez lui d'autres Movies non rendus, l’application n’en tiendra pas compte).
//    - Elle doit contenir les attributs et méthodes adéquates
//    - Créer un constructeur qui va permettre d'initialiser TOUS ces attributs.
//    - Coder une méthode "display()" permettant d'afficher dans la console :
//    Film <id> : <age minimum> = <libre | emprunté>
//    selon que le film est libre à la location ou non
//
//    Exemple :
//    Film 0 : tout public = libre
//...
//    Film 3 : interdit -16 ans = emprunté
//…
//    Film 9 : interdit -12 ans  = libre

    
        private List<Movie> Movies;

        public Movie() {
            initMovies();
            Movies = new ArrayList<>();
        }

    public Movie(int i, String toutPublic) {
        
    }

    private void initMovies() {
            Movies.add(new Movie(0, "tout public"));
            Movies.add(new Movie(1, "interdit -12 ans"));
            Movies.add(new Movie(2, "interdit -16 ans"));
            // Ajouter les autres Movies...
        }

        public void displayMovies() {
            for (Movie Movie : Movies) {
                Movie.display();
            }
        }

        public Movie getFreeMovie(String age) {
            for (Movie Movie : Movies) {
                if (Movie.isDisponible() && isAgeAllowed(age, Movie.getAgeMinimum())) {
                    return Movie;
                }
            }
            return null;
        }

    private boolean isDisponible() {
    }

    private boolean isAgeAllowed(String age, String ageMinimum) {
            if (age.equals("tout public")) {
                return true;
            } else if (age.equals("interdit -12 ans") && !ageMinimum.equals("interdit -16 ans")) {
                return true;
            } else if (age.equals("interdit -16 ans") && ageMinimum.equals("interdit -16 ans")) {
                return true;
            }
            return false;
        }

        public void simulateRental(String age) {
            Movie Movie = getFreeMovie(age);
            if (Movie != null) {
                Movie.setDisponible(false);
            }
        }
    }


