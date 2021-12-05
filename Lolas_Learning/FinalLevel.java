import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLevel extends World
{

    /**
     * Constructor for objects of class FinalLevel.
     * 
     */
    public FinalLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1, false);
        setBackground("WoodPanel.png");
        addObject(new ScrollingWall(),1500,450);
    }
    
    public void act()
    {
        // if (Greenfoot.getRandomNumber(150) == 2)
        // {
            // for (int i = 1; i == 1; i++)
            // {
                // addObject(new Scrolling(),1000,450);
            // }
        // }
         // if (Greenfoot.getRandomNumber(150) < 1)
        // {
            // addObject(new Scrolling(),1000,450);
        // }
    }
}
