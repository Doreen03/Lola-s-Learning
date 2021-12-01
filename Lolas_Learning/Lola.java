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
    private GreenfootImage animateUp1 = new GreenfootImage("lola_back_idle.png");
    private GreenfootImage animateUp2 = new GreenfootImage("lola_back_1.png");
    private GreenfootImage animateUp3 = new GreenfootImage("lola_back_idle.png");
    private GreenfootImage animateUp4 = new GreenfootImage("lola_back_2.png");
    private GreenfootImage animateDown1 = new GreenfootImage("lola_front_idle.png");
    private GreenfootImage animateDown2 = new GreenfootImage("lola_front_1.png");
    private GreenfootImage animateDown3 = new GreenfootImage("lola_front_idle.png");
    private GreenfootImage animateDown4 = new GreenfootImage("lola_front_2.png");
    
    private int speed = 4;
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
        enterDoor();
        animationCounter++;
        if (!isKeyPressed)
        {
            setImage(animateDown1);
        }
    }
    
    /**
     * This method checks the key that is pressed.
     */
    public void checkKey()
    {
        isKeyPressed = false;
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            isKeyPressed = true;
            moveLeft();
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            isKeyPressed = true;
            moveRight();
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            isKeyPressed = true;
            moveUp();
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            isKeyPressed = true;
            moveDown();
        }
        if (Greenfoot.isKeyDown("e") && isTouching(TeacherDesk.class))
        {
            Classroom classroom = (Classroom)getWorld();
            classroom.setIsQandAActivated(true);
            // ExitDoor.setIsOpen(true);
        }
    }
    
    private void enterDoor()
    {
        if (ExitDoor.getIsOpen())
        {
            if (!getIntersectingObjects(ExitDoor.class).isEmpty())
            {
                Classroom classroom = (Classroom)getWorld();
                classroom.enterHallway();
            }
        }
    }
    
    /**
     * This method is to make Lola walk to the left.
     */
    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
        if (animationCounter % 4 == 0)
        {
            animateLeft();
        }
    }
    
    /**
     * This method is to make Lola walk to the right.
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
        if (animationCounter % 4 == 0)
        {
            animateRight();
        }
    }
    
    /**
     * This method is to make Lola walk upwards.
     */
    public void moveUp()
    {
        setLocation(getX(), getY() - speed);
        if (animationCounter % 4 == 0)
        {
            animateUp();
        }
    }
    
    /**
     * This method is to make Lola walk downwards.
     */
    public void moveDown()
    {
        setLocation(getX(), getY() + speed);
        if (animationCounter % 4 == 0)
        {
            animateDown();
        }
    }
    
    /**
     * This method animates Lola when she walks to the left.
     */
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
    
    /**
     * This method animates Lola when she walks to the right.
     */
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
    
    /**
     * This method animates Lola when she walks upwards.
     */
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
    
    /**
     * This method animates Lola when she walks downwards.
     */
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
    
    /**
     * This method overrides the setLocation method to prevent Lola from walking through
     * other objects.
     */
    public void setLocation(int x, int y)
    {
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        if(!getIntersectingObjects(Desk.class).isEmpty())
        {
            super.setLocation(oldX, oldY);
        }
    }
}

