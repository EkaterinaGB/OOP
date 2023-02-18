package OOP_1.Unit;

public class Wizard extends Character{
    int mana;

    public Wizard(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }
    public int getMana(){
        return 0;
    }
}
