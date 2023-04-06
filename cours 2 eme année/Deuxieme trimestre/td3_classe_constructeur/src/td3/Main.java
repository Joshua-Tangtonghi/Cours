package td3;

public class Main {

    public static void main(String[] args) {
        Lamp malampe1 = new Lamp(false);
        Lamp malampe2 = new Lamp(5);
        Switch monInterrupteur = new Switch(malampe1,malampe2);
    }
}
