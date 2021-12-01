import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackInstructions extends InstructionButtons
{
    public BackInstructions()
    {
        GreenfootImage backInstructionsButton = new GreenfootImage(200,70);
        Font adjustedFont = new Font(true, false, 30);
        backInstructionsButton.setFont(adjustedFont);
        backInstructionsButton.setColor(Color.BLACK);
        backInstructionsButton.drawString("Back",0,50);
        setImage(backInstructionsButton);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new MainMenu());
    }
}
