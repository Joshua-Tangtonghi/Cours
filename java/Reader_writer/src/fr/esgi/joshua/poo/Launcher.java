package fr.esgi.joshua.poo;

public class Launcher {
    public static void main(String[] args) {
        Storage storage = new Storage("test.txt");
        storage.write();
        System.out.println(storage.read());
    }
}
