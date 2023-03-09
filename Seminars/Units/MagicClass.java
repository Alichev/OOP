package Seminars.Units;

public class MagicClass extends Unit {
    protected int mana;

    public MagicClass(float hp, int speed, int damage, int mana) {
        super(hp, speed, damage);
        this.mana = mana;
    }

}
