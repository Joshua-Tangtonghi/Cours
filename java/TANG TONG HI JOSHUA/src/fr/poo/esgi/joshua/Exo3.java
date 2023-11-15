package fr.poo.esgi.joshua;

/**
 * SUJET : Compteur de chaque voyelle

 * Objectif : Coder une classe qui va permettre de compter le nombre de chaque voyelle (a, e, i, o, u et y) contenue dans une chaine de caractères.

 * A faire :
 * 1. Créer une classe
 * 2. Définissez un attribut et un constructeur pour définir la chaine de caractères
 * 3. Codez une méthode qui va renvoyer pour chaque voyelle le nombre de voyelles de la chaine de caractères

 * Exemple avec "ceci est une phrase exemple" qui doit renvoyer un tableau où
 * pour le 'a' : tableau[0] = 1
 * pour le 'e' : tableau[1] = 7
 * pour le 'i' : tableau[2] = 1
 * pour le 'o' : tableau[3] = 0
 * pour le 'u' : tableau[4] = 1
 * pour le 'y' : tableau[5] = 0
 **/
public class Exo3 {

    // Attribut pour stocker la chaine de caractères
    private String sentence;

    // Constructeur pour initialiser l'attribut
    public Exo3(String sentence) {
        this.sentence = sentence;
    }

    // Méthode pour compter les voyelles et retourner un tableau avec les résultats
    public int[] countVowels() {
        // Création d'un tableau avec 6 éléments pour stocker le nombre de chaque voyelle
        int[] vowels = new int[6];
        // Définition d'une liste de voyelles pour la comparaison
        String vowelsList = "aeiouy";
        // Boucle pour parcourir chaque caractère de la chaine de caractères
        for (int i = 0; i < sentence.length(); i++) {
            // Recherche l'index du caractère dans la liste de voyelles, si non trouvé, renvoie -1
            int index = vowelsList.indexOf(sentence.charAt(i));
            // Si le caractère est une voyelle, incrémente le nombre de cette voyelle dans le tableau
            if (index != -1) {
                vowels[index]++;
            }
        }
        // Retourne le tableau avec les résultats
        return vowels;
    }
}

