package Seminars.Units;

public abstract class ShooterClass extends Unit {
    protected int arrows;

    public ShooterClass(float hp, int speed, int damage, int arrows, String name) {
        super(hp, speed, damage, name);
        this.arrows = arrows;
    }

}
