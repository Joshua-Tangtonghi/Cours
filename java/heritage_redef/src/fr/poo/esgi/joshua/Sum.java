package fr.poo.esgi.joshua;

public class Sum {
//    Créez une classe nommée Sum qui aura :
//    a. Deux attributs entiers
//    b. Un constructeur pour initialiser les 2 attributs
//    c. Une méthode compute() pour calculer l’addition des 2 attributs

    public int compute() {
        return this.a + this.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }


}
