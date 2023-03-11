package Seminars.Units;

public class Peasant extends Unit {

    public Peasant(String name) {
        super(15, 3, 2, name);
    }

    @Override
    public String getInfo() {
        return String.format("крестьянин");
    }

}