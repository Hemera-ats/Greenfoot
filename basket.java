import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kereta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basket extends benda
{
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
         moveBasket();
         objectDisappear(); //method objectDisappear ketika memasuki bakset
        }
    }    
       
    public void objectDisappear() //method objectDisappear
    {
         if (canSee(egg.class))
         {
             eat(egg.class); //eat kelas objek egg
             ((methodCounter)getWorld().getObjects(methodCounter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
         }
         
         if (canSee(bomb.class))
         {
             eat(bomb.class);
             ((methodCounter)getWorld().getObjects(methodCounter.class).get(0)).Counting(-9);
         }
    }
       
    public void moveBasket()
     {
         if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
         {
             move(-7); //bergerak ke -7
         }
         if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
         {
             move(7); //bergerak ke 7
         }
     }
}

