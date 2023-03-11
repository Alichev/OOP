package Seminars.Units;

public class Outlaw extends InfantryClass {

    public Outlaw(String name) {
        super(20, 8, 12, 15, name);
    }

    @Override
    public String getInfo() {
        return String.format("разбойник");
    }

}
