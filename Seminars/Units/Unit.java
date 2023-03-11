package Seminars.Units;

public abstract class Unit implements UnitInterface {
    protected float hp;
    protected int speed;
    protected int damage;
    protected final String NAME;

    public Unit(float hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    public void getNAME() {
        System.out.println(NAME);
    }

    @Override
    public void step() {
        System.out.println("Шаг");
    }

    @Override
    public String getInfo() {
        return "";
    }

}
