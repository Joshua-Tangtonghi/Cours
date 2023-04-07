package td3light;

public class Lamp {

    public final static int LEVEL_MIN = 0;

    public final static int LEVEL_MAX = 5;

    private boolean isOn;

    private int level;


    public Lamp(boolean on) {
        this.isOn = on;

        if (on) level = LEVEL_MAX;
        else level = LEVEL_MIN;
    }

    public Lamp(int level) {
        switchOn(level);
    }

    public void switchOn() {
        this.isOn = true;
        this.level = LEVEL_MAX;
    }

    public void switchOn(int level) {
        if (level >= LEVEL_MIN && level <= LEVEL_MAX) {
            this.isOn = (level > LEVEL_MIN);
            this.level = level;
        }
    }

    public void switchOff() {
        this.isOn = false;
        this.level = LEVEL_MIN;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        return this.getIsOn() + " - " + this.getLevel();
    }
}
