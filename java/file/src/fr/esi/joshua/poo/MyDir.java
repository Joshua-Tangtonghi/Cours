package fr.esi.joshua.poo;

import java.io.File;
// Créez une autre classe nommée MyDir qui aura :
//         a. Un constructeur pour définir un répertoire d’entrée
//         b. Une méthode pour lister et afficher
//         i. les fichiers du répertoire avec leur nom et taille,
//         ii. les répertoires avec leur nom


public class MyDir {
    private String path;

    public MyDir(String path) {
        this.path = path;
    }
    //crée une méthode display() qui affiche le chemin du répertoire et leur nom et taille et les repertoires avec leur nom

    public void display() {
        if (path == null) {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Le chemin n'existe pas");
            } else {
                if (file.isDirectory()){
                    File[] files = file.listFiles();
                    if (files != null) {
                        for (int i = 0; i < files.length; i++) {
                            if(files.isp)
                        }
                            System.out.println("Le nom du fichier est : " + files[i].getName() + " et sa taille est : " + files[i].length());
                        }

                    } else {
                        System.out.println("Le chemin est : " + path);
                    }
                }

        }
    }
}
