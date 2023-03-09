package Seminars.Units;

public class Sniper {
    protected float hp;
    protected int speed;
    protected int damage;

    public float getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setSpeed(int speed) {
        if (speed >= 0)
            this.speed = speed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}