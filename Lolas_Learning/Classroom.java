import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private int levelCounter = 0;
    private int questionCounter = 1;
    
    private GreenfootImage backgroundLevel0 = new GreenfootImage("level0sample.png");
    private GreenfootImage backgroundLevel1 = new GreenfootImage("level1sample.png");
    private GreenfootImage backgroundLevel2 = new GreenfootImage("level2sample.png");
    private GreenfootImage backgroundLevel3 = new GreenfootImage("level3sample.png");
    private GreenfootImage backgroundLevel4 = new GreenfootImage("level4sample.png");
    private GreenfootImage backgroundLevel5 = new GreenfootImage("level5sample.png");
    
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        setBackground(backgroundLevel0);
        levelCounter = 0;
        questionCounter = 1;
    }
}
