package Seminars.Units;

public class Pikeman extends InfantryClass {

    public Pikeman(String name, int x, int y) {
        super(10, 4, 1, 3, 5, 4, name, x, y);
    }

    @Override
    public String getName() {
        return "Копейщик";
    }

}
