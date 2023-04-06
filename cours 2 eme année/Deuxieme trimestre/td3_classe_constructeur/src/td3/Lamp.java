package td3;

public class Lamp {

    public static int LEVEL_MAX = 9;
    public static int LEVEL_MIN = 0;
    private boolean isOn;

    private int level;

    public Lamp(boolean on) {
        this.isOn = on;

    }

    public Lamp(int level) {
        if (level >= LEVEL_MIN && level <= LEVEL_MAX) {
            isOn = (level > LEVEL_MIN);
            this.level = level;
        }

    }
}