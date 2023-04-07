package fr.esgi.poo.joshua;

public class Main {
    public static void main(String[] args) {
        CalcAlphaNum calc = new CalcAlphaNum();
        System.out.println(calc.AddAlphaNum(1, 2));
        System.out.println(calc.AddStringAlphaNum("1", "2"));
        System.out.println(calc.IncrAlphaNum(1));
        System.out.println(calc.IsEqual(1, 2));
        System.out.println(calc.IsStringEqual("1", "2"));
        System.out.println(calc.Max(1, 2, 3));
    }
}
