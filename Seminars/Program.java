
package Seminars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
// import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Seminars.Units.Magician;
import Seminars.Units.Monk;
import Seminars.Units.Names;
import Seminars.Units.Outlaw;
import Seminars.Units.Peasant;
import Seminars.Units.Pikeman;
import Seminars.Units.Sniper;
import Seminars.Units.Unit;
import Seminars.Units.Xbowman;

public class Program {
    public static final int UNIT = 10;

    public static ArrayList<Unit> firstList;
    public static ArrayList<Unit> secondList;
    public static ArrayList<Unit> commonList;

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            makeStep();
            scanner.nextLine();
        }

        // for (Unit unit : firstList) {
        // System.out.printf(unit.toString());
        // System.out.printf(" %d, %d\n", unit.position.x, unit.position.y);
        // }

        // for (Unit unit : secondList) {
        // System.out.printf(unit.toString());
        // System.out.printf(" %d, %d\n", unit.position.x, unit.position.y);
        // }

    }

    private static void init() {
        firstList = new ArrayList<>();
        secondList = new ArrayList<>();
        commonList = new ArrayList<>();

        for (int i = 1; i < UNIT + 1; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    firstList.add(new Peasant(getName(), UNIT, 1, i));
                    break;
                case 1:
                    firstList.add(new Outlaw(getName(), UNIT, 1, i));
                    break;
                case 2:
                    firstList.add(new Magician(getName(), UNIT, 1, i));
                    break;
                default:
                    firstList.add(new Sniper(getName(), UNIT, 1, i));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    secondList.add(new Peasant(getName(), UNIT, UNIT, i));
                    break;
                case 1:
                    secondList.add(new Pikeman(getName(), UNIT, UNIT, i));
                    break;
                case 2:
                    secondList.add(new Monk(getName(), UNIT, UNIT, i));
                    break;
                default:
                    secondList.add(new Xbowman(getName(), UNIT, UNIT, i));
                    break;
            }
        }

        commonList.addAll(firstList);
        commonList.addAll(secondList);

        // commonList.sort(new Comparator<Unit>() {
        // @Override
        // public int compare(Unit u1, Unit u2) {
        // if (u1.getSpeed() == u2.getSpeed())
        // return 0;
        // else if (u1.getSpeed() > u2.getSpeed())
        // return 1;
        // else
        // return -1;
        // }
        // });

        // for (Unit u : commonList) {
        // System.out.printf(u.getInfo());
        // System.out.println("");
        // }

    }

    private static void makeStep() {
        HashSet<Integer> speedRates = new HashSet<>();

        for (Unit hero : commonList) {
            speedRates.add(hero.getSpeed());
        }

        ArrayList<Integer> speeds = new ArrayList<>(speedRates);
        Collections.sort(speeds, Collections.reverseOrder());

        // for (int speed : speeds) {
        // ArrayList<Unit> speedArray = new ArrayList<>();
        // for (Unit unit : commonList) {
        // if (unit.getSpeed() == speed) {
        // speedArray.add(unit);
        // }
        // }
        // Collections.shuffle(speedArray);
        // for (Unit hero : speedArray) {
        // if (hero.getNAME().equals(firstList)) {
        // hero.step(secondList);
        // } else {
        // hero.step(firstList);
        // }
        // }
        // }
    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}