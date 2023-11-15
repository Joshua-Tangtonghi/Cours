package fr.poo.esgi.joshua;

public class Substract extends Sum{
    int a;
    int b;

    public Substract(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
    public int compute() {
        return getA() - getB();
    }

}
