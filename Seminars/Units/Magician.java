package Seminars.Units;

public class Magician extends MagicClass {

    public Magician(String name) {
        super(50, 5, 20, 3, name);
    }

    @Override
    public void step() {
        System.out.println("Маг наложил заклинание!");
    }

    @Override
    public String getInfo() {
        return String.format("маг");
    }

}
