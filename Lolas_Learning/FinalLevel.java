import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalLevel extends World
{
    public static int grade = 100;
    private int time = 850;
    
    private GreenfootImage scoreboard1 = new GreenfootImage("grade100.png");
    private GreenfootImage scoreboard2 = new GreenfootImage("grade90.png");
    private GreenfootImage scoreboard3 = new GreenfootImage("grade80.png");
    private GreenfootImage scoreboard4 = new GreenfootImage("grade70.png");
    private GreenfootImage scoreboard5 = new GreenfootImage("grade60.png");
    private GreenfootImage scoreboard6 = new GreenfootImage("grade50.png");
    private GreenfootImage scoreboard7 = new GreenfootImage("grade40.png");
    private GreenfootImage scoreboard8 = new GreenfootImage("grade30.png");
    private GreenfootImage scoreboard9 = new GreenfootImage("grade20.png");
    private GreenfootImage scoreboard10 = new GreenfootImage("grade10.png");
    private GreenfootImage scoreboard11 = new GreenfootImage("grade0.png");
    
    /**
     * Constructor for objects of class FinalLevel.
     * 
     */
    public FinalLevel()
    {    
        super(1152, 480, 1, false);
        addObject(new ScrollingWall(),1450,195);
        prepare();
        createBoundaries();
        showTime();
    }
    
    /**
     * This method randomizes the location of the obstacles
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject( new  ScrollingObstacles(), Greenfoot.getRandomNumber(1152),480);
        }
        countDown();
    }
    
    /**
     * Creates the boundaries for the Final Level
     */
    private void createBoundaries()
    {
        Boundaries boundaryTop = new Boundaries();
        boundaryTop.getImage().scale(1152, 90);
        addObject(boundaryTop, getWidth() / 2, 28);
    }
    
    /**
     * This method sets the backround
     */
    public void image()
    {
        setBackground("hallway_dark_loop2.png");
    }
    
    /**
     * This method counts down the timer and ends the game once
     * the timer reaches 0
     */
    public void countDown()
    {
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.setWorld(new Victoryscreen());
            Scoreboard.grade = 100;
        }
    }
    
    /**
     * This method generates the location of the timer
     */
        private void showTime()
    {
        showText("Time: " + time, 1100,50);
    }
    
    
    /**
     * Prepares all the objects and boundaries for the final level.
     */
    private void prepare()
    {
        Monster monster = new Monster();
        addObject(monster,100,272);
        monster.getImage().scale(239, 216);
        Lola lola = new Lola();
        addObject(lola,326,271);
        addObject(new Scoreboard(),55,55);
    }
}
