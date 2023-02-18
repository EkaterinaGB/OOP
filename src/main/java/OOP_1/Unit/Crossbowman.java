package OOP_1.Unit;

public class Crossbowman extends Character{
    int ndurance;
    int accuracy;
    int ammunition;
    int protection;
    int speed;

    public Crossbowman(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);

    }

    public int getNdurance() {
        return 0;
    }
}
