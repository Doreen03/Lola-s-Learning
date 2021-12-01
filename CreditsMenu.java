import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsMenu extends MainMenuButtons
{
    public CreditsMenu()
    {
        GreenfootImage creditsButton = new GreenfootImage(200,70);
        Font adjustedFont = new Font(true, false, 30);
        creditsButton.setFont(adjustedFont);
        creditsButton.setColor(Color.BLACK);
        creditsButton.drawString("Credits",0,50);
        setImage(creditsButton);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new CreditsPage());
    }
}
