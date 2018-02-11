package heroes_Monsters;


public class Cuirass extends Armor implements Cost
{
    private String name;
    private int cost;
    int armorCost = 15;
    public Cuirass(String name, int cost, double defense)
    {
        super(defense);
        this.name = name;
        this.cost = cost;
    }
    public void cost(Hero h, int item)
    {
        if(item == 10)
        {
           if(h.getHide() >= armorCost)
           {
               if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 3)
                   {
                       Cuirass armor = new Cuirass("Breastplate", 15, 1);
                       h.gainArmor();
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
                       Cuirass armor = new Cuirass("Breastplate", 15, 1);
                       h.gainArmor();
                   }
                   else if(h.getBagSize() >= 10)
                   {
                       System.out.println("Your bag is full");
                   }
               }
           }
           else if(h.getHide() < armorCost)
           {
               System.out.println("You do not have enough hide.");
           }
        }
    }
}
