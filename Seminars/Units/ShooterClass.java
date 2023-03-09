package Seminars.Units;

public class ShooterClass extends Unit {
    protected int arrows;

    public ShooterClass(float hp, int speed, int damage, int arrows) {
        super(hp, speed, damage);
        this.arrows = arrows;
    }

}
