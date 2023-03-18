package Seminars.Units;

import java.util.ArrayList;

public abstract class ShooterClass extends Unit {
    protected int arrows;
    protected int maxArrows;

    public ShooterClass(String character, float hp, int speed, int attack, int protection, int damage, int maxDamage,
            int arrows,
            int x, int y,
            String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, x, y, name);
        this.arrows = arrows;
        maxArrows = arrows;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: здоровье - %.1f, скорость - %d, атака - %d, броня - %d, урон - %d, макс.урон - %d, оружие - %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, this.damage, this.maxDamage, this.arrows);
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for (Unit unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage, this.maxDamage);
                    this.arrows--;
                    break;
                } else
                    System.out.println("Пропуск хода");
            }
        }

        for (Unit unit : friends) {
            if (unit.getInfo().equals("крестьянин")) {
                this.arrows++;
                break;
            }
        }
        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));
    }
}
