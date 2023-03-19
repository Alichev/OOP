package Seminars.Units;

import java.util.ArrayList;

public abstract class ShooterClass extends Unit {
    protected int arrows;
    protected int maxArrows;

    public ShooterClass(String character, float hp, int speed, int attack, int protection, int damage, int maxDamage,
            int UNIT,
            int arrows,
            int x, int y,
            String name) {
        super(character, hp, speed, attack, protection, damage, maxDamage, UNIT, x, y, name);
        this.arrows = arrows;
        maxArrows = arrows;
    }

    @Override
    public String getInfo() {
        return String.format(
                "%s %s: ЗД- %.1f, СКОР- %d, АТАК- %d, БРОНЯ- %d, УРОН- %d, СТРЕЛЫ- %d",
                this.character,
                this.NAME, this.hp, this.speed, this.attack, this.protection, (this.maxDamage - this.damage) / 2,
                this.arrows);
    }

    // @Override
    // public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
    // if (this.arrows > 0 && this.hp > 0) {
    // System.out.println("Могу стрелять!");
    // for (Unit unit : team) {
    // if (unit.hp > 0) {
    // this.attack(unit, this.damage, this.maxDamage);
    // this.arrows--;
    // break;
    // } else
    // System.out.println("Пропуск хода");
    // }
    // }

    // for (Unit unit : friends) {
    // if (unit.getInfo().equals("крестьянин")) {
    // this.arrows++;
    // break;
    // }
    // }
    // System.out.println("Осталось стрел:" + String.valueOf(this.arrows));
    // }

    @Override
    public void step(ArrayList<Unit> heroList) {
        if (hp > 0) {
            Unit target = getTarget(heroList);
            if (target.hp == 0) {
                System.out.println("Все противники мертвы!");
            } else {
                float distToTarget = getPosition().getDistance(target.getPosition().x, target.getPosition().y);
                float minDist = UNIT - 1;
                float maxDist = (float) Math.sqrt((UNIT - 1) * (UNIT - 1) + (UNIT - 1) * (UNIT - 1));
                float attackPower = (maxDist - distToTarget) / (maxDist - minDist);
                float actualDamage = attackPower * (maxDamage - damage) + damage;

                for (Unit hero : heroList) {
                    if (hero.protection == 1) {
                        hero.protection = 0;
                        this.arrows += 1;
                        break;
                    }
                }

                if (this.arrows > 0) {
                    this.arrows -= 1;
                    target.hp -= actualDamage;
                    if (target.hp < 0) {
                        target.hp = 0;
                    }
                } else {
                    System.out.println("\nСтрелы закончились!");
                }

            }
        }
    }

    private Unit getTarget(ArrayList<Unit> heroList) {
        Unit target = heroList.get(0);
        float minDist = getPosition().getDistance(target.getPosition().x, target.getPosition().y);
        for (Unit hero : heroList) {
            float distance = getPosition().getDistance(hero.getPosition().x, hero.getPosition().y);
            if (distance < minDist && hero.hp > 0) {
                target = hero;
                minDist = distance;
            } else if (target.hp == 0 && hero.hp > 0) {
                target = hero;
                minDist = distance;
            }
        }
        return target;
    }
}
