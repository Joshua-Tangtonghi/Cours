package fr.poo.esgi.joshua;

public class Array {

    //1 attribut “values” de type int[ ]
    private int[] values;

    //    b. 1 constante représentant la taille max du tableau à 5
    private static final int MAX_SIZE = 5;

    //    c. 1 constructeur permettant d’initialiser les valeurs du tableau int[0] = 0, int[1] = 1, ...

    public Array() {
        this.values = new int[MAX_SIZE];
        for (int i = 0; i < values.length; i++) {
            this.values[i] = i;
        }
    }

//    d. 1 méthode display() qui affichera les valeurs du tableau dans la console à l’aide
//    d’itération sur le tableau dont la taille est fourni par values.length

    public void display() {
        for (int i = 0; i < this.values.length; i++) {
            System.out.println(this.values[i]);
        }
    }


    //    e. 1 méthode add(int value) qui ajoutera la valeur passée en paramètre à la fin du tableau
    public void adding(int value) {
        if (this.values.length < MAX_SIZE) {
            this.values[this.values.length] = value;
        }
    }


    //    Créez une méthode displayWithException() qui va lister les valeurs du tableau à l’aide d’une
//    boucle infinie et en utilisant le mécanisme d’exception (ArrayIndexOutOfBoundsException)
//    pour sortir de la boucle
    public void displayWithException() {
        int i = 0;
        try {
        while (true) {

                System.out.println(this.values[i]);
                i++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("aie");
        }
    }


}
