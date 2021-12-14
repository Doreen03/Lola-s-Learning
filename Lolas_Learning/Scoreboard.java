import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Icons
{
    public static int grade = 100;
    
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
     * This method changes the grade image when the garde goes 
     * down by 10.
     */
    public Scoreboard()
    {
        if (grade == 100)
        {
            setImage(scoreboard1);
        }
        if (grade == 90)
        {
            setImage(scoreboard2);
        }
        if (grade == 80)
        {
            setImage(scoreboard3);
        }
        if (grade == 70)
        {
            setImage(scoreboard4);
        }
        if (grade == 60)
        {
            setImage(scoreboard5);
        }
        if (grade == 50)
        {
            setImage(scoreboard6);
        }
        if (grade == 40)
        {
            setImage(scoreboard7);
        }
        if (grade == 30)
        {
            setImage(scoreboard8);
        }
        if (grade == 20)
        {
            setImage(scoreboard9);
        }
        if (grade == 10)
        {
            setImage(scoreboard10);
        }
    }
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

}
