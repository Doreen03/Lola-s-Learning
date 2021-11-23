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
    
    private int speed = 2;
    private boolean walking;
    private boolean isKeyPressed;
    
    private int animationFrame = 0;
    private int animationCounter = 0;
    
    /**
     * Act - do whatever the Lola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKey();
        checkObstacle();
        animationCounter++;
        if (!isKeyPressed)
        {
            setImage(animateDown1);
        }
    }
    
    public void checkKey()
    {
        isKeyPressed = false;
        if (Greenfoot.isKeyDown("left"))
        {
            isKeyPressed = true;
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            isKeyPressed = true;
            moveRight();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            isKeyPressed = true;
            moveUp();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            isKeyPressed = true;
            moveDown();
        }
    }
    
    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
        if (animationCounter % 4 == 0)
        {
            animateLeft();
        }
    }
    
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
        if (animationCounter % 4 == 0)
        {
            animateRight();
        }
    }
    
    public void moveUp()
    {
        setLocation(getX(), getY() - speed);
        if (animationCounter % 4 == 0)
        {
            animateUp();
        }
    }
    
    public void moveDown()
    {
        setLocation(getX(), getY() + speed);
        if (animationCounter % 4 == 0)
        {
            animateDown();
        }
    }
    
    public void animateLeft()
    {
        if (animationFrame == 0)
        {
            setImage(animateLeft1);
        }
        else if (animationFrame == 1)
        {
            setImage(animateLeft2);
        }
        else if (animationFrame == 2)
        {
            setImage(animateLeft3);
        }
        else if (animationFrame == 3)
        {
            setImage(animateLeft4);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animateLeft1);
        }
        animationFrame++;
        return;
    }
    
    public void animateRight()
    {
        if (animationFrame == 0)
        {
            setImage(animateRight1);
        }
        else if (animationFrame == 1)
        {
            setImage(animateRight2);
        }
        else if (animationFrame == 2)
        {
            setImage(animateRight3);
        }
        else if (animationFrame == 3)
        {
            setImage(animateRight4);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animateRight1);
        }
        animationFrame++;
        return;
    }
    
    public void animateUp()
    {
        if (animationFrame == 0)
        {
            setImage(animateUp1);
        }
        else if (animationFrame == 1)
        {
            setImage(animateUp2);
        }
        else if (animationFrame == 2)
        {
            setImage(animateUp3);
        }
        else if (animationFrame == 3)
        {
            setImage(animateUp4);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animateUp1);
        }
        animationFrame++;
        return;
    }
    
    public void animateDown()
    {
        if (animationFrame == 0)
        {
            setImage(animateDown1);
        }
        else if (animationFrame == 1)
        {
            setImage(animateDown2);
        }
        else if (animationFrame == 2)
        {
            setImage(animateDown3);
        }
        else if (animationFrame == 3)
        {
            setImage(animateDown4);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animateDown1);
        }
        animationFrame++;
        return;
    }
    
    public void checkObstacle()
    {
        
    }
}

