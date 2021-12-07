import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsMenu extends MainMenuButtons
{
    GifImage instructions = new GifImage("instructions.gif");
    public void act()
    {
        setImage(instructions.getCurrentImage());
        checkMouse();
        checkClick(new InstructionsPage());
    }
}
