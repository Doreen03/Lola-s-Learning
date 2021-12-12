import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsPage extends World
{

    /**
     * Constructor for objects of class CreditsPage.
     * 
     */
    public CreditsPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackCredits backCredits = new BackCredits();
        addObject(backCredits,147,575);
    }
}
