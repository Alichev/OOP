package Seminars.Units;

import java.util.ArrayList;

public interface UnitInterface {
    void step(ArrayList<Unit> heroList);

    String getInfo();

    String getCharacter();

    Position getPosition();

}
