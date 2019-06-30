import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color; //untuk pengaturan warna

public class methodCounter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0; // Counter default awal = 0
    public void act() 
    {
       gameOver(); //method gameOver
    }
    
    public methodCounter() //kelas methodCounter
     {
         setImage(new GreenfootImage("0", 50, Color.BLACK, Color.YELLOW)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna hitam, backgroun kuning
     }
     
     public void Counting (int hitung) // method Counting
     {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 50, Color.BLACK, Color.YELLOW)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna hitam, backgroun kuning
    }
    
    public void gameOver() //method gameOver
     {
         if (totalCount >= 100)
         {
             Greenfoot.stop();  // stop permainan
             Greenfoot.playSound("cheers.mp3");
             System.out.println("CONGRATULATION! YOU WIN!!");
         }
     }
 }
