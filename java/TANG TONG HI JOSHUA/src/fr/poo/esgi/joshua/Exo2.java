package fr.poo.esgi.joshua;

/**
 * SUJET : Plus petit entier pair
 * Objectif : Coder une classe qui va permettre de renvoyer le plus petit entier pair d'un tableau d'entiers
 * A faire :
 * 1. Créer une classe
 * 2. Définissez un attribut et un constructeur pour définir le tableau d'entiers à analyser
 * 3. Codez la méthode minPair() qui va renvoyer le plus petit entier pair du tableau
 * Avec {2, 5, 1, 6} minPair() renvoie 2
 * Avec {2, -5, 1, -6} minPair() renvoie -6
 **/
public class Exo2 {

    // Déclaration d'un attribut "values" qui est un tableau d'entiers
    private int[] values;

    // Constructeur de la classe Exo2 prenant en paramètre un tableau d'entiers "values"
    public Exo2(int[] values) {
        // Initialisation de l'attribut "values" avec la valeur passée en paramètre
        this.values = values;
    }

    // Méthode "minPair" qui retourne le plus petit nombre pair du tableau "values"
    public int minPair() {
        // Initialisation de la variable "min" avec la plus grande valeur possible pour un entier
        int min = Integer.MAX_VALUE;

        // Parcours du tableau "values" avec une boucle for
        for (int i = 0; i < this.values.length; i++) {
            // Vérification si l'élément courant est pair
            if (this.values[i] % 2 == 0 && this.values[i] < min) {
                // Si l'élément courant est pair et plus petit que la valeur actuelle de "min",
                // "min" est mis à jour avec la valeur de l'élément courant
                min = this.values[i];
            }
        }

        // Retourne la valeur de "min", qui est le plus petit nombre pair du tableau "values"
        return min;
    }
}

