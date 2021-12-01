import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackCredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackCredits extends CreditButtons
{
    public BackCredits()
    {
        GreenfootImage backCreditsButton = new GreenfootImage(200,70);
        Font adjustedFont = new Font(true, false, 30);
        backCreditsButton.setFont(adjustedFont);
        backCreditsButton.setColor(Color.BLACK);
        backCreditsButton.drawString("Back",0,50);
        setImage(backCreditsButton);
    }
    
    public void act()
    {
        checkMouse();
        checkClick(new MainMenu());
    }
}
