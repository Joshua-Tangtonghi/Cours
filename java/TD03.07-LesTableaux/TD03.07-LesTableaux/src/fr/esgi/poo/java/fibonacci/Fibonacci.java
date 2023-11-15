package fr.esgi.poo.java.fibonacci;

public class Fibonacci {
    private static final int MAX_ELEMENTS = 20;
    int[] fibonacci = new int[MAX_ELEMENTS];

    /**
     * Méthode de remplissage des nombres de Fibonacci dans le tableau
     */
    public void fill() {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
    }

    /**
     * Affichage des nombres de Fibonacci
     */
    public void display() {
        for (int i = 0; i < fibonacci.length; i++) { // 0..19
            System.out.println((i+1) + ": " + fibonacci[i]);
        }
    }
}
