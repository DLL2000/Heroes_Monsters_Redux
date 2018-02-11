package heroes_Monsters;

 

public class Farmer
{
   private int xLocation;
   private int yLocation;
   private int farmer_number;
   private boolean treasure;
   private boolean found;
   public Farmer()
   {
       xLocation = (int)(Math.random() * 14);
       yLocation = (int)(Math.random() * 14);
       farmer_number = 0;
       treasure = true;
       found = false;
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
   public void setFarmerType(int num)
   {
       farmer_number = num;
   }
   public int getFarmerType()
   {
       return farmer_number;
   }
   public boolean getTreasure()
   {
       return treasure;
   }
   public void setTreasure(boolean item)
   {
       treasure = item;
   }
   public void found()
   {
       found = true;
   }
   public boolean getFound()
   {
       return found;
   }
}