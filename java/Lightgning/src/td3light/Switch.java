package td3light;

public class Switch {
    private final Lamp lamp1;

    private final Lamp lamp2;

    public Switch(Lamp lampA, Lamp lampB) {
        lamp1 = lampA;
        lamp2 = lampB;
    }

    public void switchOnLamp1() {
        lamp1.switchOn();
    }

    public void switchOnLamp2(Integer level) {
        lamp2.switchOn(level);
    }

    public void switchOff() {
        lamp1.switchOff();
        lamp2.switchOff();
    }

    public void switchOff(Lamp lamp) {
        lamp.switchOff();
    }


    public void switchOn(Lamp lamp, Integer level) {
        lamp.switchOn(level);
    }


}
