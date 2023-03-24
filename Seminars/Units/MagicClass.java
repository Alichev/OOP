package Seminars.Units;

public abstract class MagicClass extends Unit {

    int mana;

    public MagicClass(int hp, int speed, int damage, int maxDamage, int armor, int mana, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.mana = mana;
    }

}