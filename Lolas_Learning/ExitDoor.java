import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitDoor extends Door
{
    private GreenfootImage openDoor = new GreenfootImage("lift-open.png");
    private GreenfootImage closeDoor = new GreenfootImage("lift-closed.png");
    private static boolean isOpen;
    
    public ExitDoor() 
    {
        setImage(closeDoor);
        isOpen = false;
    }
    
    /**
     * Act - do whatever the ExitDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        openDoor();
    }
    
    public static boolean getIsOpen()
    {
        return isOpen;
    }
    
    public static void setIsOpen(boolean flag)
    {
        isOpen = flag;
    }
    
    private void openDoor() 
    {
        if (isOpen)
        {
            setImage(openDoor);
        }
    }
}
