package Seminars.Units;

public abstract class MagicClass extends Unit {
    protected int mana;

    public MagicClass(float hp, int speed, int damage, int mana, String name) {
        super(hp, speed, damage, name);
        this.mana = mana;
    }
}
