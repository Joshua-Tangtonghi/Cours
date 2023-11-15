package fr.poo.esgi.joshua;

public class Ambiguous {
//    Créez une autre classe nommée Ambiguous qui aura :
//    a. Une méthode calculate(int a, long b) qui renvoie 10*a + b
//    b. Une méthode calculate(long a, int b) qui renvoie 1000*a + b

    public int calculate(int a, long b) {
        return 10 * a + (int) b;
    }

    public int calculate(long a, int b) {
        return 1000 * (int) a + b;
    }

}
