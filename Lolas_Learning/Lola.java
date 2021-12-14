import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lola extends Actor
{
    private GreenfootImage[] animations = {
        new GreenfootImage("lola_left_idle.png"),
        new GreenfootImage("lola_left_1.png"),
        new GreenfootImage("lola_left_idle.png"),
        new GreenfootImage("lola_left_2.png"),
        new GreenfootImage("lola_right_idle.png"),
        new GreenfootImage("lola_right_1.png"),
        new GreenfootImage("lola_right_idle.png"),
        new GreenfootImage("lola_right_2.png"),
        new GreenfootImage("lola_back_idle.png"),
        new GreenfootImage("lola_back_1.png"),
        new GreenfootImage("lola_back_idle.png"),
        new GreenfootImage("lola_back_2.png"),
        new GreenfootImage("lola_front_idle.png"),
        new GreenfootImage("lola_front_1.png"),
        new GreenfootImage("lola_front_idle.png"),
        new GreenfootImage("lola_front_2.png"),
    };
    
    private int speed = 5;
    private boolean walking;
    private boolean isKeyPressed;
    
    private int animationFrame = 0;
    private int animationCounter = 0;
    
    Classroom classroom = (Classroom)getWorld();
    Hallway hallway = (Hallway)getWorld();
    
    /**
     * Act - do whatever the Lola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKey();
        enterDoor();
        animationCounter++;
        ifTouchingObstacles();
        ifTouchingMonster();
        if (!isKeyPressed)
        {       
            setImage(animations[12]);
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
        if (isTouching(ChalkBoard.class))
        {
            getWorld().showText("Press \"E\" to answer the question!", 200, 580);
            if (Greenfoot.isKeyDown("e"))
            {
                Classroom classroom = (Classroom)getWorld();
                classroom.setIsQandAActivated(true);
                getWorld().showText("", 200, 580);
            }
        }
        if (!isTouching(ChalkBoard.class))
        {
            getWorld().showText("", 200, 580);
        }
    }
    
    private void enterDoor()
    {
        if (ExitDoor.getIsOpen())
        {
            if (!getIntersectingObjects(ExitDoor.class).isEmpty())
            {
                classroom.setIsQandAAnswered(false);
                if (this.getWorld().getClass() == Classroom.class && classroom.getLevelCounter() != 4)
                {
                    classroom.enterHallway();
                }
                else if (this.getWorld().getClass() == Classroom.class && classroom.getLevelCounter() == 4)
                {
                    classroom.enterFinalLevel();
                }
                if (this.getWorld().getClass() == Hallway.class)
                {
                    hallway.enterClassroom();
                }
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
            setImage(animations[0]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 1)
        {
            setImage(animations[1]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 2)
        {
            setImage(animations[2]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 3)
        {
            setImage(animations[3]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animations[0]);
            Greenfoot.delay(3);
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
            setImage(animations[4]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 1)
        {
            setImage(animations[5]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 2)
        {
            setImage(animations[6]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 3)
        {
            setImage(animations[7]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animations[4]);
            Greenfoot.delay(3);
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
            setImage(animations[8]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 1)
        {
            setImage(animations[9]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 2)
        {
            setImage(animations[10]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 3)
        {
            setImage(animations[11]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animations[8]);
            Greenfoot.delay(3);
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
            setImage(animations[12]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 1)
        {
            setImage(animations[13]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 2)
        {
            setImage(animations[14]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 3)
        {
            setImage(animations[15]);
            Greenfoot.delay(3);
        }
        else if (animationFrame == 4)
        {
            animationFrame = 0;
            setImage(animations[12]);
            Greenfoot.delay(3);
        }
        animationFrame++;
        return;
    }
    
    /**
     * This method overrides the setLocation method to prevent Lola from
     * walking through boundaries.
     */
    public void setLocation(int x, int y)
    {
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        if(!getIntersectingObjects(Boundaries.class).isEmpty())
        {
            super.setLocation(oldX, oldY);
        }
    }
    
    /**
     * Remove points if a question is wrong.
     */
    public void pointsRemoved()
    {
        if(isTouching(ScrollingObstacles.class))
        {
            Scoreboard.grade -= 10;
        }
    }
    
    /**
     * This method ends the game if the player touches a obstacle
     */
    public void ifTouchingObstacles()
    {
        if(isTouching(ScrollingObstacles.class))
        {
            removeTouching(ScrollingObstacles.class);
            pointsRemoved();
        }
    }
    
    public void GameOver() {
        if (Scoreboard.grade == 0)
        {
            Greenfoot.setWorld(new Gameover());
            Scoreboard.grade = 100;
        }
    }
    
        public void ifTouchingMonster()
    {
        if(isTouching(Monster.class))
        {
            Greenfoot.setWorld(new Gameover());
            Scoreboard.grade = 100;
        }
    }
}

