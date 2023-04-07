package fr.esgi.poo.joshua;

public class CalcAlphaNum {
    /**
     *     Calcule le nombre de caractères alphanumériques dans une chaîne de caractères
      */
    public int AddAlphaNum(int int1, int int2) {
        return int1 + int2;
    }

    /**
     * Calcule le nombre de caractères alphanumériques dans une chaîne de caractères
     * @param str1
     * @param str2
     * @return
     */
    public String AddStringAlphaNum(String str1, String str2) {
        return str1 + str2;
    }

    /**
     * Incrément (ou décrément) d’un entier
     */
    public int IncrAlphaNum(int int1) {
        return ++int1;
    }

    /**
     * Egalité de 2 nombres entiers
     */
    public boolean IsEqual(int int1, int int2) {
        return int1 == int2;
    }

    /**
     * Egalité entre 2 chaînes de caractères
     */
    public boolean IsStringEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    /**
     * Max entre 3 nombres entiers
     */
    public int Max(int int1, int int2, int int3) {
        return Math.max(int1, Math.max(int2, int3));
    }


}
