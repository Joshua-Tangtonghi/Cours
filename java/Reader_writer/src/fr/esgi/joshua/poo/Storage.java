package fr.esgi.joshua.poo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Storage {
//    Exercice : Ecrire un fichier texte et le lire
//1. Dans votre IDE, créez un nouveau projet Java nommé par exemple “TextStorage”
//            2. Définissez un nom de package
//            3. Créez une classe et y ajouter la méthode public static void main(String[ ] args) mais laissez-la
//            vide
//4. Créez une autre classe nommée Storage qui va permettre de :
//    a. Définir un nom de fichier
//    b. Définir une méthode read() de lecture de données du fichier
//    c. Définir une méthode write() d’écriture de données dans le fichier
//5. Dans la méthode main, instanciez un objet Storage pour :
//    a. Ecrire du texte dans un fichier
//    b. Lire le texte dans un fichier et l’afficher dans la console

    private String fileName;

    public Storage(String fileName) {
        this.fileName = fileName;
    }

    public String read() {
        File file = new File(this.fileName);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int character;
            String content = "";
            while ((character = fileReader.read()) != -1) {
                content += (char) character;
            }
            fileReader.close();
            return content;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String write() {
        File file = new File(this.fileName);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Hello world");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}