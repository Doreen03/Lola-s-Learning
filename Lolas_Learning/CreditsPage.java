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
        super(1152, 648, 1);
        prepare();
    }
    
    /**
     * Prepares all the objects for the credits screen.
     */
    private void prepare()
    {
        BackCredits backCredits = new BackCredits();
        addObject(backCredits,147,575);
        CreditsBook creditsBook = new CreditsBook();
        addObject(creditsBook,585,327);
        backCredits.setLocation(150,594);
    }
}
