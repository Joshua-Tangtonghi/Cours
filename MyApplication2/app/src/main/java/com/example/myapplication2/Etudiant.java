package com.example.myapplication2;

public class Etudiant {
    private String nom,prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAge() {
        return this.age;
    }
}
