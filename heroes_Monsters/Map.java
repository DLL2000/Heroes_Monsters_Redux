package heroes_Monsters;

 

public class Map
{
   public static void printMap(Object[][] map, Hero h)
   {
       int hero_x = 0;
       int hero_y = 0;
       boolean visible[][] = new boolean[15][15];
       int i;
       int j;
       for(i = 0; i < 15; i++)
       {
           for(j = 0; j < 15; j++)
           {
               visible[i][j] = false;
               if(map[i][j] instanceof Hero)
               {
                   hero_x = i;
                   hero_y = j;
               }
           }
           
       }
       int startX = hero_x - 2;
       if(startX < 0)
       {
           startX = 0;
       }
       int endX = hero_x + 2;
       if(endX > 15)
       {
           endX = 15;
       }
       int startY = hero_y - 2;
       if(startY < 0)
       {
           startY = 0;
       }
       int endY = hero_y + 2;
       if(endY > 15)
       {
           endY = 15;
       }
       for(i = startX; i < endX; i++)
       {
           for(j = startY; j < endY; j++)
           {
               visible[i][j] = true;
           }
       }
       for(i = 0; i < 15; i++)
       {
           for(j = 0; j < 15; j++)
           {
               if(map[i][j] == null)
               {
                   System.out.print("0 ");
               }
               else if (map[i][j] instanceof Hero)
               {
                   System.out.print("H ");
               
               }
               else if(map[i][j] instanceof Monster == true)
               {
                   Monster m = (Monster)map[i][j];
                   if(m.getVisibility() == true)
                   {
                       System.out.print("0 ");
                   }
                   else if(m.getVisibility() == false)
                   {
                       System.out.print("M ");
                   }
               }
               else if (map[i][j] instanceof Farmer == true)
               {
                   Farmer f = (Farmer)map[i][j];
                   if((visible[i][j] == false) && (f.getFound() == false))
                   {
                       System.out.print("0 ");
                   }
                   else 
                   {
                       System.out.print("F ");
                   }
               }
               else 
               { 
                   System.out.print("? ");
               }
           }
           System.out.println();
       }
   }
}

