import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Play play = new Play();
        addObject(play,580,315);
        MainMenuText mainMenuText = new MainMenuText();
        addObject(mainMenuText,1000,125);
        play.setLocation(600,330);
    }
}
