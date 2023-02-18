package OOP_1;

import OOP_1.Unit.Crossbowman;
import OOP_1.Unit.Fermer;
import OOP_1.Unit.Mag;
import OOP_1.Unit.Monk;
import OOP_1.Unit.Outlaw;
import OOP_1.Unit.Sniper;
import OOP_1.Unit.Spearman;

public class Main {
    public static void main(String[] args) {
        Crossbowman crossbowman1 = new Crossbowman("Strelok", 100, 50, 20, 30);
        Fermer fermer1 = new Fermer("Ivan", 100, 1, 1, 1);
        Mag mag1 = new Mag("Eliphas", 100, 30, 40, 50);
        Monk monk1 = new Monk("Monax", 100, 50, 20, 30);
        Outlaw outlaw1 = new Outlaw("Robin", 100, 50, 30, 50);
        Sniper sniper1 = new Sniper("Huskarr", 100, 30, 40, 20);
        Spearman spearman1 = new Spearman("Dis", 100, 20, 40, 30);
    }
}
