package heroes_Monsters;

 public class Monster
{
    private int health;
    private int speed;
    private int attack;
    private String name;
    private int type;
    private int xLocation;
    private int yLocation;
    private char direction;
    private int random;
    private boolean requirement;
    private boolean invisible;
    private boolean appear;
    public Monster()
    {
        health = (int)Math.ceil(Math.random() * 50);
        speed = (int)Math.floor(Math.random() * 4);
        type = 0;
        random = (int)Math.floor(Math.random() * 3);
        if(random == 0)
        {
            direction = 'N';
        }
        else if(random == 1)
        {
            direction = 'W';
        }
        else if(random == 2)
        {
            direction = 'S';
        }
        else if(random == 3)
        {
            direction = 'E';
        }
        requirement = true;
        invisible = true;
    }
    public Monster(String name, int type, boolean requirement)
    {
        health = (int)Math.ceil(Math.random() * 100 + 50);
        speed = (int)Math.ceil(Math.random() * 2);
        random = (int)Math.floor(Math.random() * 3);
        if(random == 0)
        {
            direction = 'N';
        }
        else if(random == 1)
        {
            direction = 'W';
        }
        else if(random == 2)
        {
            direction = 'S';
        }
        else if(random == 3)
        {
            direction = 'E';
        }
        invisible = true;
        appear = false;
        this.name = name;
        this.type = type;
        this.requirement = requirement;
    }
    public void healthLoss(int damage)
    {
        health -= damage;
    }
    public int getType()
    {
        return type;
    }
    public boolean getRequirement()
    {
        return requirement;
    }
    public void setRequirement()
    {
        requirement = true;
    }
    public void preRequisite()
    {
        if(requirement == false)
        {
            setHealth(100);
        }
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
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public char getDirection()
    {
        return direction;
    }
    public void setDirection(char direction)
    {
        this.direction = direction;
    }
    public String getName()
    {
        return name;
    }
    public boolean getVisibility()
    {
        return invisible;
    }
    public void setVisibility(boolean visible)
    {
        invisible = visible;
    }
    public boolean getAppear()
    {
        return appear;
    }
    public void setAppear()
    {
        appear = true;
    }
}
