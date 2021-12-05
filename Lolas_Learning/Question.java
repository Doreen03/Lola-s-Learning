import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question extends Icons
{
    private GreenfootImage[] questions = {
        new GreenfootImage("L0Q1.png"),
        new GreenfootImage("L0Q2.png"),
        new GreenfootImage("L0Q3.png"),
        new GreenfootImage("L1Q1.png"),
        new GreenfootImage("L1Q2.png"),
        new GreenfootImage("L1Q3.png"),
        new GreenfootImage("L1Q4.png"),
        new GreenfootImage("L2Q1.png"),
        new GreenfootImage("L2Q2.png"),
        new GreenfootImage("L2Q3.png"),
        new GreenfootImage("L2Q4.png"),
        new GreenfootImage("L3Q1.png"),
        new GreenfootImage("L3Q2.png"),
        new GreenfootImage("L3Q3.png"),
        new GreenfootImage("L3Q4.png"),
        new GreenfootImage("L4Q.png") };
        
    Classroom classroom = (Classroom)getWorld();
    
    public Question()
    {
        setImage(questions[0]);
    }
    
    /**
     * Act - do whatever the Question wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkLevel();
    }
    
    public void checkLevel()
    {
        switch (classroom.getLevelCounter())
        {
            case 0:
                checkQuestion();
                break;
            case 1:
                checkQuestion();
                break;
            case 2:
                checkQuestion();
                break;
            case 3:
                checkQuestion();
                break;
            case 4:
                checkQuestion();
                break;
            default:
                classroom.setLevelCounter(0);
        }
    }
    
    public void checkQuestion()
    {
        if (classroom.getLevelCounter() == 0)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                setImage(questions[0]);
            }
            if (classroom.getQuestionCounter() == 2)
            {
                setImage(questions[1]);
            }
            if (classroom.getQuestionCounter() == 3)
            {
                setImage(questions[2]);
            }
        }
        if (classroom.getLevelCounter() == 1)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                setImage(questions[3]);
            }
            if (classroom.getQuestionCounter() == 2)
            {
                setImage(questions[4]);
            }
            if (classroom.getQuestionCounter() == 3)
            {
                setImage(questions[5]);
            }
            if (classroom.getQuestionCounter() == 4)
            {
                setImage(questions[6]);
            }
        }
        if (classroom.getLevelCounter() == 2)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                setImage(questions[7]);
            }
            if (classroom.getQuestionCounter() == 2)
            {
                setImage(questions[8]);
            }
            if (classroom.getQuestionCounter() == 3)
            {
                setImage(questions[9]);
            }
            if (classroom.getQuestionCounter() == 4)
            {
                setImage(questions[10]);
            }
        }
        if (classroom.getLevelCounter() == 3)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                setImage(questions[11]);
            }
            if (classroom.getQuestionCounter() == 2)
            {
                setImage(questions[12]);
            }
            if (classroom.getQuestionCounter() == 3)
            {
                setImage(questions[13]);
            }
            if (classroom.getQuestionCounter() == 4)
            {
                setImage(questions[14]);
            }
        }
        if (classroom.getLevelCounter() == 4)
        {
            setImage(questions[15]);
        }
    }
}
