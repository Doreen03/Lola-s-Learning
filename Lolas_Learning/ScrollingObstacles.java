import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollingObstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingObstacles extends Scrolling
{
    private int speed;
    
    public ScrollingObstacles()
    {
        GreenfootImage cannon = new GreenfootImage("blob_attack.png");
        cannon = getImage();
        cannon.scale(50, 50);
        setImage(cannon);
        randomSpeed();
    }
    /**
     * This method makes random speed numbers
     */
    public void randomSpeed()
    {
        speed = Greenfoot.getRandomNumber(4) + 1;
    }
    
    /**
     * Act - do whatever the ScrollingObstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * This method also moves the obstacle up.
     */
    public void act()
    {
        setLocation(getX(), getY()- speed);
        if (getY() == 0)
        {
            FinalLevel finalLevel = (FinalLevel)getWorld();
            finalLevel.removeObject(this);
        }
    }
}
