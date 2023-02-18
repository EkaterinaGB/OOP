package OOP_1.Unit;

public class Outlaw extends Character{
    int stealth;
    int theft;
    public Outlaw(String name, int hp, int attack, int protection, int speed) {
        super(name, hp, attack, protection, speed);
    }
    public int getStealth(){
        return  0;
    }
    public int getTheft(){
        return  0;
    }
}
