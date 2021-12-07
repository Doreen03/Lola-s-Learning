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
        play.setLocation(553,332);
        mainMenuText.setLocation(562,123);
        CreditsMenu creditsMenu = new CreditsMenu();
        addObject(creditsMenu,1023,590);
        InstructionsMenu instructionsMenu = new InstructionsMenu();
        addObject(instructionsMenu,172,589);
        creditsMenu.setLocation(1029,587);
        mainMenuText.setLocation(638,110);
        play.setLocation(588,288);
        mainMenuText.setLocation(586,105);
        instructionsMenu.setLocation(590,431);
        creditsMenu.setLocation(592,583);
    }
}
