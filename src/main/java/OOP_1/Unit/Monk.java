package OOP_1.Unit;

public class Monk extends Character {
    int spells;
    int potions;
    int invisibility;

    public Monk(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);

    }

    public int geSpells() {
        return 0;
    }

    public int getPotions() {
        return 0;

    }

    public int getInvisibility() {
        return 0;

    }

}
