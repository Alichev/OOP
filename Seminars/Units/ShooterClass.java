package Seminars.Units;

import java.util.ArrayList;

public abstract class ShooterClass extends Unit {

    int ammo;

    public ShooterClass(int hp, int speed, int damage, int maxDamage, int armor, int ammo, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
        if (this.ammo > 0 && this.hp > 0) {

            Unit target = team.get(0);
            double minDistance = this.position.getDistance(team.get(0));

            for (Unit unit : team) {
                if (this.position.getDistance(unit) < minDistance) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }

            this.attack(target, this.damage, this.maxDamage);
            this.ammo--;

            for (Unit unit : friends) {
                if (unit instanceof Peasant) {
                    this.ammo++;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.ammo);
    }

    @Override
    public String getInfo() {
        return String.format("%s %s - HP: %d, БРОНЯ: %d, СТРЕЛЫ: %d", getName(), NAME, hp, armor, ammo);
    }
}