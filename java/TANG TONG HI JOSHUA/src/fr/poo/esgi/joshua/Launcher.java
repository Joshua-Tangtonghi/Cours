package fr.poo.esgi.joshua;



public class Launcher {

    public static void main(String[ ] args){

        // Instanciation de l'objet Exo1 et appel de la méthode display()
        Exo1 exo1 = new Exo1(7);
        exo1.display();

        // Instanciation de l'objet Exo2 avec un tableau en paramètre et appel de la méthode minPair()
        int[] array1 = {2, 5, 1, 6};
        Exo2 analyzer1 = new Exo2(array1);
        System.out.println(analyzer1.minPair());

        // Instanciation de l'objet Exo2 avec un autre tableau en paramètre et appel de la méthode minPair()
        int[] array2 = {2, -5, 1, -6};
        Exo2 analyzer2 = new Exo2(array2);
        System.out.println(analyzer2.minPair());

        // Instanciation de l'objet Exo3 avec une chaine de caractères en paramètre et appel de la méthode countVowels()
        String str = "ceci est une phrase exemple avec des voyelles et des consonnes";
        Exo3 exo3 = new Exo3(str);
        int[] vowels = exo3.countVowels();

        // Affichage du nombre de chaque voyelle
        System.out.println("a : " + vowels[0]);
        System.out.println("e : " + vowels[1]);
        System.out.println("i : " + vowels[2]);
        System.out.println("o : " + vowels[3]);
        System.out.println("u : " + vowels[4]);
        System.out.println("y : " + vowels[5]);

    }

}



