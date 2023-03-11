package Seminars.Units;

public class Pikeman extends InfantryClass {

    public Pikeman(String name) {
        super(40, 4, 4, 10, name);
    }

    @Override
    public String getInfo() {
        return String.format("копейщик");
    }

}
