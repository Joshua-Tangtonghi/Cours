package fr.poo.esgi.joshua;
/**SUJET : La table de multiplication des "5"

 Objectif : Coder une classe qui va permettre d'afficher plusieurs multiples de la table des "5"

 A faire :
 1. Créer une classe
 2. Définissez un attribut et un constructeur pour définir un nombre "max" de multiples à calculer
 3. Codez la méthode multiply() qui va calculer les "max" multiples.
 4. Codez la méthode display() qui va afficher dans la console la table de multiplication pour les "max" multiples.

 Exemple de ce que l'on doit voir dans la console avec un "max" à 7 :
 5 x 0 = 0
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 7 = 35
**/
public class Exo1 {
    // déclaration de l'attribut max
    private int max;

    // définition du constructeur avec un argument max
    public Exo1(int max) {
        this.max = max; // initialisation de l'attribut max avec la valeur de l'argument max
    }

    // méthode qui prend un entier i en argument et retourne le résultat de la multiplication de 5 par i
    public int multiply(int i) {
        return 5 * i;
    }

    // méthode qui affiche la table de multiplication de 5 jusqu'à max inclus
    public void display() {
        // boucle qui parcourt les entiers de 0 à max inclus
        for (int i = 0; i <= this.max; i++) {
            // affichage de la multiplication de 5 par i avec la méthode multiply()
            System.out.println("5 x " + i + " = " + multiply(i));
        }
    }
}

