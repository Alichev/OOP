package Seminars.Units;

public class Sniper extends ShooterClass {

    public Sniper(String name) {
        super(79, 5, 6, 9, name);
    }

    @Override
    public void step() {
        System.out.println("Снайпер выстрелил!");
    }

    @Override
    public String getInfo() {
        return String.format("снайпер");
    }

}