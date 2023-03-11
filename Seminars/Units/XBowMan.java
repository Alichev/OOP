package Seminars.Units;

public class Xbowman extends ShooterClass {

    public Xbowman(String name) {
        super(60, 4, 7, 12, name);
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик выстрелил!");
    }

    @Override
    public String getInfo() {
        return String.format("арбалетчик");
    }

}
