package fr.esgi.joshua.poo;


import java.util.HashMap;
import java.util.Map;

public class DigitInLetter {
    private final Map<Integer, String> dico;

    public DigitInLetter() {

        dico = new HashMap<>();

        dico.put(0, "zero");
        dico.put(1, "un");
        dico.put(2, "deux");
        dico.put(3, "trois");
        dico.put(4, "quatre");
        dico.put(5, "cinq");
        dico.put(6, "six");
        dico.put(7, "sept");
        dico.put(8, "huit");
        dico.put(9, "neuf");
    }

    public void display() {
        System.out.println("Nombre de chiffres : " + dico.size());

        for (Integer i : dico.keySet()) {
            System.out.println(i + " : " + dico.get(i));
        }
    }
}
