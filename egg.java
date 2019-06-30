import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class egg extends benda
{
    /**
     * Act - do whatever the lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+4); //posisi objek EGG, kecepatan EGG = +4
        EggFall(); //lakukan method EggFall
    } 
    
    public void  EggFall()
     {
         if (atWorldEdge()) //jika objek egg berada di bawah world / melewati basket
         {
             getWorld().removeObject(this); // remove objek egg
             Greenfoot.playSound("Bubble5.mp3");
         }
     }
}
