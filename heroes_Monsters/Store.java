package heroes_Monsters;

 

public class Store
{ 
    public static void cost(Hero h, Monster m1, Monster m2, Monster m3, Monster m4, int item)
    {
        int bombCost = 8;
        int sandalCost = 15;
        int satchelCost = 7;
        int shortSwordCost = 8;
        int longSwordCost = 12;
        int battleAxCost = 15;
        int potionCost = 5;
        int superPotionCost = 8;
        int phoenixDownCost = 15;
        int armorCost = 15;
        if(item == 1)
        {
            if(h.getHide() >= bombCost)
            {
                if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 2)
                   {
                       h.setHide(8);
                       h.gainBomb();
                       System.out.println("You have bought a bomb.");
                   }
                   else if(h.getBagSize() >= 2)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
               else if(h.getSatchel() == true)
               {
                   if(h.getBagSize() < 9)
                   {
                       h.setHide(8);
                       h.gainBomb();
                       System.out.println("You have bought a bomb.");
                   }
                   else if(h.getBagSize() >= 9)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
            }
            else if(h.getHide() < bombCost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
        else if(item == 2)
        {
            if(h.getHide() >= sandalCost)
            {
                if(h.getSandal() == false)
                {
                    if(h.getSatchel() == false)
                    {
                        if(h.getBagSize() < 2)
                        {
                            h.setHide(15);
                            h.setSandal();
                            System.out.println("You have bought sandals.");
                            if((h.getPhoenixDown() >= 3) && (h.getEquip() == 3) && (h.getArmor() == 1))
                            {
                                m4.setRequirement();
                            }
                        }
                        else if(h.getBagSize() >= 2)
                        {
                            System.out.println("Your bag is full.");
                        }
                    }
                    else if(h.getSatchel() == true)
                    {
                        if(h.getBagSize() < 9)
                        {
                            h.setHide(15);
                            h.setSandal();
                            m1.setRequirement();
                            System.out.println("You have bought sandals.");
                            if((h.getPhoenixDown() >= 3) && (h.getEquip() == 3) && (h.getArmor() == 1))
                            {
                                m4.setRequirement();
                            }
                        }
                        else if(h.getBagSize() >= 9)
                        {
                            System.out.println("Your bag is full.");
                        }
                    }
                }
                else if(h.getSandal() == true)
                {
                     System.out.println("You already bought this item.");
                }
            }
            else if(h.getHide() < sandalCost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
        else if(item == 3)
        {
            if(h.getSatchel() == false)
            {
                if(h.getHide() >= satchelCost)
                {
                    h.setHide(7);
                    h.setSatchel();
                    System.out.println("You have bought a satchel.");
                }
                else if(h.getHide() < satchelCost)
                {
                    System.out.println("You do not have enough hide.");
                }   
            }
            else if(h.getSatchel() == true)
            {
                 System.out.println("You already bought this item.");
            }
        }
        else if(item == 4)
        {
           if(h.getHide() >= shortSwordCost)
           {
               if(h.getSatchel() == false)
               {
                   if(h.getBagSize() < 2)
                   {
                       h.setHide(8);
                       Armament shortSword = new Armament("Short Sword", 15, 35, 8);
                       h.gainWeapon(shortSword);
                       h.setEquip(1); 
                       h.setFirst();
                       m2.setRequirement();
                       System.out.println("You have bought a short sword.");
                   }
                   else if(h.getBagSize() >= 2)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
               else if(h.getSatchel() == true)
               {
                   if(h.getBagSize() < 9)
                   {
                       h.setHide(8);
                       Armament shortSword = new Armament("Short Sword", 15, 35, 8);
                       h.gainWeapon(shortSword);
                       h.setEquip(1); 
                       h.setFirst();
                       m2.setRequirement();
                       System.out.println("You have bought a short sword.");
                   }
                   else if(h.getBagSize() >= 9)
                   {
                       System.out.println("Your bag is full.");
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
                   if(h.getBagSize() < 2)
                   {
                       h.setHide(12);
                       Armament longSword = new Armament("Long Sword",20, 40, 12);
                       h.gainWeapon(longSword);
                       h.setEquip(2); 
                       h.setSword();
                       System.out.println("You have bought a long sword.");
                       if(h.getPhoenixDown() > 0)
                       {
                           m3.setRequirement();
                       }
                   }
                   else if(h.getBagSize() >= 2)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
               else if(h.getSatchel() == true)
               {
                   if(h.getBagSize() < 9)
                   {
                       h.setHide(12);
                       Armament longSword = new Armament("Long Sword",20, 40, 12);
                       h.gainWeapon(longSword);
                       h.setEquip(2); 
                       h.setSword();
                       System.out.println("You have bought a long sword.");
                       if(h.getPhoenixDown() > 0)
                       {
                           m3.setRequirement();
                       }
                   }
                   else if(h.getBagSize() >= 9)
                   {
                       System.out.println("Your bag is full.");
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
                   if(h.getBagSize() < 2)
                   {
                       h.setHide(15);
                       Armament battleAx = new Armament("Battle Ax", 40, 70, 15);
                       h.gainWeapon(battleAx);
                       h.setEquip(3); 
                       h.setCheck();
                       System.out.println("You have bought a battle ax.");
                       if((h.getPhoenixDown() >= 3) && (h.getSandal() == true) && (h.getArmor() == 1))
                       {
                           m4.setRequirement();
                       }
                   }
                   else if(h.getBagSize() >= 2)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
               else if(h.getSatchel() == true)
               {
                   if(h.getBagSize() < 9)
                   {
                       h.setHide(15);
                       Armament battleAx = new Armament("Battle Ax", 40, 70, 15);
                       h.gainWeapon(battleAx);
                       h.setEquip(3); 
                       h.setCheck();
                       System.out.println("You have bought a battle ax.");
                       if((h.getPhoenixDown() >= 3) && (h.getSandal() == true) && (h.getArmor() == 1))
                       {
                           m4.setRequirement();
                       }
                   }
                   else if(h.getBagSize() >= 9)
                   {
                       System.out.println("Your bag is full.");
                   }
               }
           }
           else if(h.getHide() < battleAxCost)
           {
               System.out.println("You do not have enough hide.");
           }
        }
        else if(item == 7)
        {
            if(h.getHide() >= potionCost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 2)
                    {
                        h.setHide(5);
                        h.setPotion();
                        System.out.println("You have bought a potion.");
                    }
                    else if(h.getBagSize() >= 2)
                    {
                        System.out.println("Your bag is full.");
                    }
                }
                else if(h.getSatchel() == true)
                {
                    if(h.getBagSize() < 9)
                    {
                        h.setHide(5);
                        h.setPotion();
                        System.out.println("You have bought a potion.");
                        if(h.getPotion() >= 3)
                        {
                            m1.setRequirement();
                        }
                    }
                    else if(h.getBagSize() >= 9)
                    {
                        System.out.println("Your bag is full.");
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
            if(h.getHide() >= superPotionCost)
            {
                if(h.getSatchel() == false)
                {
                    if(h.getBagSize() < 2)
                    {
                        h.setHide(8);
                        h.setSuperPotion();
                        System.out.println("You have bought a super potion.");
                    }
                    else if(h.getBagSize() >= 2)
                    {
                        System.out.println("Your bag is full.");
                    }
                }
                else if(h.getSatchel() == true)
                {
                    if(h.getBagSize() < 9)
                    {
                        h.setHide(8);
                        h.setSuperPotion();
                        System.out.println("You have bought a super potion.");
                    }
                    else if(h.getBagSize() >= 9)
                    {
                        System.out.println("Your bag is full.");
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
                    if(h.getBagSize() < 2)
                    {
                        h.setHide(15);
                        h.setPhoenixDown();
                        System.out.println("You have bought a phoenix down.");
                        if(h.getSword() == 2)
                        {
                            m3.setRequirement();
                        }
                    } 
                    else if(h.getBagSize() >= 2)
                    {
                        System.out.println("Your bag is full.");
                    }
                }
                else if(h.getSatchel() == true)
                {
                    if(h.getBagSize() < 9)
                    {
                        h.setHide(15);
                        h.setPhoenixDown();
                        System.out.println("You have bought a phoenix down.");
                        if(h.getSword() == 2)
                        {
                            m3.setRequirement();
                        }
                        if((h.getPhoenixDown() >= 3) && (h.getCheck() == 3) && (h.getArmor() == 1) && 
                           (h.getSandal() == true))
                        {
                            m4.setRequirement();
                        }
                    }
                    else if(h.getBagSize() >= 9)
                    {
                        System.out.println("Your bag is full.");
                    }
                }
            }
            else if(h.getHide() < phoenixDownCost)
            {
                System.out.println("You do not have enough hide.");
            }
        }
        else if(item == 10)
        {
           if(h.getHide() >= armorCost)
           {
               if(h.getArmor() == 0)
               {
                   if(h.getSatchel() == false)
                   {
                       if(h.getBagSize() < 2)
                       {
                           h.setHide(15);
                           Cuirass armor = new Cuirass("Breastplate", 15, 1);
                           h.gainArmor();
                           h.setChestPlate(armor);
                           System.out.println("You have bought armor.");
                       }
                       else if(h.getBagSize() >= 2)
                       {
                           System.out.println("Your bag is full.");
                       }
                   }
                   else if(h.getSatchel() == true)
                   {
                       if(h.getBagSize() < 9)
                       {
                           h.setHide(15);
                           Cuirass armor = new Cuirass("Breastplate", 15, 1);
                           h.gainArmor();
                           System.out.println("You have bought armor.");
                           if((h.getPhoenixDown() >= 3) && (h.getCheck() == 3) && (h.getSandal() == true))
                           {
                               m4.setRequirement();
                           }
                       }
                       else if(h.getBagSize() >= 9)
                       {
                           System.out.println("Your bag is full.");
                       }
                   }
               }
               else if(h.getArmor() == 1)
               {
                   System.out.println("You have already bought this item.");
               }
           }
           else if(h.getHide() < armorCost)
           {
               System.out.println("You do not have enough hide.");
           }
        }
    }
}
