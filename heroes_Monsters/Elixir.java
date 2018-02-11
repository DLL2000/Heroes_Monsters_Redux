package heroes_Monsters;

 


public class Elixir extends Potion implements Cost
{
    private String name;
    private int cost;
    int potionCost = 2;
    int superPotionCost = 5;
    int phoenixDownCost = 10;
    public Elixir(String name, int heal, int cost)
    {
        super(name, heal);
        this.cost = cost;
    }
    public void cost(Hero h, int item)
    {
        if(item == 7)
        {
            if(h.getHide() >= potionCost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 3)
                    {
                        h.setPotion();
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
                        h.setPotion();
                    }
                    else if(h.getBagSize() >= 10)
                    {
                        System.out.println("Your bag is full");
                    }
                }
            }
            else if(h.getHide() < potionCost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
        else if(item == 8)
        {
            System.out.println("Hero wants to buy a potion.");
            if(h.getHide() >= superPotionCost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 3)
                    {
                        h.setSuperPotion();
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
                        h.setSuperPotion();
                    }
                    else if(h.getBagSize() >= 10)
                    {
                        System.out.println("Your bag is full");
                    }
                }
            }
            else if(h.getHide() < superPotionCost)
            {
                System.out.println("You do not have enough hide.");
            } 
        }
        else if(item == 9)
        {
            if(h.getHide() >= phoenixDownCost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 3)
                    {
                        h.setPhoenixDown();
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
                        h.setPhoenixDown();
                    }
                    else if(h.getBagSize() >= 10)
                    {
                        System.out.println("Your bag is full");
                    }
                }
            }
            else if(h.getHide() < phoenixDownCost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
    }
    public int getCost()
    {
        return cost;
    }
}
