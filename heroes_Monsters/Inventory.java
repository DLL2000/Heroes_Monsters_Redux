package heroes_Monsters;


public class Inventory
{
    public static void printInventory(Hero h)
    {
        if((h.getEquip() == 0) || (h.getEquip() == 1) || (h.getEquip() == 2) || (h.getEquip() == 3) ||
            (h.getArmor() == 1) || (h.getSandal() == true))
        {
            if(h.getEquip() == 1)
            {
                System.out.print("Weapon: Short Sword   ");
            }
            else if(h.getEquip() == 2)
            {
                System.out.print("Weapon: Long Sword   ");
            }
            else if(h.getEquip() == 3)
            {
                System.out.print("Weapon: Battle Ax   ");
            }
            else
            {
                System.out.print("Weapon: Dagger   ");
            }
            if(h.getArmor() == 1)
            {
                System.out.print("Equipment: Armor" + "   ");
            }
            if(h.getSandal() == true)
            {
                System.out.print("Equipment: Leather Sandals" + "   ");
            }
            System.out.println();
        }
        if((h.getBomb() > 0) || (h.getPotion() > 0) || (h.getSuperPotion() > 0) || (h.getPhoenixDown() > 0))
        {
            if(h.getBomb() > 0)
            {
                System.out.print("Bomb: " + h.getBomb() + "   ");
            }
            if(h.getPotion() > 0)
            {
                System.out.print("Potion: " + h.getPotion() + "   ");
            }
            if(h.getSuperPotion() > 0)
            {
                System.out.print("Super Potion: " + h.getSuperPotion() + "   ");
            }
            if(h.getPhoenixDown() > 0)
            {
                System.out.print("Phoenix Down: " + h.getPhoenixDown() + "   ");
            }
            System.out.println();
        }        
        System.out.println("Current Health: " + h.getHealth() + "   Hides: " + h.getHide()); 
    }
}
