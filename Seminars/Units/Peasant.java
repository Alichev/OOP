package Seminars.Units;

public class Peasant extends Unit {

    protected int delivery;

    public Peasant(String name, int x, int y) {
        super("крестьянин", 1, 3, 1, 1, 1, 1, x, y, name);
        delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: здоровье - %.1f, скорость - %d, атака - %d, броня - %d, урон - %d, макс.урон - %d, доставка - %d",
                this.character, this.NAME, this.hp, this.speed, this.attack, this.protection, this.damage,
                this.maxDamage,
                this.delivery);
    }

}