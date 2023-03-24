package Seminars.Units;

public class Outlaw extends InfantryClass {

    public Outlaw(String name, int x, int y) {
        super(10, 6, 2, 4, 3, 8, name, x, y);
    }

    @Override
    public String getName() {
        return "Разбойник";
    }
}
