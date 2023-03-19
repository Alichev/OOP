package Seminars.Units;

public class Peasant extends Unit {

    protected int delivery;

    public Peasant(String name, int UNIT, int x, int y) {
        super("крестьянин", 1, 3, 1, 1, 1, 1, UNIT, x, y, name);
        delivery = 1;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: ЗД- %.1f, СКОР- %d, АТАК- %d, БРОНЯ- %d, УРОН- %d, ДОСТ- %d",
                this.character, this.NAME, this.hp, this.speed, this.attack, this.protection,
                (this.maxDamage - this.damage) / 2,
                this.delivery);
    }

}