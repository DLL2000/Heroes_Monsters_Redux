package heroes_Monsters;

 

public class Armor
{
    private double defense;
    public Armor()
    {
        defense = 0;
    }
    public Armor(double defense)
    {
        this.defense = defense;
    }
    public double getArmor()
    {
        return defense;
    }
    public void setArmor(double def)
    {
        defense = def;
    }
}
