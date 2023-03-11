/**Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
 * Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. 
 * Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. 
 * Удалить ненужные методы из абстрактного класса, если такие есть. 
 * В main пройти по спискам и вызвать у всех персонажей getInfo. */

package Seminars;

import java.util.ArrayList;
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
            switch (new Random().nextInt(7)) {
                case 0:
                    firstList.add(new Peasant(getName()));
                    break;
                case 1:
                    firstList.add(new Pikeman(getName()));
                    break;
                case 2:
                    firstList.add(new Outlaw(getName()));
                    break;
                case 3:
                    firstList.add(new Magician(getName()));
                    break;
                case 4:
                    firstList.add(new Monk(getName()));
                    break;
                case 5:
                    firstList.add(new Sniper(getName()));
                    break;
                default:
                    firstList.add(new Xbowman(getName()));
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    secondList.add(new Peasant(getName()));
                    break;
                case 1:
                    secondList.add(new Pikeman(getName()));
                    break;
                case 2:
                    secondList.add(new Outlaw(getName()));
                    break;
                case 3:
                    secondList.add(new Magician(getName()));
                    break;
                case 4:
                    secondList.add(new Monk(getName()));
                    break;
                case 5:
                    secondList.add(new Sniper(getName()));
                    break;
                default:
                    secondList.add(new Xbowman(getName()));
                    break;
            }
        }

        // firstList.forEach(u -> u.getNAME());
        // secondList.forEach(u -> u.getNAME());
        System.out.println("Первая команда:");
        for (Unit u : firstList) {
            System.out.printf("%s по имени ", u.getInfo());
            u.getNAME();
        }
        System.out.println("\nВторая команда:");
        for (Unit u : secondList) {
            System.out.printf("%s по имени ", u.getInfo());
            u.getNAME();
        }

    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}