package Seminars.Units;

public class Monk extends MagicClass {

    public Monk(String name, int x, int y) {
        super(30, 5, -4, -4, 7, 12, name, x, y);
    }

    @Override
    public String getName() {
        return "Монах";
    }
}
