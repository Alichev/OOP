package Seminars.Units;

public class Position {
    public int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Unit unit) {
        return Math.sqrt(Math.pow(x - unit.position.x, 2) + Math.pow(y - unit.position.y, 2));
    }
}
