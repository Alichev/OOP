package Seminars.Units;

public class Xbowman extends ShooterClass {

    public Xbowman(String name, int x, int y) {
        super(10, 4, 2, 3, 3, 6, name, x, y);
    }

    @Override
    public String getName() {
        return "Арбалетчик";
    }
}