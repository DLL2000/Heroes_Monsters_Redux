package heroes_Monsters;

 

public class Item implements Cost
{
    private String name;
    private int cost;
    Item sandals = new Item("Sandals", 10);
    Item satchel = new Item("Satchel", 7);
    public Item(String name, int cost)
    {
        this.name = name;
        this.cost = cost;
    }
    public void cost(Hero h, int item)
    {
        if(item == 2)
        {
            if(h.getHide() >= cost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 3)
                    {
                        h.setSandal();
                    }
                    else if(h.getBagSize() >= 3)
                    {
                        System.out.println("Your bag is full");
                    }
                    else if(h.getSandal() == true)
                    {
                        System.out.println("You already bought this item.");
                    }
                }
                else if(h.getSatchel() == true)
                {
                    if(h.getBagSize() < 10)
                    {
                        h.setSandal();
                    }
                    else if(h.getBagSize() >= 10)
                    {
                        System.out.println("Your bag is full");
                    }
                    else if(h.getSandal() == true)
                    {
                        System.out.println("You already bought this item.");
                    }
                }
            }
            else if(h.getHide() < cost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
        if(item == 3)
        {
            if(h.getHide() >= cost)
            {
                if(h.getSatchel() == false)
                {
                    h.setSatchel();
                }
                else if(h.getSatchel() == true)
                {
                    System.out.println("You already bought this item.");
                }
            }
            else if(h.getHide() < cost)
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

