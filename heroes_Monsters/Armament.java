package heroes_Monsters;

 


public class Armament extends Weapon implements Cost
{
   private String name;
   private int cost;
   int shortSwordCost = 2;
   int longSwordCost = 4;
   int battleAxCost = 5;
   public Armament(String name, int min, int max, int cost)
   {
       super(name, min, max);
       this.cost = cost;
   }
   public void cost(Hero h, int item)
   {
        if(item == 4)
        {
           if(h.getHide() >= shortSwordCost)
           {
               if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 3)
                   {
                       Armament shortSword = new Armament("Short Sword", 15, 35, 2);
                       h.gainWeapon(shortSword);
                       h.setEquip(1); 
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
                       Armament shortSword = new Armament("Short Sword", 15, 35, 2);
                       h.gainWeapon(shortSword);
                       h.setEquip(1); 
                   }
                   else if(h.getBagSize() >= 10)
                   {
                       System.out.println("Your bag is full");
                   }
               }
           }
           else if(h.getHide() < shortSwordCost)
           {
               System.out.println("You do not have enough hide.");
           }
        }
        else if(item == 5)
        {
           if(h.getHide() >= longSwordCost)
           {
               if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 3)
                   {
                       Armament longSword = new Armament("Long Sword", 20, 40, 4);
                       h.gainWeapon(longSword);
                       h.setEquip(2); 
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
                       Armament longSword = new Armament("Long Sword",20, 40, 4);
                       h.gainWeapon(longSword);
                       h.setEquip(2); 
                   }
                   else if(h.getBagSize() >= 10)
                   {
                       System.out.println("Your bag is full");
                   }
               }
           }
           else if(h.getHide() < longSwordCost)
           {
               System.out.println("You do not have enough hide.");
           }
        }
        else if(item == 6)
        {
           if(h.getHide() >= battleAxCost)
           {
               if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 3)
                   {
                       Armament battleAx = new Armament("Battle Ax", 40, 70, 5);
                       h.gainWeapon(battleAx);
                       h.setEquip(3); 
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
                       Armament battleAx = new Armament("Battle Ax", 40, 70, 5);
                       h.gainWeapon(battleAx);
                       h.setEquip(3); 
                   }
                   else if(h.getBagSize() >= 10)
                   {
                       System.out.println("Your bag is full");
                   }
               }
           }
           else if(h.getHide() < battleAxCost)
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
