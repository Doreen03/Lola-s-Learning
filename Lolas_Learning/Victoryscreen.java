import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victoryscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victoryscreen extends World
{

    /**
     * Constructor for objects of class Victoryscreen.
     * 
     */
    public Victoryscreen()
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
        VictoryBook victoryBook = new VictoryBook();
        addObject(victoryBook,580,275);
        VictoryText victoryText = new VictoryText();
        addObject(victoryText,573,318);
        GameOverRestart gameOverRestart = new GameOverRestart();
        addObject(gameOverRestart,105,600);
    }
}
