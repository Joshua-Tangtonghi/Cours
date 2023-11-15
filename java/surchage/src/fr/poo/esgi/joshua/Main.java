package fr.poo.esgi.joshua;

public class Main {
    public static void main(String[] args) {

//        Essayez d’appeler la 1ère méthode calculate avec les valeurs 1 et 2
//        b. Essayez d’appeler la 2ème méthode calculate avec les valeurs 2 et 4
//        Que constatez-vous ?
        Ambiguous ambiguous = new Ambiguous();
        System.out.println(ambiguous.calculate(1L, 2));
        System.out.println(ambiguous.calculate(2, 4L));
    }
}
