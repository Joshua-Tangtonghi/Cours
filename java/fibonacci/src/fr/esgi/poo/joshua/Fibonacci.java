package fr.esgi.poo.joshua;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fill();
        f.display();
    }

    int[] monTableau = new int[100];

    //remplir tableau automatiquement

    public void fill() {
        monTableau[0] = 0;
        monTableau[1] = 1;
        for (int i = 2; i < monTableau.length; i++) {
            monTableau[i] = monTableau[i - 1] + monTableau[i - 2];
        }
    }

    //afficher tableau

    public void display() {
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
    }
}
