package Seminars.Units;

public abstract class MagicClass extends Unit {
    protected int mana;

    public MagicClass(String character, float hp, int speed, int attack, int protection, int damage, int maxDamage,
            int mana, int x, int y,
            String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, x, y, name);
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: здоровье - %.1f, скорость - %d, атака - %d, броня - %d, урон - %d, макс.урон - %d, мана - %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, this.damage, this.maxDamage, this.mana);
    }
}
