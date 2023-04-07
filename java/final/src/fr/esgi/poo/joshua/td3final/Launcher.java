package fr.esgi.poo.joshua.td3final;

public class Launcher {
    public static void main(String[] args) {

        Launcher monLauncher = new Launcher();

        int variable = 1;
        monLauncher.updateInt(variable);
        System.out.println(variable);

        variable = monLauncher.updateAndReturnInt(variable);
        System.out.println(variable);

        Percent myPercent = new Percent(100);
        monLauncher.updatePercent(myPercent);
        System.out.println(myPercent.getEntier());

        monLauncher.updatePercentFinal(myPercent);
        System.out.println(myPercent.getEntier());
    }

    public void updateInt(int entier) {
        entier = 2;
    }

    public void updateIntFinal(final int entier) {
        // entier = 2;
    }

    public int updateAndReturnInt(int entier) {
        entier++;
        return entier;
    }

    public void updatePercent(Percent myPercent) {
        myPercent.setEntier(50);
    }

    public void updatePercentFinal(final Percent myPercent) {
        myPercent.setEntier(25);
    }


}