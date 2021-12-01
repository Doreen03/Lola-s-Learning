import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsMenu extends MainMenuButtons
{
    public InstructionsMenu()
    {
        GreenfootImage instructionsButton = new GreenfootImage(250,70);
        Font adjustedFont = new Font(true, false, 30);
        instructionsButton.setFont(adjustedFont);
        instructionsButton.setColor(Color.BLACK);
        instructionsButton.drawString("How To Play",0,50);
        setImage(instructionsButton);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new InstructionsPage());
    }
}
