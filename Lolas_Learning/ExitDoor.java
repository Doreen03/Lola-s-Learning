import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitDoor extends Actor
{
    private GreenfootImage closeDoor = new GreenfootImage("door1.png");
    
    private GreenfootImage[] openDoor = {
        new GreenfootImage("door1.png"),
        new GreenfootImage("door2.png"),
        new GreenfootImage("door3.png"),
        new GreenfootImage("door4.png"),
        new GreenfootImage("door5.png"),
        new GreenfootImage("door6.png"),
        new GreenfootImage("door7.png"),
        new GreenfootImage("door8.png"),
        new GreenfootImage("door9.png"),
        new GreenfootImage("door10.png") };
    
    private static boolean isOpen;
    
    public ExitDoor(String world) 
    {
        if (world == "classroom")
        {
            setImage(closeDoor);
            isOpen = false;
        }
        if (world == "hallway")
        {
            setImage(openDoor[9]);
            isOpen = true;
        }
        if (world == "final level")
        {
            setImage(closeDoor);
            isOpen = false;
        }
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
        if (isOpen && getImage() != openDoor[9])
        {
            for (int i = 0; i < openDoor.length; i++)
            {
                setImage(openDoor[i]);
                Greenfoot.delay(10);
            }
        }
    }
}
