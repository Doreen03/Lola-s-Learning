import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Answer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Answer extends Icons
{
    private boolean mouseOver = false;
    private final static int MAX_TRANS = 225;
    private final char ID;
    private static boolean isQuestionRight = false;
    public static int grade = 100;
    
    private GreenfootImage[] answersL0 = {
        new GreenfootImage("L0Q1A1.png"),
        new GreenfootImage("L0Q1A2.png"),
        new GreenfootImage("L0Q1A3.png"),
        new GreenfootImage("L0Q1A4.png"),
        new GreenfootImage("L0Q2A1.png"),
        new GreenfootImage("L0Q2A2.png"),
        new GreenfootImage("L0Q2A3.png"),
        new GreenfootImage("L0Q2A4.png"),
        new GreenfootImage("L0Q3A1.png"),
        new GreenfootImage("L0Q3A2.png"),
        new GreenfootImage("L0Q3A3.png"),
        new GreenfootImage("L0Q3A4.png") };
    private GreenfootImage[] answersL1 = {
        new GreenfootImage("L1Q1A1.png"),
        new GreenfootImage("L1Q1A2.png"),
        new GreenfootImage("L1Q1A3.png"),
        new GreenfootImage("L1Q1A4.png"),
        new GreenfootImage("L1Q2A1.png"),
        new GreenfootImage("L1Q2A2.png"),
        new GreenfootImage("L1Q2A3.png"),
        new GreenfootImage("L1Q2A4.png"),
        new GreenfootImage("L1Q3A1.png"),
        new GreenfootImage("L1Q3A2.png"),
        new GreenfootImage("L1Q3A3.png"),
        new GreenfootImage("L1Q3A4.png"),
        new GreenfootImage("L1Q4A1.png"),
        new GreenfootImage("L1Q4A2.png"),
        new GreenfootImage("L1Q4A3.png"),
        new GreenfootImage("L1Q4A4.png") };
    private GreenfootImage[] answersL2 = {
        new GreenfootImage("L2Q1A1.png"),
        new GreenfootImage("L2Q1A2.png"),
        new GreenfootImage("L2Q1A3.png"),
        new GreenfootImage("L2Q1A4.png"),
        new GreenfootImage("L2Q2A1.png"),
        new GreenfootImage("L2Q2A2.png"),
        new GreenfootImage("L2Q2A3.png"),
        new GreenfootImage("L2Q2A4.png"),
        new GreenfootImage("L2Q3A1.png"),
        new GreenfootImage("L2Q3A2.png"),
        new GreenfootImage("L2Q3A3.png"),
        new GreenfootImage("L2Q3A4.png"),
        new GreenfootImage("L2Q4A1.png"),
        new GreenfootImage("L2Q4A2.png"),
        new GreenfootImage("L2Q4A3.png"),
        new GreenfootImage("L2Q4A4.png") };
    private GreenfootImage[] answersL3 = {
        new GreenfootImage("L3Q1A1.png"),
        new GreenfootImage("L3Q1A2.png"),
        new GreenfootImage("L3Q1A3.png"),
        new GreenfootImage("L3Q1A4.png"),
        new GreenfootImage("L3Q2A1.png"),
        new GreenfootImage("L3Q2A2.png"),
        new GreenfootImage("L3Q2A3.png"),
        new GreenfootImage("L3Q2A4.png"),
        new GreenfootImage("L3Q3A1.png"),
        new GreenfootImage("L3Q3A2.png"),
        new GreenfootImage("L3Q3A3.png"),
        new GreenfootImage("L3Q3A4.png"),
        new GreenfootImage("L3Q4A1234.png") };
    private GreenfootImage answersL4 = new GreenfootImage("L4A.png");
    
    Classroom classroom = (Classroom)getWorld();
    Hallway hallway = (Hallway)getWorld();
    
    public Answer(char id)
    {
        ID = id;
        isQuestionRight = false;
    }
    
    /**
     * Act - do whatever the Answer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        checkIfClicked();
        changeQuestion();
    }
    
    public void checkIfClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Classroom classroom = (Classroom)getWorld();
            classroom.setIsQandAAnswered(true);
            if (classroom.getLevelCounter() == 0 && classroom.getQuestionCounter() == 1)
            {
                if (ID == 'C')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("2");
                    grade -= 10;
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 0 && classroom.getQuestionCounter() == 2)
            {
                if (ID == 'B')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("6");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 0 && classroom.getQuestionCounter() == 3)
            {
                if (ID == 'D')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("216");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 1 && classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("The Red Shape");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 1 && classroom.getQuestionCounter() == 2)
            {
                if (ID == 'A')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("Purple");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 1 && classroom.getQuestionCounter() == 3)
            {
                if (ID == 'B')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("Vincent van Gogh");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 1 && classroom.getQuestionCounter() == 4)
            {
                printQuestionIncorrect("T?8a!jxvf@2");
                pointsRemoved();
                isQuestionRight = false;
                changeQuestion();
            }
            if (classroom.getLevelCounter() == 2 && classroom.getQuestionCounter() == 1)
            {
                if (ID == 'D')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("8");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 2 && classroom.getQuestionCounter() == 2)
            {
                if (ID == 'D')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("BA-");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 2 && classroom.getQuestionCounter() == 3)
            {
                if (ID == 'C')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("The amygdala");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 2 && classroom.getQuestionCounter() == 4)
            {
                printQuestionIncorrect("P6pT^q1x!?VYK");
                pointsRemoved();
                isQuestionRight = false;
                changeQuestion();
            }
            if (classroom.getLevelCounter() == 3 && classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("you're");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 3 && classroom.getQuestionCounter() == 2)
            {
                if (ID == 'B')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("your");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 3 && classroom.getQuestionCounter() == 3)
            {
                if (ID == 'D')
                {
                    printQuestionCorrect();
                    isQuestionRight = true;
                    changeQuestion();
                }
                else
                {
                    printQuestionIncorrect("disapointment");
                    pointsRemoved();
                    isQuestionRight = false;
                    changeQuestion();
                }
            }
            if (classroom.getLevelCounter() == 3 && classroom.getQuestionCounter() == 4)
            {
                printQuestionIncorrect("hVm5?)7bc;LWa");
                pointsRemoved();
                isQuestionRight = false;
                changeQuestion();
            }
            if (classroom.getLevelCounter() == 4)
            {
                classroom.showText("run.", classroom.getWidth()/2, classroom.getHeight()/2);
                Greenfoot.delay(10);
                classroom.showText("", classroom.getWidth()/2, classroom.getHeight()/2);
            }
            classroom.removeQandAs();
            ExitDoor.setIsOpen(true);
        }
    }
    
    /**
     * Remove points if a question is wrong.
     */
    public void pointsRemoved()
    {
        FinalLevel finalLevel = (FinalLevel)getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            grade -= 10;
        }
    }
    
    /**
     * Checks if the mouse is hovering over this. If it is, make the image more transparent.
     */
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
            adjTrans(MAX_TRANS/2);
        }
        else
        {
            adjTrans(MAX_TRANS);
        }
    }
    
    /**
     * Changes the transparency of the image if hovered over.
     */
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    
    private void printQuestionCorrect()
    {
        getWorld().showText("Correct! Great Job!", 200, 200);
        Greenfoot.delay(100);
        getWorld().showText("", 200, 200);
    }
    
    private void printQuestionIncorrect(String correctAnswer)
    {
        getWorld().showText("Incorrect. Correct answer is: " + correctAnswer, 200, 200);
        Greenfoot.delay(100);
        getWorld().showText("", 200, 200);
    }
    
    public static boolean getIsQuestionRight()
    {
        return isQuestionRight;
    }
    
    public static void setIsQuestionRight(boolean flag)
    {
        isQuestionRight = flag;
    }

    /**
     * Changes the image of the answer depending on which level/question you're on.
     */
    public void changeQuestion()
    {
        if (classroom.getLevelCounter() == 0)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    setImage(answersL0[0]);
                }
                if (ID == 'B')
                {
                    setImage(answersL0[1]);
                }
                if (ID == 'C')
                {
                    setImage(answersL0[2]);
                }
                if (ID == 'D')
                {
                    setImage(answersL0[3]);
                }
            }
            if (classroom.getQuestionCounter() == 2)
            {
                if (ID == 'A')
                {
                    setImage(answersL0[4]);
                }
                if (ID == 'B')
                {
                    setImage(answersL0[5]);
                }
                if (ID == 'C')
                {
                    setImage(answersL0[6]);
                }
                if (ID == 'D')
                {
                    setImage(answersL0[7]);
                }
            }
            if (classroom.getQuestionCounter() == 3)
            {
                if (ID == 'A')
                {
                    setImage(answersL0[8]);
                }
                if (ID == 'B')
                {
                    setImage(answersL0[9]);
                }
                if (ID == 'C')
                {
                    setImage(answersL0[10]);
                }
                if (ID == 'D')
                {
                    setImage(answersL0[11]);
                }
            }
        }
        if (classroom.getLevelCounter() == 1)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    setImage(answersL1[0]);
                }
                if (ID == 'B')
                {
                    setImage(answersL1[1]);
                }
                if (ID == 'C')
                {
                    setImage(answersL1[2]);
                }
                if (ID == 'D')
                {
                    setImage(answersL1[3]);
                }
            }
            if (classroom.getQuestionCounter() == 2)
            {
                if (ID == 'A')
                {
                    setImage(answersL1[4]);
                }
                if (ID == 'B')
                {
                    setImage(answersL1[5]);
                }
                if (ID == 'C')
                {
                    setImage(answersL1[6]);
                }
                if (ID == 'D')
                {
                    setImage(answersL1[7]);
                }
            }
            if (classroom.getQuestionCounter() == 3)
            {
                if (ID == 'A')
                {
                    setImage(answersL1[8]);
                }
                if (ID == 'B')
                {
                    setImage(answersL1[9]);
                }
                if (ID == 'C')
                {
                    setImage(answersL1[10]);
                }
                if (ID == 'D')
                {
                    setImage(answersL1[11]);
                }
            }
            if (classroom.getQuestionCounter() == 4)
            {
                if (ID == 'A')
                {
                    setImage(answersL1[12]);
                }
                if (ID == 'B')
                {
                    setImage(answersL1[13]);
                }
                if (ID == 'C')
                {
                    setImage(answersL1[14]);
                }
                if (ID == 'D')
                {
                    setImage(answersL1[15]);
                }
            }
        }
        if (classroom.getLevelCounter() == 2)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    setImage(answersL2[0]);
                }
                if (ID == 'B')
                {
                    setImage(answersL2[1]);
                }
                if (ID == 'C')
                {
                    setImage(answersL2[2]);
                }
                if (ID == 'D')
                {
                    setImage(answersL2[3]);
                }
            }
            if (classroom.getQuestionCounter() == 2)
            {
                if (ID == 'A')
                {
                    setImage(answersL2[4]);
                }
                if (ID == 'B')
                {
                    setImage(answersL2[5]);
                }
                if (ID == 'C')
                {
                    setImage(answersL2[6]);
                }
                if (ID == 'D')
                {
                    setImage(answersL2[7]);
                }
            }
            if (classroom.getQuestionCounter() == 3)
            {
                if (ID == 'A')
                {
                    setImage(answersL2[8]);
                }
                if (ID == 'B')
                {
                    setImage(answersL2[9]);
                }
                if (ID == 'C')
                {
                    setImage(answersL2[10]);
                }
                if (ID == 'D')
                {
                    setImage(answersL2[11]);
                }
            }
            if (classroom.getQuestionCounter() == 4)
            {
                if (ID == 'A')
                {
                    setImage(answersL2[12]);
                }
                if (ID == 'B')
                {
                    setImage(answersL2[13]);
                }
                if (ID == 'C')
                {
                    setImage(answersL2[14]);
                }
                if (ID == 'D')
                {
                    setImage(answersL2[15]);
                }
            }
        }
        if (classroom.getLevelCounter() == 3)
        {
            if (classroom.getQuestionCounter() == 1)
            {
                if (ID == 'A')
                {
                    setImage(answersL3[0]);
                }
                if (ID == 'B')
                {
                    setImage(answersL3[1]);
                }
                if (ID == 'C')
                {
                    setImage(answersL3[2]);
                }
                if (ID == 'D')
                {
                    setImage(answersL3[3]);
                }
            }
            if (classroom.getQuestionCounter() == 2)
            {
                if (ID == 'A')
                {
                    setImage(answersL3[4]);
                }
                if (ID == 'B')
                {
                    setImage(answersL3[5]);
                }
                if (ID == 'C')
                {
                    setImage(answersL3[6]);
                }
                if (ID == 'D')
                {
                    setImage(answersL3[7]);
                }
            }
            if (classroom.getQuestionCounter() == 3)
            {
                if (ID == 'A')
                {
                    setImage(answersL3[8]);
                }
                if (ID == 'B')
                {
                    setImage(answersL3[9]);
                }
                if (ID == 'C')
                {
                    setImage(answersL3[10]);
                }
                if (ID == 'D')
                {
                    setImage(answersL3[11]);
                }
            }
            if (classroom.getQuestionCounter() == 4)
            {
                if (ID == 'A')
                {
                    setImage(answersL3[12]);
                }
                if (ID == 'B')
                {
                    setImage(answersL3[12]);
                }
                if (ID == 'C')
                {
                    setImage(answersL3[12]);
                }
                if (ID == 'D')
                {
                    setImage(answersL3[12]);
                }
            }
        }
        if (classroom.getLevelCounter() == 4)
        {
            setImage(answersL4);
        }
    }
    
        // /**
     // * Subtracts points to the current grade.
     // */
    // public int subtractGrade(int points)
    // {
        // points = 10;
        // return points;
    // }
}
