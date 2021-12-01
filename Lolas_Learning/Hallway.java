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
        super(1152, 648, 1); 
    }
    
    public void act ()
    {
        if (Greenfoot.getRandomNumber(150) == 2)
        {
            for (int i = 1; i == 1; i++)
            {
                addObject(new Scrolling(),1000,450);
            }
        }
         // if (Greenfoot.getRandomNumber(150) < 1)
        // {
            // addObject(new Scrolling(),1000,450);
        // }
    }
}