
package Seminars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import Seminars.Units.Magician;
import Seminars.Units.Monk;
import Seminars.Units.Outlaw;
import Seminars.Units.Peasant;
import Seminars.Units.Pikeman;
import Seminars.Units.Sniper;
import Seminars.Units.Unit;
import Seminars.Units.Xbowman;

public class Program {
    public static final int GANG_SIZE = 10;
    public static ArrayList<Unit> whiteSide = new ArrayList<>();
    public static ArrayList<Unit> darkSide = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init();

        while (true) {
            ConsoleView.view();
            sc.nextLine();
            step();
        }
    }

    public static void Init() {
        for (int i = 1; i < GANG_SIZE + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Pikeman(Unit.generateName(), 1, i));
                    break;
                case 1:
                    whiteSide.add(new Magician(Unit.generateName(), 1, i));
                    break;
                case 2:
                    whiteSide.add(new Xbowman(Unit.generateName(), 1, i));
                    break;
                default:
                    whiteSide.add(new Peasant(Unit.generateName(), 1, i));
                    break;
            }

            switch (new Random().nextInt(4)) {
                case 0:
                    darkSide.add(new Outlaw(Unit.generateName(), 10, i));
                    break;
                case 1:
                    darkSide.add(new Monk(Unit.generateName(), 10, i));
                    break;
                case 2:
                    darkSide.add(new Sniper(Unit.generateName(), 10, i));
                    break;
                default:
                    darkSide.add(new Peasant(Unit.generateName(), 10, i));
                    break;
            }
        }
    }

    public static void step() {
        ArrayList<Unit> list = new ArrayList<>();

        list.addAll(darkSide);
        list.addAll(whiteSide);
        list.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit u1, Unit u2) {
                if (u1.getSpeed() == u2.getSpeed()) {
                    return 0;
                } else if (u1.getSpeed() > u2.getSpeed()) {
                    return 1;
                } else
                    return -1;
            }
        });

        for (Unit unit : list) {
            if (darkSide.contains(unit)) {
                unit.step(whiteSide, darkSide);
            } else
                unit.step(darkSide, whiteSide);
        }
    }
}