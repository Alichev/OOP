package Seminars.Units;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Position opposite) {
        if (opposite.y == y && opposite.x == x) {
            return true;
        }
        return false;
    }

    public float getDistance(float x, float y) {
        float dx = x - this.x;
        float dy = y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
