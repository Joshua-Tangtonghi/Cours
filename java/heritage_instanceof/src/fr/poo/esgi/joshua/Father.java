package fr.poo.esgi.joshua;

public class Father {

//    Ajoutez une méthode foo() dans chacune des classes qui renvoie le nombre de lettres du nom
//    de la classe
    public int foo() {
        return this.getClass().getSimpleName().length();
    }
}
