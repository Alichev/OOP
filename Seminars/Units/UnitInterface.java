package Seminars.Units;

import java.util.ArrayList;

public interface UnitInterface {
    void step(ArrayList<Unit> team, ArrayList<Unit> friends);

    String getInfo();
}
