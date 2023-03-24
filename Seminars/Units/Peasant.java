package Seminars.Units;

public class Peasant extends Unit {

    public Peasant(String name, int x, int y) {
        super(1, 3, 1, 1, 1, name, x, y);
    }

    @Override
    public String getName() {
        return "Крестьянин";
    }
}