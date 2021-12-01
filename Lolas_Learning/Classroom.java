import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
    private static boolean isQandAActivated = false;
    
    public ExitDoor exitDoor;
    private Answer[] answers = 
        {new Answer(), new Answer(), new Answer(), new Answer()};
    Question question = new Question();

    private GreenfootImage backgroundLevel0 = new GreenfootImage("level0classroom.png");
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
        super(1152, 648, 1); 
        setBackground(backgroundLevel0);
        levelCounter = 0;
        questionCounter = 1;
        isQandAActivated = false;
        prepare();
        createDoor();
    }
    
    public void act() 
    {
        if (isQandAActivated)
        {
            createQandAs();
            isQandAActivated = false;
        }
        if (Greenfoot.isKeyDown("q"))
        {
            removeQandAs();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StudentDesk studentDesk = new StudentDesk();
        addObject(studentDesk, 350, 225);
        StudentDesk studentDesk2 = new StudentDesk();
        addObject(studentDesk2, 550, 225);
        StudentDesk studentDesk3 = new StudentDesk();
        addObject(studentDesk3, 350, 500);
        StudentDesk studentDesk4 = new StudentDesk();
        addObject(studentDesk4, 550, 500);
        TeacherDesk teacherDesk = new TeacherDesk();
        addObject(teacherDesk, 811, 376);
        Lola lola = new Lola();
        addObject(lola, 700, 375);
    }
    
    private void createDoor()
    {
        exitDoor = new ExitDoor();
        addObject(exitDoor, 1060, 370);
    }
    
    public static void setIsQandAActivated(boolean flag)
    {
        isQandAActivated = flag;
    }
    
    private void createQandAs()
    {
        addObject(question, getWidth() / 2, 275);
        for (int i = 0; i < 4; i++)
        {
            if (i < 2)
            {
                addObject(answers[i], (i + 1) * 175 + 315, 400);
            }
            else
            {
                addObject(answers[i], (i - 1) * 175 + 315, 500);
            }
        }
        return;
    }
    
    private void removeQandAs()
    {
        removeObject(question);
        removeObjects(getObjects(Answer.class));
    }
     
    public static void enterHallway()
    {
        Greenfoot.setWorld(new Hallway());
    }
}
