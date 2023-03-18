package Seminars.Units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements UnitInterface {
    protected Random rnd = new Random();

    protected final String character;
    protected float hp;
    protected int speed;
    protected int attack;
    protected int protection;
    protected int damage;
    protected int maxDamage;
    protected final String NAME;
    protected String state;
    public Position position;

    public Unit(String character, float hp, int speed, int attack, int protection, int damage, int maxDamage,
            int x, int y, String name) {
        this.character = character;
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.maxDamage = maxDamage;
        NAME = name;
        state = "Stand";
        position = new Position(x, y);
    }

    public String getNAME() {
        // System.out.println(NAME);
        return NAME;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
        System.out.println("ЗАГЛУШКА");
    }

    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public String getCharacter() {
        return this.character;
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
        if (damage < target.protection)
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
        System.out.printf("%s %s атакует %s %s\t", this.getCharacter(), this.getNAME(), target.getCharacter(),
                target.getNAME());
        System.out.printf("Нанесенный урон = %d\n", causedDamage);
        target.getDamage(causedDamage);
        System.out.printf("%s (здоровье) = %.2f\n", target.getCharacter(), target.hp);
    }

    @Override
    public String toString() {
        return character;
    }

}
