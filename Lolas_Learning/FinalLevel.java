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
    /**
     * Constructor for objects of class FinalLevel.
     * 
     */
    public FinalLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 390, 1, false);
        addObject(new ScrollingWall(),1450,195);
        prepare();
        showTime();
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject( new  ScrollingObstacles(), Greenfoot.getRandomNumber(1152),390);
        }
        countDown();
    }

    public void image()
    {
        setBackground("LongHallway3.png");
    }
    public void countDown()
    {
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.stop();
            showGameOver();
        }
    }
    
        private void showTime()
    {
        showText("Time: " + time, 1100,50);
    }
    
     private void showGameOver()
    {
        showText("Time is up! Game Over!", 500, 150);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Monster monster = new Monster();
        addObject(monster,28,272);
        Lola lola = new Lola();
        addObject(lola,160,271);
    }
}
