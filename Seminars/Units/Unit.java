package Seminars.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements UnitInterface {
    protected static Random r = new Random();

    public int hp;
    protected int maxHp;
    protected int speed;
    protected int damage;
    protected int maxDamage;
    protected int armor;
    protected final String NAME;
    protected Position position;

    public Unit(int hp, int speed, int damage, int maxDamage, int armor, String name, int x, int y) {
        this.hp = hp;
        this.maxHp = hp;
        this.speed = speed;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.armor = armor;
        NAME = name;
        position = new Position(x, y);
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
    }

    @Override
    public String getInfo() {
        return String.format("%s %s - HP: %d, БРОНЯ: %d", getName(), NAME, hp, armor);
    }

    public String getName() {
        return "base";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public void attack(Unit target, int damage, int maxDamage) {
        int causedDamage;
        if (damage < target.armor)
            causedDamage = damage;
        else {
            switch (new Random().nextInt(4)) {
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        target.getDamage(causedDamage);
    }

    public static String generateName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public Position getPosition() {
        return position;
    }

}