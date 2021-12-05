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
    private static int levelCounter = 0;
    private static int questionCounter = 1;
    private static boolean isQandAActivated = false;
    private static boolean isQandAAnswered = false;
    private boolean isFirstLevel0 = true;
    
    public ExitDoor exitDoor;
    public Answer[] answers = 
        {new Answer('A'), new Answer('B'), new Answer('C'), new Answer('D')};
    Question question = new Question();
    ChalkBoard chalkBoard = new ChalkBoard();

    private GreenfootImage backgroundLevel0 = new GreenfootImage("level0classroom.png");
    private GreenfootImage backgroundLevel1 = new GreenfootImage("level1classroom.png");
    private GreenfootImage backgroundLevel2 = new GreenfootImage("level2classroom.png");
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
        levelCounter = 0;
        questionCounter = 1;
        setBackground(backgroundLevel0);
        isQandAActivated = false;
        prepare();
        createDoor();
        spawnLola();
    }
    
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 648, 1); 
        if (level == 0)
        {
            setBackground(backgroundLevel0);
            prepare(0);
        }
        else if (level == 1)
        {
            setBackground(backgroundLevel1);
            prepare(1);
        }
        else if (level == 2)
        {
            setBackground(backgroundLevel2);
            prepare(2);
        }
        else if (level == 3)
        {
            setBackground(backgroundLevel3);
            prepare(3);
        }
        else if (level == 4)
        {
            setBackground(backgroundLevel4);
            prepare(4);
        }
        isQandAActivated = false;
        createDoor();
        spawnLola();
    }
    
    /**
     * Act method: does these actions every act.
     */
    public void act() 
    {
        if (isQandAActivated)
        {
            createQandAs();
            isQandAActivated = false;
            isFirstLevel0 = false;
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
        chalkBoard.getImage().scale(215, 90);
        addObject(chalkBoard, 638, 183);
        
        addObject(new Scoreboard(),55,55);
        
        Boundaries boundaryTopLevel = new Boundaries();
        boundaryTopLevel.getImage().scale(1152, 90);
        addObject(boundaryTopLevel, getWidth() / 2, 45);
        
        Boundaries boundaryLeftLevel = new Boundaries();
        boundaryLeftLevel.getImage().scale(90, 648);
        addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
        Boundaries boundaryLeftLevel2 = new Boundaries();
        boundaryLeftLevel2.getImage().scale(97, 180);
        addObject(boundaryLeftLevel2, 128, 165);
        
        Boundaries boundaryRightLevel = new Boundaries();
        boundaryRightLevel.getImage().scale(90, 648);
        addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
        Boundaries boundaryRightLevel2 = new Boundaries();
        boundaryRightLevel2.getImage().scale(90, 180);
        addObject(boundaryRightLevel2, 1020, 120);
        
        Boundaries boundaryRightLevel3 = new Boundaries();
        boundaryRightLevel3.getImage().scale(90, 180);
        addObject(boundaryRightLevel3, 1020, 548);
        
        Boundaries boundaryRightLevel4 = new Boundaries();
        boundaryRightLevel4.getImage().scale(90, 648);
        addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
        Boundaries boundaryTeachersDesk = new Boundaries();
        boundaryTeachersDesk.getImage().scale(97, 180);
        addObject(boundaryTeachersDesk, 827,  154);
        
        Boundaries boundaryTeachersPlant = new Boundaries();
        boundaryTeachersPlant.getImage().scale(97, 180);
        addObject(boundaryTeachersPlant, 925, 40);
        
        Boundaries boundaryBottomLevel = new Boundaries();
        boundaryBottomLevel.getImage().scale(1152, 42);
        addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
        Boundaries boundaryTopLeftDesk = new Boundaries();
        boundaryTopLeftDesk.getImage().scale(541, 90);
        addObject(boundaryTopLeftDesk, 186, 158);
        
        Boundaries boundaryBottomDesks = new Boundaries();
        boundaryBottomDesks.getImage().scale(741, 90);
        addObject(boundaryBottomDesks, 297, 484);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int level)
    {
        chalkBoard.getImage().scale(215, 90);
        addObject(chalkBoard, 638, 183);
        if (level == 0)
        {
            addObject(new Scoreboard(),55,55);
            
            Boundaries boundaryTopLevel = new Boundaries();
            boundaryTopLevel.getImage().scale(1152, 90);
            addObject(boundaryTopLevel, getWidth() / 2, 45);
        
            Boundaries boundaryLeftLevel = new Boundaries();
            boundaryLeftLevel.getImage().scale(90, 648);
            addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
            Boundaries boundaryLeftLevel2 = new Boundaries();
            boundaryLeftLevel2.getImage().scale(97, 180);
            addObject(boundaryLeftLevel2, 128, 165);
        
            Boundaries boundaryRightLevel = new Boundaries();
            boundaryRightLevel.getImage().scale(90, 648);
            addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
            Boundaries boundaryRightLevel2 = new Boundaries();
            boundaryRightLevel2.getImage().scale(90, 180);
            addObject(boundaryRightLevel2, 1020, 120);
        
            Boundaries boundaryRightLevel3 = new Boundaries();
            boundaryRightLevel3.getImage().scale(90, 180);
            addObject(boundaryRightLevel3, 1020, 548);
        
            Boundaries boundaryRightLevel4 = new Boundaries();
            boundaryRightLevel4.getImage().scale(90, 648);
            addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
            Boundaries boundaryTeachersDesk = new Boundaries();
            boundaryTeachersDesk.getImage().scale(97, 180);
            addObject(boundaryTeachersDesk, 827,  154);
        
            Boundaries boundaryTeachersPlant = new Boundaries();
            boundaryTeachersPlant.getImage().scale(97, 180);
            addObject(boundaryTeachersPlant, 925, 40);
        
            Boundaries boundaryBottomLevel = new Boundaries();
            boundaryBottomLevel.getImage().scale(1152, 42);
            addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
            Boundaries boundaryTopLeftDesk = new Boundaries();
            boundaryTopLeftDesk.getImage().scale(541, 90);
            addObject(boundaryTopLeftDesk, 186, 158);
        
            Boundaries boundaryBottomDesks = new Boundaries();
            boundaryBottomDesks.getImage().scale(741, 90);
            addObject(boundaryBottomDesks, 297, 484);
        }
        if (level == 1)
        {
            addObject(new Scoreboard(),55,55);
            
            Boundaries boundaryTopLevel = new Boundaries();
            boundaryTopLevel.getImage().scale(1152, 90);
            addObject(boundaryTopLevel, getWidth() / 2, 45);
        
            Boundaries boundaryLeftLevel = new Boundaries();
            boundaryLeftLevel.getImage().scale(90, 648);
            addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
            Boundaries boundaryLeftLevel2 = new Boundaries();
            boundaryLeftLevel2.getImage().scale(97, 180);
            addObject(boundaryLeftLevel2, 128, 165);
        
            Boundaries boundaryRightLevel = new Boundaries();
            boundaryRightLevel.getImage().scale(90, 648);
            addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
            Boundaries boundaryRightLevel2 = new Boundaries();
            boundaryRightLevel2.getImage().scale(90, 180);
            addObject(boundaryRightLevel2, 1020, 120);
        
            Boundaries boundaryRightLevel3 = new Boundaries();
            boundaryRightLevel3.getImage().scale(90, 180);
            addObject(boundaryRightLevel3, 1020, 548);
        
            Boundaries boundaryRightLevel4 = new Boundaries();
            boundaryRightLevel4.getImage().scale(90, 648);
            addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
            Boundaries boundaryTeachersDesk = new Boundaries();
            boundaryTeachersDesk.getImage().scale(97, 180);
            addObject(boundaryTeachersDesk, 827,  154);
        
            Boundaries boundaryTeachersPlant = new Boundaries();
            boundaryTeachersPlant.getImage().scale(97, 180);
            addObject(boundaryTeachersPlant, 925, 40);
        
            Boundaries boundaryBottomLevel = new Boundaries();
            boundaryBottomLevel.getImage().scale(1152, 42);
            addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
            Boundaries boundaryTopLeftDesk = new Boundaries();
            boundaryTopLeftDesk.getImage().scale(541, 90);
            addObject(boundaryTopLeftDesk, 186, 158);
        
            Boundaries boundaryBottomDesks = new Boundaries();
            boundaryBottomDesks.getImage().scale(741, 90);
            addObject(boundaryBottomDesks, 297, 484);
        }
        if (level == 2)
        {
            addObject(new Scoreboard(),55,55);
            
            Boundaries boundaryTopLevel = new Boundaries();
            boundaryTopLevel.getImage().scale(1152, 90);
            addObject(boundaryTopLevel, getWidth() / 2, 45);
        
            Boundaries boundaryLeftLevel = new Boundaries();
            boundaryLeftLevel.getImage().scale(90, 648);
            addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
            Boundaries boundaryLeftLevel2 = new Boundaries();
            boundaryLeftLevel2.getImage().scale(97, 180);
            addObject(boundaryLeftLevel2, 128, 165);
        
            Boundaries boundaryRightLevel = new Boundaries();
            boundaryRightLevel.getImage().scale(90, 648);
            addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
            Boundaries boundaryRightLevel2 = new Boundaries();
            boundaryRightLevel2.getImage().scale(90, 180);
            addObject(boundaryRightLevel2, 1020, 120);
        
            Boundaries boundaryRightLevel3 = new Boundaries();
            boundaryRightLevel3.getImage().scale(90, 180);
            addObject(boundaryRightLevel3, 1020, 548);
        
            Boundaries boundaryRightLevel4 = new Boundaries();
            boundaryRightLevel4.getImage().scale(90, 648);
            addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
            Boundaries boundaryTeachersDesk = new Boundaries();
            boundaryTeachersDesk.getImage().scale(97, 180);
            addObject(boundaryTeachersDesk, 827,  154);
        
            Boundaries boundaryTeachersPlant = new Boundaries();
            boundaryTeachersPlant.getImage().scale(97, 180);
            addObject(boundaryTeachersPlant, 925, 40);
        
            Boundaries boundaryBottomLevel = new Boundaries();
            boundaryBottomLevel.getImage().scale(1152, 42);
            addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
            Boundaries boundaryTopLeftDesk = new Boundaries();
            boundaryTopLeftDesk.getImage().scale(541, 90);
            addObject(boundaryTopLeftDesk, 186, 158);
        
            Boundaries boundaryBottomDesks = new Boundaries();
            boundaryBottomDesks.getImage().scale(741, 90);
            addObject(boundaryBottomDesks, 297, 484);
        }
        if (level == 3)
        {
            addObject(new Scoreboard(),55,55);
            
            Boundaries boundaryTopLevel = new Boundaries();
            boundaryTopLevel.getImage().scale(1152, 90);
            addObject(boundaryTopLevel, getWidth() / 2, 45);
        
            Boundaries boundaryLeftLevel = new Boundaries();
            boundaryLeftLevel.getImage().scale(90, 648);
            addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
            Boundaries boundaryLeftLevel2 = new Boundaries();
            boundaryLeftLevel2.getImage().scale(97, 180);
            addObject(boundaryLeftLevel2, 128, 165);
        
            Boundaries boundaryRightLevel = new Boundaries();
            boundaryRightLevel.getImage().scale(90, 648);
            addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
            Boundaries boundaryRightLevel2 = new Boundaries();
            boundaryRightLevel2.getImage().scale(90, 180);
            addObject(boundaryRightLevel2, 1020, 120);
        
            Boundaries boundaryRightLevel3 = new Boundaries();
            boundaryRightLevel3.getImage().scale(90, 180);
            addObject(boundaryRightLevel3, 1020, 548);
        
            Boundaries boundaryRightLevel4 = new Boundaries();
            boundaryRightLevel4.getImage().scale(90, 648);
            addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
            Boundaries boundaryTeachersDesk = new Boundaries();
            boundaryTeachersDesk.getImage().scale(97, 180);
            addObject(boundaryTeachersDesk, 827,  154);
        
            Boundaries boundaryTeachersPlant = new Boundaries();
            boundaryTeachersPlant.getImage().scale(97, 180);
            addObject(boundaryTeachersPlant, 925, 40);
        
            Boundaries boundaryBottomLevel = new Boundaries();
            boundaryBottomLevel.getImage().scale(1152, 42);
            addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
            Boundaries boundaryTopLeftDesk = new Boundaries();
            boundaryTopLeftDesk.getImage().scale(541, 90);
            addObject(boundaryTopLeftDesk, 186, 158);
        
            Boundaries boundaryBottomDesks = new Boundaries();
            boundaryBottomDesks.getImage().scale(741, 90);
            addObject(boundaryBottomDesks, 297, 484);
        }
        if (level == 4)
        {
            addObject(new Scoreboard(),55,55);
            
            Boundaries boundaryTopLevel = new Boundaries();
            boundaryTopLevel.getImage().scale(1152, 90);
            addObject(boundaryTopLevel, getWidth() / 2, 45);
        
            Boundaries boundaryLeftLevel = new Boundaries();
            boundaryLeftLevel.getImage().scale(90, 648);
            addObject(boundaryLeftLevel, 48, getHeight() / 2);
        
            Boundaries boundaryLeftLevel2 = new Boundaries();
            boundaryLeftLevel2.getImage().scale(97, 180);
            addObject(boundaryLeftLevel2, 128, 165);
        
            Boundaries boundaryRightLevel = new Boundaries();
            boundaryRightLevel.getImage().scale(90, 648);
            addObject(boundaryRightLevel, 1113, getHeight() / 2);
        
            Boundaries boundaryRightLevel2 = new Boundaries();
            boundaryRightLevel2.getImage().scale(90, 180);
            addObject(boundaryRightLevel2, 1020, 120);
        
            Boundaries boundaryRightLevel3 = new Boundaries();
            boundaryRightLevel3.getImage().scale(90, 180);
            addObject(boundaryRightLevel3, 1020, 548);
        
            Boundaries boundaryRightLevel4 = new Boundaries();
            boundaryRightLevel4.getImage().scale(90, 648);
            addObject(boundaryRightLevel4, 1025, getHeight() / 2);
        
            Boundaries boundaryTeachersDesk = new Boundaries();
            boundaryTeachersDesk.getImage().scale(97, 180);
            addObject(boundaryTeachersDesk, 827,  154);
        
            Boundaries boundaryTeachersPlant = new Boundaries();
            boundaryTeachersPlant.getImage().scale(97, 180);
            addObject(boundaryTeachersPlant, 925, 40);
        
            Boundaries boundaryBottomLevel = new Boundaries();
            boundaryBottomLevel.getImage().scale(1152, 42);
            addObject(boundaryBottomLevel, getWidth() / 2, 630);
        
            Boundaries boundaryTopLeftDesk = new Boundaries();
            boundaryTopLeftDesk.getImage().scale(541, 90);
            addObject(boundaryTopLeftDesk, 186, 158);
        
            Boundaries boundaryBottomDesks = new Boundaries();
            boundaryBottomDesks.getImage().scale(741, 90);
            addObject(boundaryBottomDesks, 297, 484);
        }
    }
    
    public static void increaseLevel() 
    {
        questionCounter = 1;
        levelCounter++;
    }
    
    public static void increaseQuestion()
    {
        if (levelCounter == 0 && questionCounter == 3)
        {
            questionCounter = 1;
            increaseLevel();
        }
        else if (levelCounter == 1 && questionCounter == 4)
        {
            questionCounter = 1;
            increaseLevel();
        }
        else if (levelCounter == 2 && questionCounter == 4)
        {
            questionCounter = 1;
            increaseLevel();
        }
        else if (levelCounter == 3 && questionCounter == 4)
        {
            questionCounter = 1;
            increaseLevel();
        }
        else
        {
            questionCounter++;
        }
    }
    
    /**
     * Creates the Exit Door.
     */
    private void createDoor()
    {
        exitDoor = new ExitDoor("classroom");
        addObject(exitDoor, 1021, 333);
    }
    
    /**
     * Spawns in Lola.
     */
    private void spawnLola()
    {
        Lola lola = new Lola();
        addObject(lola, 135, 347);
    }
    
    /**
     * Setter for isQandAActivated.
     */
    public static void setIsQandAActivated(boolean flag)
    {
        isQandAActivated = flag;
    }
    
    /**
     * Creates the question and answers objects.
     */
    private void createQandAs()
    {
        addObject(question, getWidth() / 2, 150);
        removeObject(chalkBoard);
        for (int i = 0; i < 4; i++)
        {
            if (i < 2)
            {
                addObject(answers[i], (i + 1) * 430 - 65, 365);
            }
            else
            {
                addObject(answers[i], (i - 1) * 430 - 65, 525);
            }
        }
        return;
    }
    
    /**
     * Deletes the question and answers objects.
     */
    public void removeQandAs()
    {
        removeObject(question);
        removeObjects(getObjects(Answer.class));
        chalkBoard.getImage().scale(215, 90);
        addObject(chalkBoard, 638, 183);
        if (getIsQandAAnswered())
        {
            removeChalkBoard();
        }
    }
    
    /**
     * Deletes the chalkBoard.
     */
    public void removeChalkBoard()
    {
        removeObject(chalkBoard);
    }
    
    /**
     * Change world to the Hallway world.
     */
    public static void enterHallway()
    {
        Greenfoot.setWorld(new Hallway());
    }
    
    /**
     * Change world to the FinalLevel world.
     */
    public static void enterFinalLevel()
    {
        Greenfoot.setWorld(new FinalLevel());
    }
    
    /**
     * Getter for levelCounter
     */
    public static int getLevelCounter()
    {
        return levelCounter;
    }
    
    /**
     * Getter for questionCounter
     */
    public static int getQuestionCounter()
    {
        return questionCounter;
    }
    
    /**
     * Setter for levelCounter
     */
    public static void setLevelCounter(int levelNum)
    {
        levelCounter = levelNum;
    }
    
    /**
     * Setter for questionCounter
     */
    public static void setQuestionCounter(int questionNum)
    {
        questionCounter = questionNum;
    }
    
    /**
     * Getter for isQandAAnswered
     */
    public static boolean getIsQandAAnswered()
    {
        return isQandAAnswered;
    }
    
    /**
     * Setter for isQandAAnswered
     */
    public static void setIsQandAAnswered(boolean flag)
    {
        isQandAAnswered = flag;
    }
}
