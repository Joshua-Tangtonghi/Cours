package fr.esgi.poo.joshua;

public class Launcher {
    public static void main(String[] args) {
        Bike bike1 = new Bike("vélo 1 roue");
        bike1.wheelCount = 1;
        Bike bike2 = new Bike("vélo 2 roue");
        bike2.wheelCount = 2;
        Bike bike3 = new Bike("vélo 3 roue");
        bike3.wheelCount = 3;

        bike1.display();
        bike2.display();
        bike3.display();

        Bike.defaultWheelCount = 4;

        bike1.display();
        bike2.display();
        bike3.display();

    }
}
