package Seminars.Units;

public class Monk extends MagicClass {

    public Monk(String name) {
        super(30, 4, 10, 1, name);
    }

    @Override
    public void step() {
        System.out.println("Монах совершил ритуал!");
    }

    @Override
    public String getInfo() {
        return String.format("монах");
    }
}
