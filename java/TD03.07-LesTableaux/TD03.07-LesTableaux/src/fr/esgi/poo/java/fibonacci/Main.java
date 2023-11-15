package fr.esgi.poo.java.fibonacci;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibo = new Fibonacci();

        fibo.display(); // Les 20 valeurs sont à 0

        fibo.fill();

        fibo.display(); // Les 20 premiers nombres de Fibonacci
    }
}
