package heroes_Monsters;

 

public class Potion
{
    String name;
    int heal;
    int xLocation;
    int yLocation;
    private int findPotion = 0;
    public Potion()
    {
        heal = 100;
    }
    public Potion(String name, int heal)
    {
        this.name = name;
        this.heal = heal;
    }
    public String getName()
    {
        return name;
    }
    public int getX()
    {
        return xLocation;
    }
    public int getY()
    {
        return yLocation;
    }
    public void setX(int x)
    {
        xLocation = x;
    }
    public void setY(int y)
    {
        yLocation = y;
    }
}
