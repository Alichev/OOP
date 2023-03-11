package Seminars.Units;

public abstract class InfantryClass extends Unit {

    protected int stamina;

    public InfantryClass(float hp, int speed, int damage, int stamina, String name) {
        super(hp, speed, damage, name);
        this.stamina = stamina;
    }

}
