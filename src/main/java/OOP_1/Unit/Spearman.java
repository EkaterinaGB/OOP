package OOP_1.Unit;

public class Spearman extends Character {
    int ndurance;
    int spear_possession;
    int ability_to_keep_formation;

    public Spearman(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);

    }

    public int getSpearPossession() {
        return 0;
    }
}
