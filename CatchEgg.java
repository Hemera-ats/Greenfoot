import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatchEgg extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CatchEgg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 541, 1); 
        eggjatuh(); 
        siap(); 
        bombjatuh(); 
        prepare();
    }

    public void act() //method act
    {
        if (getObjects(egg.class).isEmpty()) eggjatuh();
        if (getObjects(bomb.class).isEmpty()) bombjatuh();
    }

    private void siap() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        basket basket = new basket();
        addObject(basket, 900, 560);
        methodCounter methodCounter = new methodCounter();
        addObject(methodCounter, 57, 69);
        point point = new point();
        addObject(point, 64, 44);
        point.setLocation(59, 44);
        basket.setLocation(900, 460);
    }

    public void eggjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new egg(), Greenfoot.getRandomNumber(519),20);
        }
    }

    public void  bombjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 100)
        {
            addObject(new bomb(), Greenfoot.getRandomNumber(519),21);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

