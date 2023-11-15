package fr.poo.esgi.joshua;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum(1, 2);
        System.out.println(sum.compute());

        Substract substract = new Substract(1, 2);
        System.out.println(substract.compute());

        Multiply multiply = new Multiply(1, 2);
        System.out.println(multiply.compute());

        System.out.println(sum instanceof Sum);
        System.out.println(substract instanceof Substract);
        System.out.println(multiply instanceof Multiply);
    }
}
