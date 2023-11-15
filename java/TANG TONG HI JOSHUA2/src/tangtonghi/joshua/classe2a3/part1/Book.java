package tangtonghi.joshua.classe2a3.part1;

import java.util.Random;

public class Book {
//    - Chaque livre a les caractéristiques suivantes : un numéro distinct pour l'identifier, un titre, un auteur, un âge minimum pour son emprunt (3+, 6+, 10+, 13+ et 16+ ans).
//    - Y mettre les attributs nécessaires définissant les caractéristiques d'un livre (à priori 5 d’après l’énoncé) et les méthodes accesseurs correspondantes.
//    - Créer un constructeur qui va permettre d'initialiser TOUS ces attributs.
//    - Pour le titre, définissez le de cette manière "LivreX" où X est un numéro aléatoire compris entre 0 et 100 (non compris). Bref, faites simple !
//    - Pour l'auteur, définissez le de cette manière "AuteurY" où Y est un numéro aléatoire compris entre 0 et 20 (non compris). Bref, faites simple !
//Pour l'âge minimum du lecteur, il y a 5 catégories (3, 6, 10, 13 ou 16 ans) pour 30 livres. Donc définissez 6 livres par catégorie d'âge.
//- Coder une méthode "display()" permettant d'afficher dans la console :
//    Livre <id> : <Titre> de <Auteur> (âge min: <age>) = <dispo | emprunté>
//    selon que le livre est disponible à la location ou non
//    Exemple :
//    Livre 1 : Titre0 de Auteur1 (âge min: 3) = dispo
//    Livre 2 : Titre13 de Auteur19 (âge min: 16) = emprunté
//...
//    Livre 30 : Titre67 de Auteur8 (âge min: 10) = dispo


        private int id;
        private String titre;
        private String auteur;
        private int ageMinimum;
        private boolean disponible;

        public Book(int id, String titre, String auteur, int ageMinimum) {
            this.id = id;
            this.titre = titre;
            this.auteur = auteur;
            this.ageMinimum = ageMinimum;
            this.disponible = true;
        }

        public int getId() {
            return id;
        }

        public String getTitre() {
            return titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public int getAgeMinimum() {
            return ageMinimum;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

        public void display() {
            String etat = disponible ? "dispo" : "emprunté";
            System.out.println("Livre " + id + " : " + titre + " de " + auteur + " (âge min: " + ageMinimum + ") = " + etat);
        }
    }




