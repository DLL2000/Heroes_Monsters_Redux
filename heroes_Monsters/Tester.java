package heroes_Monsters;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Tester
{ 
   public static void main(String args[])
   {
       Object[][] map = new Object[15][15];
       int x = 0;
       int y = 0;
       Hero hero = new Hero();
       map[hero.getX()][hero.getY()] = hero;
       Armor armor = new Armor();
       
       Farmer farmer1 = new Farmer();           
       farmer1.setFarmerType(1);
       if(map[farmer1.getX()][farmer1.getY()] != null)
       {
           while(map[farmer1.getX()][farmer1.getY()] != null)
           {
               x = (int)(Math.random() * 14);
               y = (int)(Math.random() * 14);
               farmer1.setX(x);
               farmer1.setY(y);
               farmer1.setTreasure(false);
               map[farmer1.getX()][farmer1.getY()] = farmer1;
           }
       }
       else
       {
           map[farmer1.getX()][farmer1.getY()] = farmer1;
       }
       Farmer farmer2 = new Farmer();
       farmer2.setFarmerType(2);
       if(map[farmer2.getX()][farmer2.getY()] != null)
       {
           while(map[farmer2.getX()][farmer2.getY()] != null)
           {
               x = (int)(Math.random() * 14);
               y = (int)(Math.random() * 14);
               farmer2.setX(x);
               farmer2.setY(y);
               farmer2.setTreasure(false);
               map[farmer2.getX()][farmer2.getY()] = farmer2;
           }
       }
       else
       {
           map[farmer2.getX()][farmer2.getY()] = farmer2;
       }
       Farmer farmer3 = new Farmer();
       farmer3.setFarmerType(3);
       if(map[farmer3.getX()][farmer3.getY()] != null)
       {
           while(map[farmer3.getX()][farmer3.getY()] != null)
           {
               x = (int)(Math.random() * 14);
               y = (int)(Math.random() * 14);
               farmer3.setX(x);
               farmer3.setY(y);
               farmer3.setTreasure(false);
               map[farmer3.getX()][farmer3.getY()] = farmer3;
           }
       }
       else
       {
           map[farmer3.getX()][farmer3.getY()] = farmer3;
       }
       Farmer farmer4 = new Farmer();
       farmer4.setFarmerType(4);
       if(map[farmer4.getX()][farmer4.getY()] != null)
       {
           while(map[farmer4.getX()][farmer4.getY()] != null)
           {
               x = (int)(Math.random() * 14);
               y = (int)(Math.random() * 14);
               farmer4.setX(x);
               farmer4.setY(y);
               farmer4.setTreasure(false);
               map[farmer4.getX()][farmer4.getY()] = farmer4;
           }
       }
       else
       {
           map[farmer4.getX()][farmer4.getY()] = farmer4;
       }
       Farmer farmer5 = new Farmer();
       farmer5.setFarmerType(5);
       if(map[farmer5.getX()][farmer5.getY()] != null)
       {
           while(map[farmer5.getX()][farmer5.getY()] != null)
           {
               x = (int)(Math.random() * 14);
               y = (int)(Math.random() * 14);
               farmer5.setX(x);
               farmer5.setY(y);
               farmer5.setTreasure(false);
               map[farmer5.getX()][farmer5.getY()] = farmer5;
           }
       }
       else
       {
           map[farmer5.getX()][farmer5.getY()] = farmer5;
       }
       boolean locationEmpty = false;
       Monster monster1 = new Monster("Boss 1", 1, false);
       Monster monster2 = new Monster("Boss 2", 2, false);
       Monster monster3 = new Monster("Boss 3", 3, false);
       Monster monster4 = new Monster("Final Boss", 4, false);
       
       System.out.println("Welcome to Hero & Monsters!");
       System.out.println("Walking upon a hill, the hero notices a fire in the distance...");
       System.out.println("Noticing someone appear, a nearby villager begged the hero to help them fight the monsters.");
       Map.printMap(map, hero);
       
       boolean game;
       boolean correct;
       boolean fight;
       String input;
       int old_hero_xpos;
       int old_hero_ypos;
       int run = 0;
       int health1 = 0;
       int health2 = 0;
       int health3 = 0;
       int health4 = 0;
       boolean health = true;
       int appear = 0;
       
       game = true;
       fight = true;
       
       while(game)
       {
           if((hero.getPotion() == 0) && (hero.getSuperPotion() == 0))
           {
               System.out.println("Where do you want to move? (ASDW): ");
           }
           else if((hero.getPotion() > 0) && hero.getSuperPotion() == 0)
           {
               System.out.println("What do you want to do? (ASDW || Potion): ");
           }
           else if((hero.getPotion() == 0) && hero.getSuperPotion() > 0)
           {
               System.out.println("What do you want to do? (ASDW || Super Potion): ");
           }
           else if((hero.getPotion() > 0) && hero.getSuperPotion() > 0)
           {
               System.out.println("What do you want to do? (ASDW || Potion || Super Potion): ");
           }
           Scanner choice = new Scanner(System.in);
           input = choice.nextLine(); 
           old_hero_xpos = hero.getX();
           old_hero_ypos = hero.getY();
           if((hero.move(input) == true) && (monster4.getHealth() > 0))
           {
               map[old_hero_xpos][old_hero_ypos] = null;
               Object mapObject = check(hero.getX(), hero.getY(), map, hero, monster1, monster2, monster3, monster4, farmer1, 
                                        farmer2, farmer3, farmer4, farmer5);
               if(mapObject == null)
               {
                   int probability = (int)Math.ceil(Math.random() * 100);
                   if (probability <= 10)
                   {
                        Monster monster = new Monster();
                        monster.setX(hero.getX());
                        monster.setY(hero.getY());
                        map[hero.getX()][hero.getY()] = monster;
                        mapObject = check(hero.getX(), hero.getY(), map, hero, monster1, monster2, monster3, monster4, farmer1, 
                                          farmer2, farmer3, farmer4, farmer5);
                   }
               }
               if(monster1.getAppear() == true)
               {
                   locationEmpty = false;
                   monster1 = new Monster("Boss 1", 1, false);
                   while(locationEmpty == false)
                   {
                       x = (int)(Math.random() * 14);
                       y = (int)(Math.random() * 14);
                       if(map[x][y] == null)
                       {
                           monster1.setX(x);
                           monster1.setY(y);
                           map[monster1.getX()][monster1.getY()] = monster1;
                           monster1.setVisibility(false);
                           locationEmpty = true;
                       }
                   }
                   health1 = monster1.getHealth();
               }
               if(monster2.getAppear() == true)
               {
                   locationEmpty = false;
                   monster2 = new Monster("Boss 2", 2, false);
                   while(locationEmpty == false)
                   {
                       x = (int)(Math.random() * 14);
                       y = (int)(Math.random() * 14);
                       if(map[x][y] == null)
                       {
                           monster2.setX(x);
                           monster2.setY(y);
                           map[monster2.getX()][monster2.getY()] = monster2;
                           monster2.setVisibility(false);
                           locationEmpty = true;
                       }
                   }
                   health2 = monster2.getHealth();
                   if(health1 > health2)
                   {
                       while(health == true)
                       {
                           health2 = (int)Math.ceil(Math.random() * 100 + 50);
                           if(health2 >= health1)
                           {
                               health = false;
                               monster2.setHealth(health2);
                           }
                       }
                   }
               }
               if(monster3.getAppear() == true)
               {
                   locationEmpty = false;
                   monster3 = new Monster("Boss 3", 3, false);
                   while(locationEmpty == false)
                   {
                       x = (int)(Math.random() * 14);
                       y = (int)(Math.random() * 14);
                       if(map[x][y] == null)
                       {
                           monster3.setX(x);
                           monster3.setY(y);
                           map[monster3.getX()][monster3.getY()] = monster3;
                           monster3.setVisibility(false);
                           locationEmpty = true;
                       }
                   }
                   health = true;
                   health3 = monster3.getHealth();
                   if(health2 > health3)
                   {
                       while(health == true)
                       {
                           health3 = (int)Math.ceil(Math.random() * 100 + 50);
                           if(health3 >= health2)
                           {
                               health = false;
                               monster3.setHealth(health3);
                           }
                       }
                   }
               }
               if((hero.getSatchel() == true) && (hero.getPotion() >= 3))
               {
                   monster1.setRequirement();
               }
               if(hero.getFirst() == 1)
               {
                   monster2.setRequirement();
               }
               if((hero.getSword() == 2) && (hero.getPhoenixDown() > 0))
               {
                   monster3.setRequirement();
               }
               if(hero.getHealth() <= 0)
               {
                   game = false;
               }               
               if(mapObject == hero) 
               { 
                   mapObject = null;
               } 
               if(mapObject == null)
               {
                  map[hero.getX()][hero.getY()] = hero;
               }
               else
               {
                   hero.placeX(old_hero_xpos);
                   hero.placeY(old_hero_ypos);
                   map[hero.getX()][hero.getY()] = hero;
               }
           }
           if(boss(monster1, monster2, monster3) == true)
           {
               if((condition(hero) == true) && (appear == 0))
               {
                   locationEmpty = false;
                   monster4 = new Monster("Final Boss", 4, false);
                   while(locationEmpty == false)
                   {
                       x = (int)(Math.random() * 14);
                       y = (int)(Math.random() * 14);
                       if(map[x][y] == null)
                       {
                           monster4.setX(x);
                           monster4.setY(y);
                           map[monster4.getX()][monster4.getY()] = monster4;
                           locationEmpty = true;
                       }
                   }
                   health = true;
                   health4 = monster4.getHealth();
                   if(health3 > health4)
                   {
                       while(health == true)
                       {
                           health4 = (int)Math.ceil(Math.random() * 100 + 50);
                           if(health4 >= health3)
                           {
                               health = false;
                               monster4.setHealth(health4);
                           }
                       }
                   }
                   monster4.setRequirement();
                   monster4.setVisibility(false);
                   appear = 1;
               }
               else if((condition(hero) == true) && (appear == 1))
               {
                   System.out.println("???: (" + monster4.getX() + ", " + monster4.getY() + ")");
                   System.out.println("Hero: (" + hero.getX() + "," + hero.getY()  + ")");
               }
               else
               {
                   System.out.println("The following items not checked are required to access the final boss.");
                   if(hero.getCheck() != 3)
                   {
                       System.out.println("Battle Ax");
                   }
                   else
                   {
                       System.out.println("Battle Ax: √");
                   }
                   if(hero.getArmor() == 0)
                   {
                       System.out.println("Armor");
                   }
                   else
                   {
                       System.out.println("Armor: √");
                   }
                   if(hero.getSandal() == false)
                   {
                       System.out.println("Leather Sandals");
                   }
                   else
                   {
                       System.out.println("Leather Sandals: √");
                   }
                   if(hero.getPhoenixDown() <= 3)
                   {
                       System.out.println("3 Phoenix Downs");
                   }
                   else
                   {
                       System.out.println("3 Phoenix Downs: √");
                   }
               }
           }
           Map.printMap(map, hero);
           Inventory.printInventory(hero);
           if(checkEnd(hero) == true)
           {
               System.out.println("You have finished the game!");
               game = false;
           }
       }
   }
   public static Object check(int x, int y, Object[][] map, Hero h, Monster m1, Monster m2, Monster m3, Monster m4, Farmer f1, Farmer f2,
                              Farmer f3, Farmer f4, Farmer f5)
   {
       Object mapObject = new Object();
       Weapon sword = new Weapon("Steel Sword", 20, 50);
       Armor a = new Armor();
       String input;
       int checkResult = 0;
       int actionResult = 0;
       if(((h.getX() >= 0) && (h.getX() < 15)) && ((h.getY() >= 0) && (h.getY() < 15)))
       {
           if(map[x][y] instanceof Monster == true)
           {
               Monster m = (Monster)map[x][y];
               m.setVisibility(false);
               if((m.getHealth() >= 0) && (m.getName() == null))
               {
                   System.out.println("You have encountered a monster!");
               }
               if(m.getName() == null)
               {
                   m.setRequirement();
                   actionResult = foundMon(h, m, a);
                   if(actionResult == 1 )
                   {
                       m = null;
                       mapObject = h;
                   }
                   else
                   {
                       mapObject = m;
                   }
               }
               else if(m.getRequirement() == false)
               {
                   System.out.println("You are not prepared for this foe...");
                   if(m.getType() == 1)
                   {
                       System.out.println("You require a satchel and 3 potions to defeat the giant.");
                   }
                   else if(m.getType() == 2)
                   {
                       System.out.println("You require a short sword to defeat the basilisk.");
                   }
                   else if(m.getType() == 3)
                   {
                       System.out.println("You require a long sword and phoenix down to defeat the dragon.");
                   }
               }
               else if((m.getName() != null) && (m.getRequirement() == true))
               {
                   System.out.println("The monster approaches!");
                   actionResult = foundMon(h, m, a);
                   if(actionResult == 1 )
                   {
                       m = null;
                       mapObject = h;
                   }
                   else
                   {
                       mapObject = m;
                   }
               }
           }
           else if(map[x][y] instanceof Farmer == true)
           {
               Farmer f = (Farmer)map[x][y];
               f.found();
               checkResult = foundFarmer(h, f);
               if(checkResult == 1)
               {
                   if(m1.getVisibility() == true)
                   {
                       System.out.println("Farmer: I have the directions to the giant!");
                       m1.setAppear();
                       m1.setVisibility(false);
                   }
                   else
                   {
                       System.out.println("Farmer: Please defeat the monsters!");
                   }
               }
               else if(checkResult == 2)
               {
                   if(m1.getHealth() <= 0)
                   {
                       if(m2.getVisibility() == true)
                       {
                           System.out.println("Farmer: I have the directions to the basilisk!");
                           m2.setAppear();
                           m2.setVisibility(false);
                       }
                       else
                       {
                           System.out.println("Farmer: Please defeat the monsters!");
                       }
                   }
                   else
                   {
                       System.out.println("Farmer: The giant is rampaging across town right now! Return when you defeat it.");
                   }
               }
               else if(checkResult == 3)
               {
                   boolean buy = true;
                   while(buy)
                   {
                       System.out.println("Farmer: Would like to buy something to help in your travels?" + 
                                          "\n1. Bomb (8) \t\t2. Leather Sandals (15) \t3. Satchel (7) " +
                                          "\n4. Short Sword (8) \t5. Long Sword (12) \t\t6. Battle Ax (15) " + 
                                          "\n7. Potion (5) \t\t8. Super Potion (8) \t\t9. Phoenix Down (15) " + 
                                          "\n10. Armor (15)\t\t11. Exit");
                       System.out.println("Hides: " + h.getHide());
                       Scanner shop = new Scanner(System.in);
                       System.out.println("Choose a number: ");
                       String result = shop.nextLine();
                       if((result.equals("1")) || (result.equals("2")) || (result.equals("3")) || (result.equals("4"))
                           || (result.equals("5")) || (result.equals("6")) || (result.equals("7")) || (result.equals("8"))
                           || (result.equals("9")) || (result.equals("10")))
                       {
                           int choice = Integer.valueOf(result);
                           Store.cost(h, m1, m2, m3, m4, choice);
                       }
                       else if(result.equals("11"))
                       {
                           System.out.println("You left the shop.");
                           buy = false;
                       }
                       else
                       {
                           System.out.println("Input a number (1 - 11): ");
                       }
                   }
               }
               else if(checkResult == 4)
               {
                   if(m1.getHealth() <= 0)
                   {
                       if(m2.getHealth() <= 0)
                       {
                           if(m3.getVisibility() == true)
                           {
                               System.out.println("Farmer: I have the directions to the dragon!");
                               m3.setAppear();
                               m3.setVisibility(false);
                           }
                           else
                           {
                               System.out.println("Farmer: Please defeat the monsters!");
                           }
                       }
                       else
                       {
                           System.out.println("Farmer: There is another beast lurking around the town...");
                           System.out.println("Farmer: Please return after you defeat it.");
                       }
                   }
                   else
                   {
                       System.out.println("Farmer: There is a giant rampaging across town! Return after you defeat it!");
                   }
               }
               else if(checkResult == 5)
               {
                   if((f1.getFound() == false) || (f2.getFound() == false) || (f3.getFound() == false) || 
                   (f4.getFound() == false) || (f5.getFound() == false))
                   {
                       System.out.println("Farmer: I have the location of all of the villagers!");
                       System.out.println("Farmer: Ask them for directions to where the monsters are!");
                       f1.found();
                       f2.found();
                       f3.found();
                       f4.found();
                       f5.found();
                   }
                   else
                   {
                       System.out.println("Farmer: Please defeat the monsters!");
                   }
               }
               mapObject = f;
           }
           else
           {
               mapObject = null;
           }
       }
       return mapObject;
   } 
   public static int foundMon(Hero h, Monster m, Armor a)
   { 
       int fightOutcome = 0; 
       int run = 0;
       int actionResult = 0;
       boolean continueFight = true;
       while(continueFight == true)
       {
           actionResult = action(h, m, a);
           if(actionResult == 0)
           {
               fightOutcome = 0;
               continueFight = false;
           }
           else if(actionResult == 1)
           { 
               fightOutcome = 1;
               continueFight = false;
           }
           else if(actionResult == 2)
           { 
               fightOutcome = 2;
               continueFight = false;
           }
           else if (actionResult == 3)
           {
               continueFight = true;
           }
       }
       return fightOutcome;
   }
   public static int action(Hero h, Monster m, Armor a)
   {
       int action = 0;
       boolean fight = true;
       int actionResult = 0;
       if((h.getX() == m.getX()) && (h.getY() == m.getY()) && h.getHealth() > 0)
       {
           System.out.println("Hero's health: " + h.getHealth());
           System.out.println("Monster's health: " + m.getHealth());
           if(m.getName() == null)
           {
               if(h.getEquip() == 1)
               {
                   System.out.println("Monster's attack: 10 - 25");
               }
               else if(h.getEquip() == 2)
               {
                   System.out.println("Monster's attack: 15 - 30");
               }
               else if(h.getEquip() == 3)
               {
                   System.out.println("Monster's attack: 20 - 35");
               }
               else
               {
                   System.out.println("Monster's attack: 10 - 20");
               }
           }
           else if(m.getName() != null)
           {
               if(m.getType() == 1)
               {
                   System.out.println("Giants's attack: 20 - 40");
               }
               else if(m.getType() == 2)
               {
                   System.out.println("Basilisk's attack: 25 - 40");
               }
               else if(m.getType() == 3)
               {
                   System.out.println("Dragon's attack: 30 - 45");
               }
               else if(m.getType() == 4)
               {
                   System.out.println("???'s attack: 35 - 50");
                   m.setSpeed(3);
               }
           }
           System.out.println("Monster's speed: " + m.getSpeed());
           System.out.println("What will you do? (Fight || Bomb || Potion || Run): ");
           Scanner encounter = new Scanner(System.in);
           String battle = encounter.nextLine();
           battle = battle.toLowerCase();
           if(battle.equalsIgnoreCase("fight"))
           {
               actionResult = attack(h, m, a);
               if(actionResult == 0)
               {
                   action = 0;
                   fight = false;
               }
               else if(actionResult == 1)
               {
                   action = 1;
                   fight = false;
               }
               else if(actionResult == 3)
               {
                   action = 3;
                   fight = true;
               }
           }
           else if(battle.equalsIgnoreCase("bomb"))
           {
               if(h.getBomb() == 0)
               {
                   System.out.println("Error! You have no bombs.");
                   action = 3;
                   fight = true;
               }
               else if(h.getBomb() > 0)
               {
                   m.healthLoss(100);
                   h.useBomb();
                   if(m.getType() == 0)
                   {
                       System.out.println("You have defeated the monster and got some hide.");
                       h.gainHides();
                   }
                   else if(m.getType() != 0)
                   {
                       System.out.println("The monster has been defeated!");
                       h.addHide(10);
                       if(m.getType() == 3)
                       {
                           System.out.println("Upon the defeat of the dragon a mysterious foe appeared in the distance...");
                       }
                       if(m.getType() == 4)
                       {
                           System.out.println("The mysterious foe vanished, leaving the town.");
                           System.out.println("Rejoicing, the villagers thanked the hero who left to continue on his journey.");
                           h.setEnd();
                       }
                   }
                   if(m.getType() == 4)
                   {
                       h.setEnd();
                   }
                   m.setX(-1);
                   m.setY(-1);
                   m = null;
                   action = 1;
                   fight = false;
               }
           }
           else if(battle.equalsIgnoreCase("potion"))
           {
               Scanner kind = new Scanner(System.in);
               System.out.println("(Potion || Super Potion)");
               String elixir = kind.nextLine();
               if(elixir.equalsIgnoreCase("potion"))
               {
                   if(h.getPotion() == 0)
                   {
                       System.out.println("Error! You have no potions.");
                       action = 3;
                       fight = true;
                   }
                   else if((h.getPotion() > 0) && (h.getHealth() != 100))
                   {
                       int heal = 50;
                       heal += h.getHealth();
                       h.heal(heal);
                       if(h.getHealth() > 100)
                       {
                           h.setHealth(100);
                       }
                       System.out.println("The potion healed you.");
                       h.usedPotion();
                       pass(h, m, a);
                       action = 3;
                       fight = true;
                   }
                   else if(h.getHealth() == 100)
                   {
                       System.out.println("You are already at full health.");
                       action = 3;
                       fight = true;
                   }
               }
               if(elixir.equalsIgnoreCase("super potion"))
               {
                   if(h.getPotion() == 0)
                   {
                       System.out.println("Error! You have no super potions.");
                       action = 3;
                       fight = true;
                   }
                   else if((h.getSuperPotion() > 0) && (h.getHealth() != 100))
                   {
                       int heal = 100 - h.getHealth();
                       heal += h.getHealth();
                       h.heal(heal);
                       System.out.println("The potion healed you to full health.");
                       h.usedSuperPotion();
                       pass(h, m, a);
                       action = 3;
                       fight = true;
                   }
                   else if(h.getHealth() == 100)
                   {
                       System.out.println("You are already at full health.");
                       action = 3;
                       fight = true;
                   }
               }
               else
               {
                   System.out.println("Input an action.");
                   action = 3;
                   fight = true;
               }
           }
           else if(battle.equalsIgnoreCase("run"))
           {
               actionResult = run(h, m, a);
               if(actionResult == 0)
               {
                   action = 0;
                   fight = false;
               }
               else if(actionResult == 2)
               {
                   action = 2;
                   fight = false;
               }
               else if(actionResult == 3)
               {
                   action = 3;
                   fight = true;
               }
           }
           else
           {
               System.out.println("Input an action.");
               action = 3;
               fight = true;
           }
       }
       return action;
   }
   public static int attack(Hero h, Monster m, Armor a)
   {
       int attack = 0;
       int miss = 0;
       if(h.getSandal() == true)
       { 
           if(h.getEquip() == 3)
           {
               System.out.println("Your leather sandals sped up your battle ax!");
               m.healthLoss(h.getWeapon().setDamage());
           }
           else
           {
               if(m.getSpeed() == 0)
               {
                   System.out.println("You attack the monster twice.");
                   m.healthLoss(h.getWeapon().setDamage());
                   m.healthLoss(h.getWeapon().setDamage());
               }
               if(m.getSpeed() == 1)
               {
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 95)
                   {
                       System.out.println("You attack the monster.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your attack missed.");
                   }
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 95)
                   {
                       System.out.println("The leather sandals allows you to do a follow up attack.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your follow up attack missed.");
                   }
               }
               if(m.getSpeed() == 2)
               {
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 90)
                   {
                       System.out.println("You attack the monster.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your attack missed.");
                   }
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 90)
                   {
                       System.out.println("The leather sandals allows you to do a follow up attack.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your follow up attack missed.");
                   }
               }
               if(m.getSpeed() == 3)
               {
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 85)
                   {
                       System.out.println("You attack the monster.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your attack missed.");
                   }
                   miss = (int)Math.ceil(Math.random() * 100);
                   if(miss <= 85)
                   {
                       System.out.println("The leather sandals allows you to do a follow up attack.");
                       m.healthLoss(h.getWeapon().setDamage());
                   }
                   else
                   {
                       System.out.println("Your follow up attack missed.");
                   }
               }
           }
       }
       else
       {
           if(h.getEquip() == 3)
           {
               System.out.println("You prepare for your attack...");
               pass(h, m, a);
               if(h.getHealth() > 0)
               {
                   System.out.println("...and strike!");
                   m.healthLoss(h.getWeapon().setDamage());
               }
               else
               {
                   System.out.println("... and die.");
               }
           }
           if(m.getSpeed() == 0)
           {
               m.healthLoss(h.getWeapon().setDamage());
           }
           if(m.getSpeed() == 1)
           {
               miss = (int)Math.ceil(Math.random() * 100);
               if(miss <= 95)
               {
                   m.healthLoss(h.getWeapon().setDamage());
               }
               else
               {
                   System.out.println("Your attack missed.");
               }
           }
           if(m.getSpeed() == 2)
           {
               miss = (int)Math.ceil(Math.random() * 100);
               if(miss <= 90)
               {
                   m.healthLoss(h.getWeapon().setDamage());
               }
               else
               {
                   System.out.println("Your attack missed.");
               }
           }
           if(m.getSpeed() == 3)
           {
               miss = (int)Math.ceil(Math.random() * 100);
               if(miss <= 85)
               {
                   m.healthLoss(h.getWeapon().setDamage());
               }
               else
               {
                   System.out.println("Your attack missed.");
               }
           }
       }
       if(m.getRequirement() == false)
       {
           m.preRequisite();
           System.out.println("You need certain items to defeat this foe...");
       }
       System.out.println("Monster's health: " + m.getHealth());
       System.out.println("Damage: " + (h.getWeapon().getDamage()));
       if(m.getHealth() <= 0 )
       {
           if(m.getType() == 0)
           {
               System.out.println("You have defeated the monster and got some hide.");
               h.gainHides();
           }
           else if(m.getType() != 0)
           {
               System.out.println("The monster has been defeated!");
               h.addHide(10);
           }
           if(m.getType() == 3)
           {
               System.out.println("Upon the defeat of the dragon a mysterious foe appeared in the distance...");
           }
           if(m.getType() == 4)
           {
               System.out.println("The mysterious foe vanished, leaving the town.");
               System.out.println("Rejoicing, the villagers thanked the hero who left to continue on his journey.");
               h.setEnd();
           }
           m.setX(-1);
           m.setY(-1);
           m = null;
           attack = 1;
       }
       if((m != null) && (m.getHealth() > 0))
       {
           Armor armor = new Armor();
           if(h.getArmor() == 0)
           {
               miss = (int)Math.ceil(Math.random() * 100);
               if(m.getName() == null)
               {
                   if(m.getSpeed() == 0)
                   {
                       if(miss <= 50)
                       {
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss(attack);
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 1)
                   {
                       if(miss <= 60)
                       {
                           System.out.println();
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss(attack);
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 2)
                   {
                       if(miss <= 70)
                       {
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss(attack);
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 3)
                   {
                       if(miss <= 80)
                       {
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss(attack);
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss(attack);
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
               }
               else if(m.getName() != null)
               {
                   if(m.getType() == 1)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               attack = (int)Math.ceil(Math.random() * 40 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               attack = (int)Math.ceil(Math.random() * 40 + 20);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 2)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               attack = (int)Math.ceil(Math.random() * 40 + 25);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               attack = (int)Math.ceil(Math.random() * 40 + 25);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 3)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               attack = (int)Math.ceil(Math.random() * 45 + 30);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               attack = (int)Math.ceil(Math.random() * 45 + 30);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 4)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               attack = (int)Math.ceil(Math.random() * 50 + 35);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               attack = (int)Math.ceil(Math.random() * 50 + 35);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 3)
                       {
                           if(miss <= 80)
                           {
                               attack = (int)Math.ceil(Math.random() * 50 + 35);
                               h.healthLoss(attack);
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
               }
               attack = 3;
           }
           else if(h.getArmor() == 1)
           {
               miss = (int)Math.ceil(Math.random() * 100);
               if(m.getName() == null)
               {
                   if(m.getSpeed() == 0)
                   {
                       if(miss <= 50)
                       {
                           System.out.println("Your armor blocked some of the damage.");
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 1)
                   {
                       if(miss <= 60)
                       {
                           System.out.println("Your armor blocked some of the damage.");
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 2)
                   {
                       if(miss <= 70)
                       {
                           System.out.println("Your armor blocked some of the damage.");
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
                   else if(m.getSpeed() == 3)
                   {
                       if(miss <= 80)
                       {
                           System.out.println("Your armor blocked some of the damage.");
                           if(h.getEquip() == 1)
                           {
                               attack = (int)Math.ceil(Math.random() * 25 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 2)
                           {
                               attack = (int)Math.ceil(Math.random() * 30 + 15);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else if(h.getEquip() == 3)
                           {
                               attack = (int)Math.ceil(Math.random() * 35 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               attack = (int)Math.ceil(Math.random() * 20 + 10);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
               }
               else if(m.getName() != null)
               {
                   if(m.getType() == 1)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 40 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 40 + 20);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 2)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 40 + 25);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 40 + 25);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 3)
                   {
                       if(m.getSpeed() == 1)
                       {
                           if(miss <= 60)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 45 + 30);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                       else if(m.getSpeed() == 2)
                       {
                           if(miss <= 70)
                           {
                               System.out.println("Your armor blocked some of the damage.");
                               attack = (int)Math.ceil(Math.random() * 45 + 30);
                               h.healthLoss((int)Math.ceil(attack * 2 / 3));
                           }
                           else
                           {
                               System.out.println("The monster's attack missed.");
                           }
                       }
                   }
                   else if(m.getType() == 4)
                   {
                       if(miss <= 80)
                       {
                           System.out.println("Your armor blocked some of the damage.");
                           attack = (int)Math.ceil(Math.random() * 50 + 35);
                           h.healthLoss((int)Math.ceil(attack * 2 / 3));
                       }
                       else
                       {
                           System.out.println("The monster's attack missed.");
                       }
                   }
               }
               attack = 3;
           }
       }
       if((h.getHealth() <= 0) && (h.getPhoenixDown() > 0))
       {
           h.setHealth(100);
           h.usedPhoenixDown();
           System.out.println("You were revived by using your phoenix down.");
           attack = 3;
       }
       else if((h.getHealth() <= 0) && (h.getPhoenixDown() == 0))
       {
           System.out.println("You have died.");
       }
       return attack;
   }
   public static void pass(Hero h, Monster m, Armor a)
   {
       int miss = 0;
       int attack = 0;
       Armor armor = new Armor();
       if(h.getArmor() == 0)
       {
           miss = (int)Math.ceil(Math.random() * 100);
           if(m.getSpeed() == 0)
           {
               if(miss <= 50)
               {
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss(attack);
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss(attack);
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 1)
           {
               if(miss <= 60)
               {
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss(attack);
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss(attack);
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 2)
           {
               if(miss <= 70)
               {
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss(attack);
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss(attack);
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 3)
           {
               if(miss <= 80)
               {
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss(attack);
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss(attack);
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss(attack);
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
       }
       else if(h.getArmor() == 1)
       {
           miss = (int)Math.ceil(Math.random() * 100);
           if(m.getSpeed() == 0)
           {
               if(miss <= 50)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 1)
           {
               if(miss <= 60)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 2)
           {
               if(miss <= 70)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getSpeed() == 3)
           {
               if(miss <= 80)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   if(h.getEquip() == 1)
                   {
                       attack = (int)Math.ceil(Math.random() * 25 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 2)
                   {
                       attack = (int)Math.ceil(Math.random() * 30 + 15);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else if(h.getEquip() == 3)
                   {
                       attack = (int)Math.ceil(Math.random() * 35 + 20);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
                   else
                   {
                       attack = (int)Math.ceil(Math.random() * 20 + 10);
                       h.healthLoss((int)Math.ceil(attack * 2 / 3));
                   }
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
           else if(m.getType() == 4)
           {
               if(miss <= 80)
               {
                   System.out.println("Your armor blocked some of the damage.");
                   attack = (int)Math.ceil(Math.random() * 50 + 35);
                   h.healthLoss((int)Math.ceil(attack * 2 / 3));
               }
               else
               {
                   System.out.println("The monster's attack missed.");
               }
           }
       }
   }
   public static int run(Hero h, Monster m, Armor a)
   {
       int run = 0;
       int retreat = 0;
       retreat = (int)(Math.random() * 100);
       if(h.getSandal() == true)
       {
           retreat -= 50;
       }
       if((m.getDirection() == 'N') && (h.getDirection() == 'S'))
       {
           retreat -= 100;
       }
       else if((m.getDirection() == 'N') && ((h.getDirection() == 'E') || (h.getDirection() == 'W')))
       {
           retreat -= 50;
       }
       else if((m.getDirection() == 'W') && (h.getDirection() == 'E'))
       {
           retreat -= 100;
       }
       else if((m.getDirection() == 'W') && ((h.getDirection() == 'N') || (h.getDirection() == 'S')))
       {
           retreat -= 50;
       }
       else if((m.getDirection() == 'S') && (h.getDirection() == 'N'))
       {
           retreat -= 100;
       }
       else if((m.getDirection() == 'S') && ((h.getDirection() == 'E') || (h.getDirection() == 'W')))
       {
           retreat -= 50;
       }
       else if((m.getDirection() == 'E') && (h.getDirection() == 'W'))
       {
           retreat -= 100;
       }
       else if((m.getDirection() == 'E') && ((h.getDirection() == 'N') || (h.getDirection() == 'S')))
       {
           retreat -= 50;
       }
       if(m.getSpeed() == 0)
       {
           if(retreat <= 75)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   pass(h, m, a);
                   run = 3;
               }
               else if(h.getArmor() == 1)
               {
                   pass(h, m, a);
                   run = 3;
               }
               if((h.getHealth() <= 0) && (h.getPhoenixDown() > 0))
               {
                   h.setHealth(100);
                   h.usedPhoenixDown();
                   System.out.println("You were revived by using your phoenix down.");
                   run = 3;
               }
               else if((h.getHealth() <= 0) && (h.getPhoenixDown() == 0))
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 1)
       {
           if(retreat <= 50)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   pass(h, m, a);
                   run = 3;
               }
               else if(h.getArmor() == 1)
               {
                   pass(h, m, a);
                   run = 3;
               }
               if((h.getHealth() <= 0) && (h.getPhoenixDown() > 0))
               {
                   h.setHealth(100);
                   h.usedPhoenixDown();
                   System.out.println("You were revived by using your phoenix down.");
                   run = 3;
               }
               else if((h.getHealth() <= 0) && (h.getPhoenixDown() == 0))
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 2)
       {
           if(retreat <= 25)
           {
               System.out.println("You successfully escaped.");
               run = 2;
           }
           else
           {
               System.out.println("You failed to escape.");
               if(h.getArmor() == 0)
               {
                   pass(h, m, a);
                   run = 3;
               }
               else if(h.getArmor() == 1)
               {
                   pass(h, m, a);
                   run = 3;
               }
               if((h.getHealth() <= 0) && (h.getPhoenixDown() > 0))
               {
                   h.setHealth(100);
                   h.usedPhoenixDown();
                   System.out.println("You were revived by using your phoenix down.");
                   run = 3;
               }
               else if((h.getHealth() <= 0) && (h.getPhoenixDown() == 0))
               {
                   System.out.println("You have died.");
                   run = 0;
               }
           }
       }
       else if(m.getSpeed() == 3)
       {
           System.out.println("You cannot escape.");
           if(h.getArmor() == 0)
           {
               pass(h, m, a);
               run = 3;
           }
           else if(h.getArmor() == 1)
           {
               pass(h, m, a);
               run = 3;
           }
           if((h.getHealth() <= 0) && (h.getPhoenixDown() > 0))
           {
               h.setHealth(100);
               h.usedPhoenixDown();
               System.out.println("You were revived by using your phoenix down.");
               run = 3;
           }
           else if((h.getHealth() <= 0) && (h.getPhoenixDown() == 0))
           {
               System.out.println("You have died.");
               run = 0;
           }
       }
       return run;
   }
   public static int foundFarmer(Hero h, Farmer f)
   {
       int farmer = 0;
       if((h.getX() == f.getX()) && (h.getY() == f.getY())&& (f.getFarmerType() == 1))
       {
           farmer = 1;
       }
       else if((h.getX() == f.getX()) && (h.getY() == f.getY()) && (f.getFarmerType() == 2))
       {
           farmer = 2;
       }
       else if((h.getX() == f.getX()) && (h.getY() == f.getY()) && (f.getFarmerType() == 3))
       {
           farmer = 3;
       }
       else if((h.getX() == f.getX()) && (h.getY() == f.getY()) && (f.getFarmerType() == 4))
       {
           farmer = 4;
       }
       else if((h.getX() == f.getX()) && (h.getY() == f.getY()) && (f.getFarmerType() == 5))
       {
           farmer = 5;
       }
       return farmer;
   }
   public static boolean boss(Monster m1, Monster m2, Monster m3)
   {
       boolean check = false;
       if((m1.getHealth() <= 0) && (m2.getHealth() <= 0) && (m3.getHealth() <= 0))
       {
           check = true;
       }
       return check;
   }
   public static boolean condition(Hero h)
   {
       boolean check = false;
       if((h.getPhoenixDown() >= 3) && (h.getEquip() == 3) && (h.getArmor() == 1) && (h.getSandal() == true))
       {
           check = true;
       }
       return check;
   }
   public static boolean checkEnd(Hero h)
   {
       boolean end = false;
       if(h.getEnd() == true)
       {
           end = true;
       }
       return end;
   }  
} 