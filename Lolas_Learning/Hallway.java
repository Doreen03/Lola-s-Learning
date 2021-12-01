import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway extends World
{
    /**
     * Constructor for objects of class Hallway.
     * 
     */
    public Hallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1, false); 
        image();
        addObject(new ScrollingWall(),1500,450);
    }
    
    public void act ()
    {
        //if (scrollWall == null)
        //{
        //    for (int i = 1; i == 1; i++)
        //    {
        //        addObject(scrollWall,500,450);
        //    }
        //}
         // if (Greenfoot.getRandomNumber(150) < 1)
        // {
            // addObject(new Scrolling(),1000,450);
        // }
    }
    public void image()
    {
        setBackground("Untitled.png");
    }
}