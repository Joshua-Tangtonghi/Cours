package fr.poo.esgi.joshua;

public class Draws {

    private final int TOTAL_DRAW = 100;
    private int[] draws = new int[TOTAL_DRAW];
    private int [] compteurFace = new int[7];

    public void rollDraws() {

        for (int i = 0; i < TOTAL_DRAW; i++) {
            Dice dice = new Dice();
            System.out.println("nombre toal de tirage=" + i);
            draws[i] = dice.roll();
            System.out.println(dice.getFaceValue());
        }
    }

    //Afficher le nombre de tirages pour chaque face
    public void afficherCompteurFace() {
        for (int i = 0; i < draws.length; i++) {
            compteurFace[draws[i]]++;
        }
        for (int i = 1; i < compteurFace.length; i++) {
            System.out.println("nombre de tirage de la face " + i + "=" + compteurFace[i]);
        }
    }
}
