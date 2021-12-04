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
    
    public Answer(char id)
    {
        ID = id;
    }
    
    /**
     * Act - do whatever the Answer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        checkIfClicked();
    }
    
    public void checkIfClicked()
    {
        Classroom classroom = (Classroom)getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            classroom.removeQandAs();
            ExitDoor.setIsOpen(true);
        }
    }
    
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
    
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    
        public void PointsRemoved()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Scoreboard.Grade = Scoreboard.Grade - 10;
        }
    }
    
    public static void createL0Q1()
    {
        
    }
    
    public static void createL0Q2()
    {
        
    }
    
    public static void createL0Q3()
    {
        
    }
    
    public static void createL0Q4()
    {
        
    }
    
    public static void createL1Q1()
    {
        
    }
    
    public static void createL1Q2()
    {
        
    }
    
    public static void createL1Q3()
    {
        
    }
    
    public static void createL1Q4()
    {
        
    }
    
    public static void createL2Q1()
    {
        
    }
    
    public static void createL2Q2()
    {
        
    }
    
    public static void createL2Q3()
    {
        
    }
    
    public static void createL2Q4()
    {
        
    }
    
    public static void createL3Q1()
    {
        
    }
    
    public static void createL3Q2()
    {
        
    }
    
    public static void createL3Q3()
    {
        
    }
    
    public static void createL3Q4()
    {
        
    }
    
    public static void createL4Q1()
    {
        
    }
    
    public static void createL4Q2()
    {
        
    }
    
    public static void createL4Q3()
    {
        
    }
    
    public static void createL4Q4()
    {
        
    }
    
    public static void createL5Q1()
    {
        
    }
}
