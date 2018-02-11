package heroes_Monsters;

 


public class Bomb implements Cost
{
    private String name;
    private int cost;
    private int damage;
    public Bomb()
    {
        name = "Bomb";
        cost = 3;
        damage = 100;
    }
    public void cost(Hero h, int item)
    {
        if(item == 1)
        {
            if(h.getHide() >= cost)
            {
                if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 3)
                   {
                       h.gainBomb();
                   }
                   else if(h.getBagSize() >= 3)
                   {
                       System.out.println("Your bag is full");
                   }
               }
               else if(h.getSatchel() == true)
               {
                   if(h.getBagSize() < 10)
                   {
                       h.gainBomb();
                   }
                   else if(h.getBagSize() >= 10)
                   {
                       System.out.println("Your bag is full");
                   }
               }
            }
            else if(h.getHide() < cost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
    }
    public String getName()
    {
        return name;
    }
    public int getCost()
    {
        return cost;
    }
}
