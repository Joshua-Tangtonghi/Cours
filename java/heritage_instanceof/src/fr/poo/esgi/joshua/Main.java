package fr.poo.esgi.joshua;


public class Main {

    public static void main(String[] args) {
//        Dans la méthode main()
//        a. Instanciez les 3 classes
//        b. Affichez le résultat de l’appel aux 3 méthodes foo()
//        c. Vérifiez les types des 3 instances à l’aide du mot clé instanceof
        GrandFather grandFather = new GrandFather();
        Father father = new Father();
        Son son = new Son();

        System.out.println(grandFather.foo());
        System.out.println(father.foo());
        System.out.println(son.foo());

        System.out.println(grandFather instanceof GrandFather);
        System.out.println(father instanceof Father);
        System.out.println(son instanceof Son);
        //explique instance of
        //l'instanceof est un opérateur binaire qui retourne true si l'opérande de gauche est une instance de la classe
        //de l'opérande de droite ou une instance d'une classe dérivée de celle-ci, sinon il retourne false.
        //L'instanceof retourne false si l'opérande de gauche vaut null.
    }
}