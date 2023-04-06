package td3.exercice;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int a, int b, int c) {
        x = check(a);
        y = check(b);
        z = check(c);
    }

    public int check(int value) {
        if (value >= 0 && value < 5) {
            return value;
        } else {
            return 0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

}