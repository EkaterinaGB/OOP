package OOP_1.Unit;

public class Fermer extends Character {

    int feed;
    int cartridges;

    public Fermer(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);

    }

    public int getCartriges() {
        return 10;
    }

    public int getFeed() {
        return 10;

    }
}
