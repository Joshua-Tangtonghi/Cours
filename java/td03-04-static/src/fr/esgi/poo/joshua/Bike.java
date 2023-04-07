package fr.esgi.poo.joshua;

/**
 * ma classe Bike
 */
public class Bike {
    /**
     * le nombre de roue par défaut
     */
    public static int defaultWheelCount = 2;
    /**
     * le nombre de roue
     */
    public int wheelCount;

    /**
     * le label
     */
    private String label;

    /**
     * constructeur de la classe Bike
     */
    public Bike(String label) {
        this.label = label;
    }

    /**
     * affiche le nombre de roue
     *
     * @return
     */
    public boolean display() {
        System.out.println("Bike " + this.label + " has " + wheelCount + " wheels." + " Default wheel count is " + Bike.defaultWheelCount);
        return true;
    }

    public static void displayStatic(Bike mybike) {
        System.out.println("Bike " + mybike.label + " has " + mybike.wheelCount + " wheels." + " Default wheel count is " + defaultWheelCount);
    }
}
