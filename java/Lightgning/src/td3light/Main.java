package td3light;

public class Main {
    public static void main(String[] args) {

        Lamp maLamp1 = new Lamp(false);
        Lamp maLamp2 = new Lamp(0);

        Switch monInterrupteur = new Switch(maLamp1, maLamp2);

        // On allume la lampe 1 & 2 avec une intensité de 3
        monInterrupteur.switchOnLamp1();
        monInterrupteur.switchOnLamp2(3);

        //Affiche l'état des lampes
        System.out.println("Lampe 1: " + maLamp1.toString());
        System.out.println("Lampe 2: " + maLamp2.toString());

        // On éteint la lampe 1
        monInterrupteur.switchOff(maLamp1);

        //Affiche l'état des lampes
        System.out.println("Lampe 1: " + maLamp1.toString());
        System.out.println("Lampe 2: " + maLamp2.toString());


        // On éteint les lampes
        monInterrupteur.switchOff();

        //Affiche l'état des lampes
        System.out.println("Lampe 1: " + maLamp1.toString());
        System.out.println("Lampe 2: " + maLamp2.toString());

        // On allume la lampe 2 avec une intensité de 4
        monInterrupteur.switchOn(maLamp2, 4);

        // Affiche l'état des lampes
        System.out.println("Lampe 1: " + maLamp1.toString());
        System.out.println("Lampe 2: " + maLamp2.toString());


        // Pour allumer la lampe 1 à 50% il faudrai passer la variable level en float/Double
    }
}