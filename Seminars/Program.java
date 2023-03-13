/**Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
 * Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. 
 * Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. 
 * Удалить ненужные методы из абстрактного класса, если такие есть. 
 * В main пройти по спискам и вызвать у всех персонажей getInfo. */

package Seminars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

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
    public static void main(String[] args) {

        ArrayList<Unit> firstList = new ArrayList<>();
        ArrayList<Unit> secondList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    firstList.add(new Peasant(getName()));
                    break;
                case 1:
                    firstList.add(new Outlaw(getName()));
                    break;
                case 2:
                    firstList.add(new Magician(getName()));
                    break;
                default:
                    firstList.add(new Sniper(getName()));
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    secondList.add(new Peasant(getName()));
                    break;
                case 1:
                    secondList.add(new Pikeman(getName()));
                    break;
                case 2:
                    secondList.add(new Monk(getName()));
                    break;
                default:
                    secondList.add(new Xbowman(getName()));
                    break;
            }
        }

        ArrayList<Unit> commonList = listMerge(firstList, secondList);

        commonList.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit u1, Unit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });

        for (Unit u : commonList) {
            System.out.printf(u.getInfo());
            System.out.println("");
        }

        firstList.forEach(u -> u.step(firstList, secondList));

    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    public static ArrayList<Unit> listMerge(ArrayList<Unit> list1, ArrayList<Unit> list2) {
        ArrayList<Unit> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        return list;
    }
}