package fr.poo.esgi.joshua;

public class Dice {



    //Définissez 1 constante pour la valeur max du dé à 6 faces
    private static final int MAX_FACES = 6;

    private int faceValue;


    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Créez une méthode roll() qui va utiliser la méthode java.util.Random.nextInt(int) pour
     * renvoyer un nombre aléatoire correspondant à la face du dé
     */
    public int roll() {
        return this.faceValue = (int) (Math.random() * MAX_FACES) + 1;
    }
}
