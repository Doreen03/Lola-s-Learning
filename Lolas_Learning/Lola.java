import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lola extends Actor
{
    private GreenfootImage animateLeft1 = new GreenfootImage("left1sample.png");
    private GreenfootImage animateLeft2 = new GreenfootImage("left2sample.png");
    private GreenfootImage animateLeft3 = new GreenfootImage("left3sample.png");
    private GreenfootImage animateLeft4 = new GreenfootImage("left4sample.png");
    private GreenfootImage animateRight1 = new GreenfootImage("right1sample.png");
    private GreenfootImage animateRight2 = new GreenfootImage("right2sample.png");
    private GreenfootImage animateRight3 = new GreenfootImage("right3sample.png");
    private GreenfootImage animateRight4 = new GreenfootImage("right4sample.png");
    private GreenfootImage animateUp1 = new GreenfootImage("up1sample.png");
    private GreenfootImage animateUp2 = new GreenfootImage("up2sample.png");
    private GreenfootImage animateUp3 = new GreenfootImage("up3sample.png");
    private GreenfootImage animateUp4 = new GreenfootImage("up4sample.png");
    private GreenfootImage animateDown1 = new GreenfootImage("down1sample.png");
    private GreenfootImage animateDown2 = new GreenfootImage("down2sample.png");
    private GreenfootImage animateDown3 = new GreenfootImage("down3sample.png");
    private GreenfootImage animateDown4 = new GreenfootImage("down4sample.png");
    
    /**
     * Act - do whatever the Lola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        walk();
        checkObstacle();
    }
    
    public void walk()
    {
        setImage(animateDown1);
        if (Greenfoot.isKeyDown("Left")) 
        {
            setLocation(getX() - 2, getY());
            animate("left");
        }
        if (Greenfoot.isKeyDown("Right")) 
        {
            setLocation(getX() + 2, getY());
            animate("right");
        }
        if (Greenfoot.isKeyDown("Up")) 
        {
            setLocation(getX(), getY() - 2);
            animate("up");
        }
        if (Greenfoot.isKeyDown("Down")) 
        {
            setLocation(getX(), getY() + 2);
            animate("down");
        }
    }
    
    public void animate(String direction)
    {
        if (direction == "left")
        {
            if (getImage() == animateDown1)
            {
                setImage(animateLeft1);
            }
            if (getImage() == animateLeft1)
            {
                setImage(animateLeft2);
            }
            if (getImage() == animateLeft2)
            {
                setImage(animateLeft3);
            }
            if (getImage() == animateLeft3)
            {
                setImage(animateLeft4);
            }
            if (getImage() == animateLeft4)
            {
                setImage(animateLeft1);
            }
        }
        if (direction == "right")
        {
            if (getImage() == animateDown1)
            {
                setImage(animateRight1);
            }
            if (getImage() == animateRight1)
            {
                setImage(animateRight2);
            }
            if (getImage() == animateRight2)
            {
                setImage(animateRight3);
            }
            if (getImage() == animateRight3)
            {
                setImage(animateRight4);
            }
            if (getImage() == animateRight4)
            {
                setImage(animateRight1);
            }
        }
        if (direction == "up")
        {
            if (getImage() == animateDown1)
            {
                setImage(animateUp1);
            }
            if (getImage() == animateUp1)
            {
                setImage(animateUp2);
            }
            if (getImage() == animateUp2)
            {
                setImage(animateUp3);
            }
            if (getImage() == animateUp3)
            {
                setImage(animateUp4);
            }
            if (getImage() == animateUp4)
            {
                setImage(animateUp1);
            }
        }
        if (direction == "down")
        {
            if (getImage() == animateDown1)
            {
                setImage(animateDown2);
            }
            if (getImage() == animateDown2)
            {
                setImage(animateDown3);
            }
            if (getImage() == animateDown3)
            {
                setImage(animateDown4);
            }
            if (getImage() == animateDown4)
            {
                setImage(animateDown1);
            }
        }
    }
    
    public void checkObstacle()
    {
        
    }
}

