package Seminars.Units;

public abstract class InfantryClass extends Unit {

    public InfantryClass(String character, float hp, int speed, int attack, int protection, int damage,
            int maxDamage,
            int UNIT,
            int x, int y, String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, UNIT, x, y, name);
    }

    @Override
    public String getInfo() {
        return String.format("%s %s: ЗД- %.1f, СКОР- %d, АТАК- %d, БРОНЯ- %d, УРОН- %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, (this.maxDamage - this.damage) / 2);
    }
}
