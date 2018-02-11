package heroes_Monsters;

 
import java.util.ArrayList;
public class Hero
{
    private int health;
    private int xLocation;
    private int yLocation;
    private Weapon weapon;
    private int equip;
    private int first;
    private int sword;
    private int check;
    private int pot;
    private int superPot;
    private int revive;
    private Elixir potion;
    private Elixir superPotion;
    private Elixir phoenixDown;
    private double armor;
    private Armor chestPlate;
    private int hides;
    private int pouch;
    private ArrayList<Object> bag = new ArrayList<Object>(); 
    private boolean satchel;
    private boolean sandals;
    private int bomb;
    private Bomb explosive;
    private String name;
    private char direction;
    private boolean end;
    public Hero()
    {
        health = 100;
        xLocation = 14;
        yLocation = 0;
        weapon = new Weapon("Sword", 10, 30);
        equip = 0;
        first = 0;
        sword = 0;
        check = 0;
        Elixir potion = new Elixir("Potion", 50, 2);
        Elixir superPotion = new Elixir("Super Potion", 100, 5);
        Elixir phoenixDown = new Elixir("Phoenix Down", 100, 10);
        armor = 0;
        chestPlate = new Armor();
        pot = 0;
        superPot = 0;
        revive = 0;
        hides = 0;
        bag.add(getWeapon());
        satchel = false;
        sandals = false;
        bomb = 0;
        explosive = new Bomb();
        direction = 'N';
        end = false;
    }
    public Weapon getWeapon()
    {
        return weapon;
    }
    public int getEquip()
    {
        return equip;
    }
    public void setEquip(int num)
    {
        equip = num;
    }
    public Weapon gainWeapon(Weapon sword)
    {
        bag.set(0, sword);
        weapon = sword;
        return weapon;
    }
    public Armor getChestPlate()
    {
        return chestPlate;
    }
    public void setChestPlate(Armor cuirass)
    {
        bag.add(cuirass);
        chestPlate = cuirass;
    }
    public int getBagSize()
    {
        return bag.size();
    }
    public boolean getSatchel()
    {
        return satchel;
    }
    public void setSatchel()
    {
        satchel = true;
    }
    public int getFirst()
    {
        return first;
    }
    public void setFirst()
    {
        first = 1;
    }
    public int getSword()
    {
        return check;
    }
    public void setSword()
    {
        check = 2;
    }
    public int getCheck()
    {
        return check;
    }
    public void setCheck()
    {
        check = 3;
    }
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int revive)
    {
        health = revive;
    }
    public int getPotion()
    {
        return pot;
    }
    public void setPotion()
    {
        bag.add(potion);
        pot++;
    }
    public int getSuperPotion()
    {
        return superPot;
    }
    public void setSuperPotion()
    {
        bag.add(superPotion);
        superPot++;
    }
    public int getPhoenixDown()
    {
        return revive;
    }
    public void setPhoenixDown()
    {
        bag.add(phoenixDown);
        revive++;
    }
    public double getArmor()
    {
        return armor;
    }
    public void gainArmor()
    {
        bag.add(chestPlate);
        armor = 1;
    }
    public void healthLoss(int damage)
    {
        health -= damage;
    }
    public void heal(int heal)
    {
        health = heal;
    }
    public void foundPotion()
    {
        pot++;
    }
    public void usedPotion()
    {
        pot--;
        bag.remove(potion);
    }
    public void usedSuperPotion()
    {
        superPot--;
        bag.remove(superPotion);
    }
    public void usedPhoenixDown()
    {
        revive--;
        bag.remove(phoenixDown);
    }
    public int getHide()
    {
        return hides;
    }
    public void addHide(int hide)
    {
        hides += hide;
    }
    public void setHide(int hide)
    {
        hides -= hide;
    }
    public void gainHides()
    {
        hides += 5;
    }
    public int getPouch()
    {
        return pouch;
    }
    public void space()
    {
        pouch -= 1;
    }
    public void setPouch(int itemPouch)
    {
        pouch = itemPouch;
    }
    public boolean getSandal()
    {
        return sandals;
    }
    public void setSandal()
    {
        bag.add(sandals);
        sandals = true;
    }
    public int getBomb()
    {
        return bomb;
    }
    public void gainBomb()
    {
        bag.add(explosive);
        bomb++;
    }
    public void useBomb()
    {
        bag.remove(explosive);
        bomb--;
    }
    public String getName()
    {
        return name;
    }
    public char getDirection()
    {
        return direction;
    }
    public void setDirection(char direction)
    {
        this.direction = direction;
    }
    public boolean getEnd()
    {
        return end;
    }
    public void setEnd()
    {
        end = true;
    }
    public int getX()
    {
        return xLocation;
    }
    public int getY()
    {
        return yLocation;
    }
    public int setX(int xPos)
    {
        xLocation = xLocation + xPos;
        return xLocation;
    }
    public int setY(int yPos)
    {
        yLocation = yLocation + yPos;
        return yLocation;
    }
        public int placeX(int xPos)
    {
        xLocation = xPos;
        return xLocation;
    }
    public int placeY(int yPos)
    {
        yLocation = yPos;
        return yLocation;
    }
    public boolean move(String input)
    {
        input = input.toLowerCase();
        boolean valid_move = false;
        int heal;
        if(input.equals("d"))
        {
            setY(1);
            if(yLocation > 14)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setY(-1);
            }
            else
            {
                valid_move = true;
                setDirection('E');
            }
        }
        else if(input.equals("s"))
        {
            setX(1);
            if(xLocation > 14)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setX(-1);
            }
            else
            {
                valid_move = true;
                setDirection('S');
            }
        }
        else if(input.equals("a"))
        {
            setY(-1);
            if(yLocation < 0)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setY(1);
            }
            else
            {
                valid_move = true;
                setDirection('W');
            }
        }
        else if(input.equals("w"))
        {
            setX(-1);
            if(xLocation < 0)
            {
                System.out.println("Error! Hero can not go off the map. Choose a valid direction (ASDW): ");
                setX(1);
            }
            else
            {
                valid_move = true;
                setDirection('N');
            }
        }
        else if(input.equals("potion"))
        {
            if(pot == 0)
            {
                System.out.println("Error! You have no more potions.");
            }
            else if(pot > 0)
            {
                heal = 50;
                heal += health;
                heal(heal);
                if(getHealth() > 100)
                {
                    setHealth(100);
                }
                bag.remove(potion);
                pot--;
                System.out.println("The potion healed you.");
            }
            else if(getHealth() == 100)
            {
                System.out.println("You are already at full health.");
            }
        }
        else if(input.equals("super potion"))
        {
            if(superPot == 0)
            {
                System.out.println("Error! You have no more super potions.");
            }
            else if(superPot > 0)
            {
                heal = 100 - health;
                heal += health;
                heal(heal);
                bag.remove(superPotion);
                superPot--;
                System.out.println("The potion healed you to full health.");
            }
            else if(getHealth() == 100)
            {
                System.out.println("You are already at full health.");
            }
        }
        else
        {
            System.out.println("Error! Choose a direction (ASDW): ");
        }
        return valid_move;
    }
}
