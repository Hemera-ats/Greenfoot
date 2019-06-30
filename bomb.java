import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bomb extends benda
{
    /**
     * Act - do whatever the bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY()+5);
       meledak();
    }    
    
    public void meledak() //method meledak
    {
         if (canSee(basket.class)) //bila melihat kelas basket
         {
             ((methodCounter)getWorld().getObjects(methodCounter.class).get(0)).Counting(-1); //kelas Count dikurangi sebanyak 1 poin
             Greenfoot.playSound("Bomb+1.mp3");
         }
         
         if (atWorldEdge())  //bila objek berada di bawah world
         {
             getWorld().removeObject(this); //remove object
         }
    }
        
}
