package Seminars.Units;

public class Sniper extends ShooterClass {

    public Sniper(String name, int x, int y) {
        super(15, 9, 8, 10, 10, 12, name, x, y);
    }

    @Override
    public String getName() {
        return "Снайпер";
    }

}
