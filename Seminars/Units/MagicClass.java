package Seminars.Units;

public abstract class MagicClass extends Unit {
    protected int mana;

    public MagicClass(String character, float hp, int speed, int attack, int protection, int damage,
            int maxDamage,
            int UNIT,
            int mana, int x, int y,
            String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, UNIT, x, y, name);
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: ЗД- %.1f, СКОР- %d, АТАК- %d, БРОНЯ- %d, УРОН- %d, МАНА - %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, (this.maxDamage - this.damage) / 2,
                this.mana);
    }
}
