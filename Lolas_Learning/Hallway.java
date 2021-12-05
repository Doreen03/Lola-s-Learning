import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hallway here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hallway extends World
{
    public ExitDoor exitDoor;
    private GreenfootImage hallwayBackground = new GreenfootImage("hallway.png");
    
    /**
     * Constructor for objects of class Hallway.
     * 
     */
    public Hallway()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        setBackground(hallwayBackground);
        createBoundaries();
        createDoor();
        spawnLola();
    }
    
    public void act ()
    {
        
    }
    
    private void createBoundaries()
    {
    
    }
    
    /**
     * Creates the Exit Door.
     */
    private void createDoor()
    {
        exitDoor = new ExitDoor("hallway");
        addObject(exitDoor, 1021, 333);
    }
    
    /**
     * Spawns in Lola.
     */
    private void spawnLola()
    {
        Lola lola = new Lola();
        addObject(lola, 100, 370);
    }
    
    /**
     * Change world to the Classroom world.
     */
    public static void enterClassroom()
    {
        
        if (Answer.getIsQuestionRight())
        {
            Classroom.increaseQuestion();
            Answer.setIsQuestionRight(false);
            if (Classroom.getLevelCounter() == 0)
            {
                Greenfoot.setWorld(new Classroom(0));
            }
            else if (Classroom.getLevelCounter() == 1)
            {
                Greenfoot.setWorld(new Classroom(1));
            }
            else if (Classroom.getLevelCounter() == 2)
            {
                Greenfoot.setWorld(new Classroom(2));
            }
            else if (Classroom.getLevelCounter() == 3)
            {
                Greenfoot.setWorld(new Classroom(3));
            }
            else if (Classroom.getLevelCounter() == 4)
            {
                Greenfoot.setWorld(new Classroom(4));
            }
        }
        else if (!Answer.getIsQuestionRight())
        {
            Classroom.increaseLevel();
            Answer.setIsQuestionRight(false);
            if (Classroom.getLevelCounter() == 0)
            {
                Greenfoot.setWorld(new Classroom(0));
            }
            else if (Classroom.getLevelCounter() == 1)
            {
                Greenfoot.setWorld(new Classroom(1));
            }
            else if (Classroom.getLevelCounter() == 2)
            {
                Greenfoot.setWorld(new Classroom(2));
            }
            else if (Classroom.getLevelCounter() == 3)
            {
                Greenfoot.setWorld(new Classroom(3));
            }
            else if (Classroom.getLevelCounter() == 4)
            {
                Greenfoot.setWorld(new Classroom(4));
            }
        }
    }
}