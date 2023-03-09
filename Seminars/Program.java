/**Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
 * Для каждого сформировать список свойств и возможных действий. 
 * Напрнимер свойство скорость, действие нанести удар. 
 * Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс 
 * описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. 
 * Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
 * В основной программе создать по одному экземпляру каждого типа персонажей */

package Seminars;

import Seminars.Units.Magician;
import Seminars.Units.Monk;
import Seminars.Units.Outlaw;
import Seminars.Units.Peasant;
import Seminars.Units.Pikeman;
import Seminars.Units.Sniper;
import Seminars.Units.Xbowman;

public class Program {
    public static void main(String[] args) {
        Sniper sniper = new Sniper();
        Xbowman xBowMan = new Xbowman();
        Magician magician = new Magician();
        Monk monk = new Monk();
        Outlaw outlaw = new Outlaw();
        Pikeman pikeman = new Pikeman();
        Peasant peasant = new Peasant();
    }
}