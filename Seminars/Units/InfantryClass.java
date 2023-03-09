package Seminars.Units;

public class InfantryClass extends Unit {

    protected int stamina;

    public InfantryClass(float hp, int speed, int damage, int stamina) {
        super(hp, speed, damage);
        this.stamina = stamina;
    }

}
