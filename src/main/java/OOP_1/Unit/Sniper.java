package OOP_1.Unit;

public class Sniper extends Character {
    int accuracy = 5;
    int cartridges = 5;
    int disguise = 20;

    public Sniper(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);
    }
    @Override
    public int getAttack() {
        return 15;
    }

}
