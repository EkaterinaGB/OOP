package OOP_1.Unit;

public class Character {
    protected String name;
    protected int hp;
    protected int attack;
    protected int protection;
    protected int speed;

    public Character(String name, int hp, int attack, int protection, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.protection = protection;
        this.speed = speed;

    }

    public int getAttack() {
        return 0;
    }

    public int getHp() {
        return 0;
    }

    public int getProtection() {
        return 0;
    }

    public int getSpeed() {
        return 0;
    }
}
