package Seminars.Units;

public class Magician extends MagicClass {

    public Magician(String name, int x, int y) {
        super(30, 9, -5, -5, 12, 17, name, x, y);
    }

    @Override
    public String getName() {
        return "Маг";
    }

}
