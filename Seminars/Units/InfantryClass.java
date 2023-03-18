package Seminars.Units;

public abstract class InfantryClass extends Unit {

    public InfantryClass(String character, float hp, int speed, int attack, int protection, int damage, int maxDamage,
            int x, int y, String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, x, y, name);
    }

    @Override
    public String getInfo() {
        return String.format("%s %s: здоровье - %.1f, скорость - %d, атака - %d, броня - %d, урон - %d, макс.урон - %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, this.damage, this.maxDamage);
    }
}
